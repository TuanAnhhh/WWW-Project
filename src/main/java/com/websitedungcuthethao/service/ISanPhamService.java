package com.websitedungcuthethao.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.websitedungcuthethao.entity.SanPham;

public interface ISanPhamService {
	List<SanPham> findAllAndPaging(Pageable pageable);
	List<SanPham> findByTen(String ten);
	void deleteById(Long id);
	void save (SanPham sanPham);
	SanPham findById(Long id);
	void updateSanPham(SanPham sanPham);
	List<SanPham> findTop3SanPhamBySoLuotXem();
	List<SanPham> findDSSanPhamNoiBat();
	List<SanPham> findTop3SanPhamGiamGiaNhieuNhat();
	List<SanPham> findByDanhMucID(Long idDM);
	Long getTotalItem();
	void setTrangThaiSanPham(Long id, boolean tt);
	
	List<SanPham> findAllByTrangThaiAndPaging(boolean tt, Pageable pageable);
	
//	List<SanPham> findByDanhMucID(Long id,Pageable pageable);
}
