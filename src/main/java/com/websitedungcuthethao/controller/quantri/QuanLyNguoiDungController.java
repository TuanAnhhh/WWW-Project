package com.websitedungcuthethao.controller.quantri;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.websitedungcuthethao.constant.SystemConstant;
import com.websitedungcuthethao.dto.AbstractDTO;
import com.websitedungcuthethao.entity.DanhMuc;
import com.websitedungcuthethao.entity.NguoiDung;
import com.websitedungcuthethao.entity.SanPham;
import com.websitedungcuthethao.service.impl.NguoiDungService;

@Controller
@RequestMapping("/quan-tri/quan-ly-nguoi-dung")
public class QuanLyNguoiDungController {
	@Autowired
	private NguoiDungService nguoiDungService;
	
	@GetMapping
	public String index(Model model, @RequestParam("page") int page,@RequestParam("limit") int limit) {
		
		
		AbstractDTO abstractDTO= new AbstractDTO();
		abstractDTO.setPage(page);
		abstractDTO.setLimit(limit);
		
		
		Pageable pageable=new PageRequest(page -1, limit);
		List<NguoiDung> listNguoiDung= nguoiDungService.findAllAndPaging(pageable);

		abstractDTO.setTotalItem(nguoiDungService.getTotalItem());
		abstractDTO.setLimit(limit);
		
		abstractDTO.setTotalPage((int) Math.ceil(abstractDTO.getTotalItem()/abstractDTO.getLimit())+1);
		System.out.println(abstractDTO.toString());
		model.addAttribute("abstractDTO",abstractDTO);
		model.addAttribute("listNguoiDung", listNguoiDung);
		
		
		return"quantri/quanlynguoidung";
	}
	
	@RequestMapping("/sua-trang-thai/{id}")
	public ModelAndView suaTrangThaiNguoiDung(@PathVariable Long id) {
		NguoiDung nd= nguoiDungService.findById(id);
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
