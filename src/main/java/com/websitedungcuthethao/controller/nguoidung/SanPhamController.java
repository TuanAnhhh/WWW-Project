package com.websitedungcuthethao.controller.nguoidung;

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
import com.websitedungcuthethao.entity.SanPham;
import com.websitedungcuthethao.service.impl.SanPhamService;

@Controller
@RequestMapping(value = "danh-sach-san-pham")
public class SanPhamController {
	
	@Autowired
	private SanPhamService sanPhamService;
	@GetMapping
	public String index (Model model,@RequestParam("page") int page,@RequestParam("limit") int limit) {
		
		System.out.println(1);
		AbstractDTO abstractDTO= new AbstractDTO();
		abstractDTO.setPage(page);
		abstractDTO.setLimit(limit);
		
		
		Pageable pageable=new PageRequest(page, limit);
		List<SanPham> dsSanPham= sanPhamService.findAll(pageable);
		System.out.println(1);
		dsSanPham.forEach(s->{
			System.out.println("rong");
		});
		System.out.println(2);
		model.addAttribute("dsSanPham",dsSanPham); 
		abstractDTO.setTotalItem(sanPhamService.getTotalItem());
		abstractDTO.setLimit(limit);
		
		abstractDTO.setTotalPage((int) Math.ceil(abstractDTO.getTotalItem()/abstractDTO.getLimit()));
		model.addAttribute("abstractDTO",abstractDTO);
		
		return "nguoidung/danhsachsanpham";
	}
//	@GetMapping
//	public String phanTrang(Model model) {
//		
//		System.out.println(1);
//		AbstractDTO abstractDTO= new AbstractDTO();
//		abstractDTO.setPage(1);
//		abstractDTO.setLimit(6);
//		
//		
//		Pageable pageable=new PageRequest(1, 6);
//		List<SanPham> dsSanPham= sanPhamService.findAll(pageable);
//		System.out.println(1);
//		dsSanPham.forEach(s->{
//			System.out.println("rong");
//		});
//		System.out.println(2);
//		model.addAttribute("dsSanPham",dsSanPham); 		
//		return "nguoidung/danhsachsanpham";
//	}
}
