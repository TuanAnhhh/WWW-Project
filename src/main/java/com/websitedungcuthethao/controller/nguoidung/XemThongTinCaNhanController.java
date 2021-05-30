package com.websitedungcuthethao.controller.nguoidung;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.websitedungcuthethao.dto.NguoiDungDTO;
import com.websitedungcuthethao.entity.DiaChi;
import com.websitedungcuthethao.entity.NguoiDung;
import com.websitedungcuthethao.service.impl.DiaChiService;
import com.websitedungcuthethao.service.impl.NguoiDungService;
import com.websitedungcuthethao.util.SecurityUtils;

@Controller
public class XemThongTinCaNhanController {
	@Autowired
	NguoiDungService nguoiDungService;
	
	@Autowired
	private DiaChiService diaChiService;

	
	@RequestMapping(value = "/thong-tin-tai-khoan",method = RequestMethod.GET)
	public String xemThongTin(Model  model) {
		System.out.println(1);
		NguoiDungDTO nguoidungDTO = null;
		try {
			nguoidungDTO = SecurityUtils.getPrincipal();
		} catch (Exception e) {
			return "redirect:/dang-nhap";
		}
		NguoiDung nguoidung = nguoiDungService.findOneByTenDangNhap(nguoidungDTO.getUsername());
		
		
//		System.out.println(nguoidung.getId());
//		List<DiaChi> listDC=diaChiService.findByNguoiDungID(nguoidung.getId());
//		System.out.println(listDC);
//		String messeage="";
//		for (DiaChi diaChi : listDC) {
//			messeage+=diaChi.toString()+"\n";
//		}
//		model.addAttribute("messeage",messeage);
		
		
		model.addAttribute("nguoidung",nguoidung);
		return "nguoidung/thongtintaikhoan";
	}
	
	@RequestMapping("/doi-mat-khau/{id}")
	public String formDoiMatKhau(@PathVariable Long id,Model model) {
		model.addAttribute("id", id);
		String matkhau="";
		String xacnhanmatkhau="";
		
		model.addAttribute("matkhau", matkhau);
		model.addAttribute("xacnhanmatkhau", xacnhanmatkhau);
		return "nguoidung/doimatkhau";
	}
	
	@PostMapping("/doi-mat-khau/{id}")
	public String doiMatKhau(@PathVariable Long id,@RequestParam String matkhau,@RequestParam String xacnhanmatkhau ,Model model,@RequestParam String message) {
		NguoiDung nguoiDung= nguoiDungService.findById(id);
		System.out.println(matkhau);
		System.out.println(xacnhanmatkhau);
		if(matkhau.trim()==xacnhanmatkhau.trim()) {
			System.out.println(1);
			nguoiDung.setMatKhau(BCrypt.hashpw(matkhau, BCrypt.gensalt(12)));
			nguoiDungService.UpdateNguoiDung(nguoiDung);
			System.out.println(1);
			return "redirect:/trang-chu";
		}
	
		return "redirect:/doi-mat-khau/{id}";
		
	}
	

}
