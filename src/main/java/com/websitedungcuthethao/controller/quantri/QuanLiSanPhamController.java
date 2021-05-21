package com.websitedungcuthethao.controller.quantri;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.websitedungcuthethao.entity.DanhMuc;
import com.websitedungcuthethao.entity.SanPham;
import com.websitedungcuthethao.service.impl.DanhMucService;
import com.websitedungcuthethao.service.impl.SanPhamService;

@Controller
@RequestMapping("/quan-tri/quan-ly-danh-muc")
public class QuanLiSanPhamController {
	@Autowired
	private DanhMucService danhMucService;
	@Autowired
	private SanPhamService sanPhamService;
	
	@GetMapping
	public ModelAndView index() {
		List<DanhMuc>list= danhMucService.findAll();
		return new ModelAndView("quantri/quanlisanpham", "list", list);
	}
	
	
}
