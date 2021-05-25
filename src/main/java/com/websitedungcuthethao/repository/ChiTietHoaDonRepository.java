package com.websitedungcuthethao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.websitedungcuthethao.entity.ChiTietHoaDon;

public interface ChiTietHoaDonRepository extends JpaRepository<ChiTietHoaDon, Long>{
	
//	@Query(value = "insert into chitiethoadon", nativeQuery = true)
//	void themChiTietHoaDon(ChiTietHoaDon ct);
}
