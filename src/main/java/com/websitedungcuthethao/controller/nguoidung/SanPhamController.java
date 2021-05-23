package com.websitedungcuthethao.controller.nguoidung;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.websitedungcuthethao.dto.AbstractDTO;
import com.websitedungcuthethao.entity.SanPham;
import com.websitedungcuthethao.service.ISanPhamService;

@Controller

public class SanPhamController {
	
	@Autowired
	private ISanPhamService sanPhamService;
	@RequestMapping("danh-sach-san-pham")
	public String index (Model model,@RequestParam("page") int page,@RequestParam("limit") int limit) {
		AbstractDTO abstractDTO= new AbstractDTO();
		abstractDTO.setPage(page);
		abstractDTO.setLimit(limit);
		
		
		Pageable pageable=new PageRequest(1, 6);
		List<SanPham> dsSanPham= sanPhamService.findAll(pageable);
		
		model.addAttribute("dsSanPham",dsSanPham); 
		abstractDTO.setTotalItem(sanPhamService.getTotalItem());
		abstractDTO.setLimit(limit);
		
		abstractDTO.setTotalPage((int) Math.ceil(abstractDTO.getTotalItem()/abstractDTO.getLimit()));
		model.addAttribute("abstractDTO",abstractDTO);
		
		return "nguoidung/danhsachsanpham";
	}

}
