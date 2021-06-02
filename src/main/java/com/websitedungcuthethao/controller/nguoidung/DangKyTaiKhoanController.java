package com.websitedungcuthethao.controller.nguoidung;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
import com.websitedungcuthethao.validate.DangKiTaiKhoanValidation;

@Controller
@RequestMapping("/dangky")
public class DangKyTaiKhoanController {
	private NguoiDung nd=null;
	private Long ran=0L;
	@Autowired
	private SenMail senMail;
	@Autowired
	private DangKiTaiKhoanValidation dangKyTaiKhoanValidation;
	
	@Autowired
	NguoiDungService nguoiDungService;
	
	@Autowired
	private LoaiNguoiDungService loaiNguoiDungService;

	@GetMapping
	public String dangKy(Model model) {
		model.addAttribute("nguoiDung",new NguoiDung());
		return "dangkytaikhoan/dangky";
	}
	@PostMapping
	public String xacNhan(Model model, @ModelAttribute NguoiDung nguoiDung,BindingResult bindingResult) {
		dangKyTaiKhoanValidation.validate(nguoiDung, bindingResult);
		if(bindingResult.hasErrors()) {
			model.addAttribute("mesErr","Thông tin đăng ký không hợp lệ");
			return "dangkytaikhoan/dangky";
		}
		
		nd = nguoiDung;
		ran = ThreadLocalRandom.current().nextLong(100000, 999999);
		senMail.SenEmail(nguoiDung.getEmail(), "Mã xác nhận đăng ký","Ma xac nhan dang ky tai khoan ESHOP: "+String.valueOf(ran));
		return "dangkytaikhoan/xacnhanma";
	}
	
	@PostMapping("/luu-nguoi-dung")
	public String themNgStringuoiDung(@ModelAttribute("nguoiDung") NguoiDung nguoiDung,@RequestParam String maXN , Model model) {
		Long ma = null;
		try {
			ma = Long.parseLong(maXN);
		} catch (Exception e) {
			model.addAttribute("mesMaXacNhanSai","Mã xác nhận sai. Vui lòng nhập lại");
			return "dangkytaikhoan/xacnhanma";
		}
		if((long)ma==(long)ran) {
			nd.setLoainguoidung(loaiNguoiDungService.findByTenLoaiNguoiDung(SystemConstant.ROLE_NGUOIDUNG));
			nd.setTrangThai(SystemConstant.ACTIVE_STATUS);
			nd.setMatKhau(BCrypt.hashpw(nd.getMatKhau(), BCrypt.gensalt(12)));
			nd.setNgayTao(LocalDate.now());
			nguoiDungService.saveNguoiDung(nd);
			return "redirect:/dang-nhap";
		}
		
		model.addAttribute("mesMaXacNhanSai","Mã xác nhận sai. Vui lòng nhập lại");
		return "dangkytaikhoan/xacnhanma";
		
	}
	
	
}