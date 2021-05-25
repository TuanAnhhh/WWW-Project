package com.websitedungcuthethao.controller.nguoidung;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.websitedungcuthethao.dto.NguoiDungDTO;
import com.websitedungcuthethao.dto.SanPhamDTO;
import com.websitedungcuthethao.entity.NguoiDung;
import com.websitedungcuthethao.service.impl.HoaDonService;
import com.websitedungcuthethao.service.impl.NguoiDungService;
import com.websitedungcuthethao.util.SecurityUtils;

@Controller
public class ThanhToanController {
	@Autowired
	NguoiDungService nguoiDungService;
	
	@Autowired
	HoaDonService hoaDonService;
	
	@RequestMapping(value = "/thanh-toan", method = RequestMethod.GET)
	public String checkout (Model model) {
		NguoiDungDTO nguoidungDTO = null;
		try {
			nguoidungDTO = SecurityUtils.getPrincipal();
		} catch (Exception e) {
			return "redirect:/dang-nhap";
		}
//		HoaDon hd = new HoaDon(nguoiDungService.findOneByTenDangNhap(nguoidung.getUsername()), false, null,null, null);
//		hoaDonService.saveHoaDon(hd);
		NguoiDung nguoidung = nguoiDungService.findOneByTenDangNhap(nguoidungDTO.getUsername());
		model.addAttribute("nguoidung",nguoidung);
		
		return "nguoidung/thanhtoan";
	}
	@RequestMapping(value = "/thanh-toan", method = RequestMethod.POST)
	public String datHang (Model model) {
		
		
		return "nguoidung/thanhtoan";
	}
}
