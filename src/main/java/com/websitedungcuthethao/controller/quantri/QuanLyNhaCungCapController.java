package com.websitedungcuthethao.controller.quantri;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.websitedungcuthethao.dto.AbstractDTO;
import com.websitedungcuthethao.entity.NhaCungCap;
import com.websitedungcuthethao.service.impl.NhaCungCapService;

@Controller
@RequestMapping("/quan-tri/nha-cung-cap")
public class QuanLyNhaCungCapController {
	private NhaCungCap ncc=null;
	@Autowired
	private NhaCungCapService nhaCungCapService;
	
	@GetMapping
	public String index(Model model, @RequestParam("page") int page,@RequestParam("limit") int limit) {
		AbstractDTO abstractDTO= new AbstractDTO();
		abstractDTO.setPage(page);
		abstractDTO.setLimit(limit);
		Pageable pageable=new PageRequest(page -1, limit);
		List<NhaCungCap> listNCC= nhaCungCapService.findAllAndPaging(pageable);
		abstractDTO.setTotalItem((long) listNCC.size());
		abstractDTO.setLimit(limit);
		abstractDTO.setTotalPage((int) Math.ceil(abstractDTO.getTotalItem()/abstractDTO.getLimit()));
		model.addAttribute("listNCC",listNCC);
		model.addAttribute("abstractDTO",abstractDTO);
		return"quantri/quanlynhacungcap";
	}
	
	
	@GetMapping("/xoa-nha-cung-cap/{id}")
	public String xoaNhaCungCap(@PathVariable Long id) {
		NhaCungCap nhaCungCap=nhaCungCapService.findNCCByID(id);
		nhaCungCapService.deleteNCC(nhaCungCap);
		return"redirect:/quan-tri/nha-cung-cap?page=1&limit=3";
	}
	
	@GetMapping("/sua-nha-cung-cap/{id}")
	public String formSuaNhaCungCap(Model model,@PathVariable Long id) {
		NhaCungCap nhaCungCap=nhaCungCapService.findNCCByID(id);
		ncc=nhaCungCap;
		model.addAttribute("nhaCungCap", nhaCungCap);
		return "quantri/suanhacungcap";
	}
	@PostMapping("/sua-nha-cung-cap/luu-thong-tin")
	public String luuThongTin(@ModelAttribute NhaCungCap nhaCungCap) {
		ncc.setDiachi(nhaCungCap.getDiachi());
		ncc.setEmail(nhaCungCap.getEmail());
		ncc.setSoDienThoai(nhaCungCap.getSoDienThoai());
		ncc.setTenNhaCungCap(nhaCungCap.getTenNhaCungCap());
		nhaCungCapService.updateNCC(ncc);
		return "redirect:/quan-tri/nha-cung-cap?page=1&limit=3";
	}
	@GetMapping("/them-nha-cung-cap")
	public String formThemNhaCungCap(Model model) {
		model.addAttribute("nhaCungCap", new NhaCungCap());
		return "quantri/themnhacungcap";
	}
	
	@PostMapping("/them-nha-cung-cap")
	public String formThemNhaCungCap(@ModelAttribute NhaCungCap nhaCungCap) {
		nhaCungCapService.saveNCC(nhaCungCap);
		return "redirect:/quan-tri/nha-cung-cap?page=1&limit=3";
	}
}