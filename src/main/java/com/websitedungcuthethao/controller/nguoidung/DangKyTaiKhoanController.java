package com.websitedungcuthethao.controller.nguoidung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.websitedungcuthethao.constant.SystemConstant;
import com.websitedungcuthethao.entity.NguoiDung;
import com.websitedungcuthethao.service.impl.LoaiNguoiDungService;
import com.websitedungcuthethao.service.impl.NguoiDungService;

@Controller
@RequestMapping("/dangky")
public class DangKyTaiKhoanController {
	
	@Autowired
	private NguoiDungService nguoiDungService;
	
	@Autowired
	private LoaiNguoiDungService loaiNguoiDungService;

	@GetMapping
	public String dangKy(Model model) {
		model.addAttribute("nguoiDung",new NguoiDung());
		return "dangkytaikhoan/dangky_nguoidung";
	}
	
	@PostMapping
	public String themNguoiDung(@ModelAttribute("nguoiDung") NguoiDung nguoiDung) {		
		nguoiDung.setMatKhau(BCrypt.hashpw(nguoiDung.getMatKhau(), BCrypt.gensalt(12)));
//		nguoiDung.setTrangThai(SystemConstant.ACTIVE_STATUS);
		System.out.println(nguoiDung.getNgaySinh());
//		nguoiDung.setLoainguoidung(loaiNguoiDungService.findByID(SystemConstant.ID_ROLE_NGUOIDUNG));
		nguoiDungService.saveNguoiDung(nguoiDung);
		return "redirect:/dang-nhap";
	}
	
	
}