package com.websitedungcuthethao.controller.dangnhap;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.websitedungcuthethao.entity.NguoiDung;
import com.websitedungcuthethao.service.impl.NguoiDungService;
import com.websitedungcuthethao.util.SenMail;

@Controller
public class QuenMatKhau {

	@Autowired
	private NguoiDungService nguoiDungService;

	@Autowired
	private SenMail senMail;

	private long ranNum = 0;

	@RequestMapping(value = "/doi-mat-khau/tim-tai-khoan", method = RequestMethod.GET)
	public ModelAndView timTaiKhoan() {
		return new ModelAndView("doimatkhau/timtaikhoan");
	}

	@RequestMapping(value = "/doi-mat-khau/tim-tai-khoan", method = RequestMethod.POST)
	public ModelAndView guiMa(@RequestBody String tenDangNhap) {
		System.out.println(tenDangNhap.toString().trim());
		NguoiDung nguoiDung = null;
		try {
			nguoiDung = nguoiDungService.findOneByTenDangNhap(tenDangNhap.toString().trim());
			System.out.println(nguoiDung.getMatKhau());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("err");

		}

		if (nguoiDung == null) {
			return new ModelAndView("redirect:/doi-mat-khau/tim-tai-khoan");
		}
		ranNum = ThreadLocalRandom.current().nextLong(100000, 999999);
		senMail.SenEmail(nguoiDung.getEmail(), "Mã xác nhận đổi mật khẩu", String.valueOf(ranNum));

		return new ModelAndView("doimatkhau/xacnhanma");

	}
}
