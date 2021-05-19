package com.websitedungcuthethao.controller.dangnhap;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.websitedungcuthethao.entity.NguoiDung;
import com.websitedungcuthethao.service.impl.NguoiDungService;

@Controller
public class QuenMatKhau {
	
	@Autowired
	private NguoiDungService nguoiDungService;
	
	@Autowired
	private SenMail senMail;
	
	private long ranNum=0;
	
	@RequestMapping("/doi-mat-khau/tim-tai-khoan")
	public ModelAndView timTaiKhoan() {
		return new ModelAndView("doimatkhau/timtaikhoan");
	}
	
	@RequestMapping(value = "/doi-mat-khau/timtaikhoan?tenDangNhap={tenDangNhap}",method = RequestMethod.GET)
	public ModelAndView guiMa(@PathVariable(value = "tenDangNhap", required = true)String tenDangNhap) {
		System.out.println(tenDangNhap);
		NguoiDung nguoiDung= nguoiDungService.findOneByTenDangNhap(tenDangNhap);
		if(nguoiDung==null) {
			return new ModelAndView("redirect:/doi-mat-khau/tim-tai-khoan");
		}
		ranNum = ThreadLocalRandom.current().nextLong(100000,999999);
		senMail.SenEmail(nguoiDung.getEmail(), "Mã xác nhận đổi mật khẩu", String.valueOf(ranNum));
		
		return new ModelAndView("doimatkhau/xacnhanma");
		
	}
}
