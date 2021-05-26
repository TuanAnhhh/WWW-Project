package com.websitedungcuthethao.controller.quantri;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.websitedungcuthethao.dto.AbstractDTO;
import com.websitedungcuthethao.dto.SanPhamDTO;
import com.websitedungcuthethao.dto.ThemSanPhamDTO;
import com.websitedungcuthethao.entity.DanhMuc;
import com.websitedungcuthethao.entity.NhaCungCap;
import com.websitedungcuthethao.entity.SanPham;
import com.websitedungcuthethao.service.impl.DanhMucService;
import com.websitedungcuthethao.service.impl.NhaCungCapService;
import com.websitedungcuthethao.service.impl.SanPhamService;

@Controller
public class QuanLiSanPhamController {
	@Autowired
	private DanhMucService danhMucService;
	@Autowired
	private SanPhamService sanPhamService;
	
	@Autowired
	private NhaCungCapService nhaCungCapService;
	
	@RequestMapping("/quan-tri/quan-ly-san-pham")
	public String index(Model model, @RequestParam("page") int page,@RequestParam("limit") int limit) {
		List<DanhMuc>list= danhMucService.findAll();
		
		AbstractDTO abstractDTO= new AbstractDTO();
		abstractDTO.setPage(page);
		abstractDTO.setLimit(limit);
		
		
		Pageable pageable=new PageRequest(page -1, limit);
		List<SanPham> dsSanPham= sanPhamService.findAll(pageable);

		abstractDTO.setTotalItem(sanPhamService.getTotalItem());
		abstractDTO.setLimit(limit);
		
		abstractDTO.setTotalPage((int) Math.ceil(abstractDTO.getTotalItem()/abstractDTO.getLimit()));
		
		model.addAttribute("list",list);
		model.addAttribute("abstractDTO",abstractDTO);
		model.addAttribute("dsSanPham", dsSanPham);
		
		
		return"quantri/quanlisanpham";
	}

	@RequestMapping("/quan-tri/quan-ly-san-pham/them-san-pham")
	public String themSanPham(Model model) {
		ThemSanPhamDTO sanPham= new ThemSanPhamDTO();
		model.addAttribute("sanPham", sanPham);	
		List<DanhMuc> listDanhMuc= danhMucService.findAll();
		model.addAttribute("listDanhMuc", listDanhMuc);
		List<NhaCungCap> listNhaCungCap= nhaCungCapService.findAll(); 
		model.addAttribute("listNhaCungCap", listNhaCungCap);
		return "quantri/themsanpham";
	}
	
	
	@RequestMapping("/quan-tri/quan-ly-san-pham/them-san-pham/save")
	public String luuSanPham(@ModelAttribute("sanPham") ThemSanPhamDTO sanPham) {
		System.out.println(sanPham.toString());
		System.out.println(sanPham.getTenDanhMuc());
		System.out.println(danhMucService.findByTen(sanPham.getTenDanhMuc()));
		SanPham sp= new SanPham();
		sp.setAnhDaiDien(sanPham.getAnhDaiDien());
		sp.setTen(sanPham.getTen());
		sp.setDanhmuc(danhMucService.findByTen(sanPham.getTenDanhMuc()));
		sp.setNhacungcap(nhaCungCapService.findByTenNhaCungCap(sanPham.getTenNhaCungCap()));
		sp.setMoTa(sanPham.getMoTa());
		sp.setThuongHieu(sanPham.getThuongHieu());
		sp.setNoiDung(sanPham.getNoiDung());
		sp.setGia(sanPham.getGia());
		sp.setPhanTramGiamGia(1);
		sp.setSoLuong(sanPham.getSoLuong());
		sp.setSoLuotMua(0);
		sp.setSoLuotXem(0);
		sp.setThoiGianBaoHanh(sanPham.getThoiGianBaoHanh());
		sp.setTrangThai(true);
		sp.setNgayTao(LocalDate.now());
		
		sanPhamService.save(sp);
		return "redircet:/quan-tri/quan-ly-san-pham";
	}
	
}
