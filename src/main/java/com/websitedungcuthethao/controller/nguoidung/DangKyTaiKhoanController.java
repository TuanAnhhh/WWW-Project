package com.websitedungcuthethao.controller.nguoidung;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.websitedungcuthethao.constant.SystemConstant;
import com.websitedungcuthethao.entity.NguoiDung;
import com.websitedungcuthethao.service.impl.LoaiNguoiDungService;
import com.websitedungcuthethao.service.impl.NguoiDungService;
import com.websitedungcuthethao.util.SenMail;

@Controller
@RequestMapping("/dangky")
public class DangKyTaiKhoanController {
	private NguoiDung nd=null;
	private Long ran=0L;
	@Autowired
	private SenMail senMail;
	
	@Autowired
	NguoiDungService nguoiDungService;
	
	@Autowired
	private LoaiNguoiDungService loaiNguoiDungService;

	@GetMapping
	public String dangKy(Model model) {
		model.addAttribute("nguoiDung",new NguoiDung());
		return "dangkytaikhoan/dangky";
	}
	@PostMapping("/xac-nhan")
	public String xacNhan(Model model, @ModelAttribute("nguoiDung") NguoiDung nguoiDung) {
		nd = nguoiDung;
		System.out.println(nd.toString());
		ran = ThreadLocalRandom.current().nextLong(100000, 999999);
		senMail.SenEmail(nguoiDung.getEmail(), "Mã xác nhận đăng ký", String.valueOf(ran));
		return "dangkytaikhoan/xacnhanma";
	}
	
	@PostMapping("/luu-nguoi-dung")
	public String themNgStringuoiDung(@ModelAttribute("nguoiDung") NguoiDung nguoiDung,@RequestParam Long maXN ) {
	
		System.out.println(ran);
		System.out.println(maXN);
		if((long)maXN==(long)ran) {
			nd.setLoainguoidung(loaiNguoiDungService.findByTenLoaiNguoiDung(SystemConstant.ROLE_NGUOIDUNG));
			nd.setTrangThai(SystemConstant.ACTIVE_STATUS);
			nd.setMatKhau(BCrypt.hashpw(nd.getMatKhau(), BCrypt.gensalt(12)));
			nguoiDungService.saveNguoiDung(nd);
			return "redirect:/dang-nhap";
		}
		return "redirect:/dangky/xac-nhan";
		
	}
	
	
}