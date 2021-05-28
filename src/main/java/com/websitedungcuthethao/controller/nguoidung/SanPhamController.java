package com.websitedungcuthethao.controller.nguoidung;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.websitedungcuthethao.dto.AbstractDTO;
import com.websitedungcuthethao.entity.SanPham;
import com.websitedungcuthethao.service.impl.SanPhamService;

@Controller
@RequestMapping(value = "danh-sach-san-pham")
public class SanPhamController {
	
	@Autowired
	private SanPhamService sanPhamService;
	@GetMapping
	public String index (Model model, @RequestParam("page") int page,@RequestParam("limit") int limit) {
		
		AbstractDTO abstractDTO= new AbstractDTO();
		abstractDTO.setPage(page);
		abstractDTO.setLimit(limit);
		
		
		Pageable pageable=new PageRequest(page -1, limit);
		List<SanPham> dsSanPham= sanPhamService.findAll(pageable);

		abstractDTO.setTotalItem(sanPhamService.getTotalItem());
		abstractDTO.setLimit(limit);
		
		abstractDTO.setTotalPage((int) Math.ceil(abstractDTO.getTotalItem()/abstractDTO.getLimit())+1);
		System.out.println(abstractDTO.toString());
		model.addAttribute("abstractDTO",abstractDTO);
		model.addAttribute("dsSanPham", dsSanPham);
		return "nguoidung/danhsachsanpham";
	}
	
	@GetMapping("danh-muc/{id}")
	public String getDsSanPhamByDanhMuc(@PathVariable Long id, Model model, @RequestParam("page") int page,@RequestParam("limit") int limit) {
		
		AbstractDTO abstractDTO= new AbstractDTO();
		abstractDTO.setPage(page);
		abstractDTO.setLimit(limit);
		
		
		Pageable pageable=new PageRequest(page -1, limit);
		List<SanPham> dsSanPham= sanPhamService.findByDanhMucIDAndPaging(id, pageable);
		abstractDTO.setTotalItem(sanPhamService.getTotalItem());
		abstractDTO.setLimit(limit);
		
		abstractDTO.setTotalPage((int) Math.ceil(abstractDTO.getTotalItem()/abstractDTO.getLimit())+1);
		model.addAttribute("abstractDTO",abstractDTO);
		model.addAttribute("dsSanPham", dsSanPham);
//		return "redirect:/danh-sach-san-pham?page=1&limit=3";
		return "nguoidung/danhsachsanpham";
	}
	@GetMapping("sap-xep/{value}")
	public String sapXep(@PathVariable String value, Model model) {
		AbstractDTO abstractDTO= new AbstractDTO();
//		abstractDTO.setPage(page);
//		abstractDTO.setLimit(limit);
		
		
//		List<SanPham> dsSanPham= sanPhamService.findAll(pageable);

		abstractDTO.setTotalItem(sanPhamService.getTotalItem());
//		abstractDTO.setLimit(limit);
		
		abstractDTO.setTotalPage((int) Math.ceil(abstractDTO.getTotalItem()/abstractDTO.getLimit())+1);
		System.out.println(abstractDTO.toString());
		model.addAttribute("abstractDTO",abstractDTO);
//		model.addAttribute("dsSanPham", dsSanPham);
		
		return "nguoidung/danhsachsanpham";
	}
}
