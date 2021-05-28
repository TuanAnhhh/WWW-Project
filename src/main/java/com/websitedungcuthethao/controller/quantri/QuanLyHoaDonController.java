package com.websitedungcuthethao.controller.quantri;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.websitedungcuthethao.constant.SystemConstant;
import com.websitedungcuthethao.dto.AbstractDTO;
import com.websitedungcuthethao.entity.HoaDon;
import com.websitedungcuthethao.service.impl.HoaDonService;

@Controller
@RequestMapping("/quan-tri/quan-ly-hoa-don")
public class QuanLyHoaDonController {
	@Autowired
	HoaDonService hoaDonService;
	
	@GetMapping
	public String index(Model model, @RequestParam("page") int page,@RequestParam("limit") int limit) {
		
		AbstractDTO abstractDTO= new AbstractDTO();
		abstractDTO.setPage(page);
		abstractDTO.setLimit(limit);
		
		
		Pageable pageable=new PageRequest(page -1, limit);
		List<HoaDon> dsHD= hoaDonService.findAllByTrangThaiAndPaging(SystemConstant.INACTIVE_STATUS, pageable);

		abstractDTO.setTotalItem(hoaDonService.getTotalItem());
		abstractDTO.setLimit(limit);
		
		abstractDTO.setTotalPage((int) Math.ceil(abstractDTO.getTotalItem()/abstractDTO.getLimit())+1);
		model.addAttribute("abstractDTO",abstractDTO);
		model.addAttribute("dsHD", dsHD);
		
		
		return"quantri/quanlyhoadon";
	}
}
