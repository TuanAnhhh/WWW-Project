package com.websitedungcuthethao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.websitedungcuthethao.entity.SanPham;

public interface SanPhamRepository extends JpaRepository<SanPham, Long> {
	List<SanPham> findByTen(String ten);
	SanPham findById(Long id);
		
	@Query(value = "SELECT TOP 3 *  FROM SANPHAM order by soLuotXem DESC", nativeQuery = true)
	List<SanPham> findTop3SanPhamBySoLuotXem();
	
	@Query(value = " SELECT TOP 3 *  FROM SANPHAM order by gia-giaGiam desc", nativeQuery = true)
	List<SanPham> findTop3SanPhamGiamGiaNhieuNhat();
	
	@Query(value = "select * from SanPham sp where sp.danhmucID=:idDM",nativeQuery = true)
	List<SanPham> findByDanhMuc(@Param("idDM") Long idDM);
}
