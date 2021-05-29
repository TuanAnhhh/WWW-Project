package com.websitedungcuthethao.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.websitedungcuthethao.entity.SanPham;

public interface SanPhamRepository extends JpaRepository<SanPham, Long> {
	List<SanPham> findByTen(String ten);
	SanPham findById(Long id);
	
	List<SanPham> findByTrangThai(boolean tt, Pageable pageable);
	List<SanPham> findByTrangThaiOrderByGiaAsc(boolean tt, Pageable pageable);
	List<SanPham> findByTrangThaiOrderByGiaDesc(boolean tt, Pageable pageable);
	
	@Query(value = "SELECT TOP 10 *  FROM SANPHAM order by soLuotXem DESC", nativeQuery = true)
	List<SanPham> findDSSanPhamNoiBat();
		
	@Query(value = "SELECT TOP 3 *  FROM SANPHAM order by soLuotXem DESC", nativeQuery = true)
	List<SanPham> findTop3SanPhamBySoLuotXem();
	
	@Query(value = " SELECT TOP 3 *  FROM SANPHAM order by phanTramGiamGia desc", nativeQuery = true)
	List<SanPham> findTop3SanPhamGiamGiaNhieuNhat();
	
	@Query(value = "select * from SanPham sp where sp.danhmucID=:idDM",nativeQuery = true)
	List<SanPham> findByDanhMucID(@Param("idDM") Long idDM);
	
	List<SanPham> findByDanhmucId(Long id, Pageable pageable);
	
	@Query(value = "update SanPham set trangThai=:trangThai where id=:id",nativeQuery = true)
	void setTrangThaiSanPham(@Param("id") Long id, @Param("trangThai") boolean trangThai);
	
}
