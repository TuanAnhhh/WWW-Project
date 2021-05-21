package com.websitedungcuthethao.controller.quantri;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.websitedungcuthethao.constant.SystemConstant;
import com.websitedungcuthethao.entity.NguoiDung;
import com.websitedungcuthethao.service.impl.NguoiDungService;

@Controller
@RequestMapping("/quan-tri/quan-ly-nguoi-dung")
public class NguoiDungController {
	@Autowired
	private NguoiDungService nguoiDungService;
	@GetMapping
	public ModelAndView index() {
		List<NguoiDung> list= nguoiDungService.findAll();
		
		return new ModelAndView("quantri/danhsachnguoidung", "list", list);
	}
	
	@RequestMapping("/sua-trang-thai/{id}")
	public ModelAndView suaTrangThaiNguoiDung(@PathVariable Long id) {
		NguoiDung nd= nguoiDungService.findById(id);
		System.out.println(1);
		if(nd.isTrangThai()) {
			nd.setTrangThai(SystemConstant.INACTIVE_STATUS);
			
			System.out.println(nd.isTrangThai()+"");
		}else {
			nd.setTrangThai(SystemConstant.ACTIVE_STATUS);
		}
		nguoiDungService.UpdateNguoiDung(nd);
		
		return new ModelAndView("redirect:/quan-tri/quan-ly-nguoi-dung");
	}
	
}
