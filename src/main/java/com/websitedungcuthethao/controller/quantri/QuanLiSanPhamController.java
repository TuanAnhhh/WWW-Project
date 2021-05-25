package com.websitedungcuthethao.controller.quantri;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.websitedungcuthethao.dto.AbstractDTO;
import com.websitedungcuthethao.entity.DanhMuc;
import com.websitedungcuthethao.entity.SanPham;
import com.websitedungcuthethao.service.impl.DanhMucService;
import com.websitedungcuthethao.service.impl.SanPhamService;

@Controller
@RequestMapping("/quan-tri/quan-ly-san-pham")
public class QuanLiSanPhamController {
	@Autowired
	private DanhMucService danhMucService;
	@Autowired
	private SanPhamService sanPhamService;
	
	@GetMapping
	public String index(Model model, @RequestParam("page") int page,@RequestParam("limit") int limit) {
		List<DanhMuc>list= danhMucService.findAll();
		
		AbstractDTO abstractDTO= new AbstractDTO();
		abstractDTO.setPage(page);
		abstractDTO.setLimit(limit);
		
		
		Pageable pageable=new PageRequest(page -1, limit);
		List<SanPham> dsSanPham= sanPhamService.findAll(pageable);

		abstractDTO.setTotalItem(sanPhamService.getTotalItem());
		abstractDTO.setLimit(limit);
		
		abstractDTO.setTotalPage((int) Math.ceil(abstractDTO.getTotalItem()/abstractDTO.getLimit()));
		
		model.addAttribute("list",list);
		model.addAttribute("abstractDTO",abstractDTO);
		model.addAttribute("dsSanPham", dsSanPham);
		
		
		return"quantri/quanlisanpham";
	}
	
	
}
