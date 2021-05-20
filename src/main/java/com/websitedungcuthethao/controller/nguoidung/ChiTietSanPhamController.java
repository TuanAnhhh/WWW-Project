package com.websitedungcuthethao.controller.nguoidung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.websitedungcuthethao.entity.SanPham;
import com.websitedungcuthethao.service.impl.SanPhamService;

@Controller
@RequestMapping("/chi-tiet-san-pham/{id}")
public class ChiTietSanPhamController {
	@Autowired
	SanPhamService sanPhamSV;
	
	@GetMapping
	public String index(@PathVariable Long id ,Model model) {		
		SanPham sp = sanPhamSV.findById(id);
		model.addAttribute("sp",sp);
		
		return "nguoidung/chitietsanpham";
	}

}
