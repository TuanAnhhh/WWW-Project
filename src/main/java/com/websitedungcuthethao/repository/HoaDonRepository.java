package com.websitedungcuthethao.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.websitedungcuthethao.entity.HoaDon;

public interface HoaDonRepository extends JpaRepository<HoaDon, Long> {
	List<HoaDon> findByTrangThai(boolean tt, Pageable pageable);
	
	@Query(value = "update HoaDon set trangThai=:trangThai where id=:id",nativeQuery = true)
	void setTrangThaiHoaDon(@Param("id") Long id, @Param("trangThai") boolean trangThai);


}
