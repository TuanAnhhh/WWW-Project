package com.websitedungcuthethao.controller.dangnhap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.websitedungcuthethao.dto.NguoiDungDTO;
import com.websitedungcuthethao.entity.NguoiDung;
import com.websitedungcuthethao.service.impl.NguoiDungService;
import com.websitedungcuthethao.util.SecurityUtils;

@Controller
public class DangNhap {
	

	
	@RequestMapping(value = "/dang-nhap", method = RequestMethod.GET)
	public String index() {
		

		
		return "dangnhap/dangnhap";
	}
	@RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
	public String accessDenied() {
		return "redirect:/dang-nhap?accessDenied";
	}
	
}
