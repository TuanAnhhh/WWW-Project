package com.websitedungcuthethao.controller.nguoidung;

import java.util.Set;

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
	private Long idND=null;
	
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
		
		
		System.out.println(nguoidung.getId());
		Set<DiaChi> listDC=nguoidung.getDsDiaChi();
		System.out.println(listDC);
		String messeage="";
		for (DiaChi diaChi : listDC) {
			messeage+=diaChi.toString()+"\n";
		}
		model.addAttribute("message",messeage);
		
		
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
	public String doiMatKhau(@PathVariable Long id,@RequestParam String matkhau,@RequestParam String xacnhanmatkhau ,Model model) {
		NguoiDung nguoiDung= nguoiDungService.findById(id);
		System.out.println(matkhau);
		System.out.println(xacnhanmatkhau);
		if(matkhau.equals(xacnhanmatkhau)) {
			System.out.println(1);
			nguoiDung.setMatKhau(BCrypt.hashpw(matkhau, BCrypt.gensalt(12)));
			nguoiDungService.UpdateNguoiDung(nguoiDung);
			System.out.println(1);
			return "redirect:/trang-chu";
		}
		return "redirect:/doi-mat-khau/"+nguoiDung.getId();
		
	}
	
//	them-dia-chi/${nguoidung.id}
	
	@RequestMapping("/them-dia-chi/{id}")
	public String formThemDiaChi(@PathVariable Long id,Model model) {
		model.addAttribute("id", id);
		idND=id;
		return "nguoidung/themdiachi";
	}
	
	@PostMapping("/them-dia-chi/luu-dia-chi")
	public String luuDiaChi(@RequestParam String soNha,@RequestParam String quanHuyen, @RequestParam String tinhThanhPho) {
		System.out.println(soNha);
		System.out.println(quanHuyen);
		System.out.println(tinhThanhPho);
		System.out.println(1);
		if(soNha!=null && quanHuyen!=null && tinhThanhPho!=null) {
			 diaChiService.themDiaChi(quanHuyen, soNha, tinhThanhPho, idND);
			 return "redirect:/thong-tin-tai-khoan";
		 }
		
		return "redirect:/them-dia-chi/"+idND;
	}
}
