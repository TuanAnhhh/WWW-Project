package com.websitedungcuthethao.controller.nguoidung;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.websitedungcuthethao.dto.GiohangSanphamDTO;
import com.websitedungcuthethao.dto.NguoiDungDTO;
import com.websitedungcuthethao.dto.SanPhamDTO;
import com.websitedungcuthethao.entity.HoaDon;
import com.websitedungcuthethao.entity.NguoiDung;
import com.websitedungcuthethao.service.impl.ChiTietHoaDonService;
import com.websitedungcuthethao.service.impl.HoaDonService;
import com.websitedungcuthethao.service.impl.NguoiDungService;
import com.websitedungcuthethao.util.SecurityUtils;

@Controller
public class ThanhToanController {
	@Autowired
	NguoiDungService nguoiDungService;
	
	@Autowired
	HoaDonService hoaDonService;
		
	NguoiDung nguoidung = null;
	
	@RequestMapping(value = "/thanh-toan", method = RequestMethod.GET)
	public String checkout (Model model) {
		NguoiDungDTO nguoidungDTO = null;
		try {
			nguoidungDTO = SecurityUtils.getPrincipal();
		} catch (Exception e) {
			return "redirect:/dang-nhap";
		}

		nguoidung = nguoiDungService.findOneByTenDangNhap(nguoidungDTO.getUsername());
		model.addAttribute("nguoidung",nguoidung);
		
		return "nguoidung/thanhtoan";
	}
	@RequestMapping(value = "/thanh-toan", method = RequestMethod.POST)
	public String datHang (Model model, HttpSession session) {
		
		int soLuongSp = (int) session.getAttribute("tongSoLuongGioHang");
		double tongTienHD = (double) session.getAttribute("tongThanhTienGioHang");
		HoaDon hd = new HoaDon(nguoiDungService.findOneByTenDangNhap(nguoidung.getTenDangNhap()),false,null,null,null,soLuongSp,tongTienHD);
		hoaDonService.saveHoaDon(hd);
		
		HashMap<Long, GiohangSanphamDTO> dsSanPhamGioHang  = (HashMap<Long, GiohangSanphamDTO>) session.getAttribute("gioHang");
		hoaDonService.themDSChiTietHoaDon(hd.getId(), dsSanPhamGioHang);
		
		session.removeAttribute("gioHang");
		session.removeAttribute("tongSoLuongGioHang");
		session.removeAttribute("tongThanhTienGioHang");
		return "nguoidung/thong_bao_dat_hang";
	}
}
