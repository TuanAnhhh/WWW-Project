package com.websitedungcuthethao.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.websitedungcuthethao.entity.ChiTietHoaDon;

public interface ChiTietHoaDonRepository extends CrudRepository<ChiTietHoaDon, Long>{
	
	@Modifying
	@Query(value = "insert into chitiethoadon(hoadonID,sanphamID,giamGia,soLuong) values (:hoadonID,:sanphamID,:giamGia,:soLuong)", nativeQuery = true)
	@Transactional
	void themCTHD(@Param("hoadonID") Long hoadonID, @Param("sanphamID") Long sanphamID, @Param("giamGia") int giamGia,@Param("soLuong") int soLuong);
}
