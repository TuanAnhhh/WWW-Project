package com.websitedungcuthethao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.websitedungcuthethao.entity.DiaChi;

public interface DiaChiRepository extends JpaRepository<DiaChi, Long> {
	
	@Query(value = "SELECT * FROM DIACHI WHERE NGUOIDUNGID = ?1",nativeQuery = true)
	List<DiaChi> findByNguoiDungID(Long nguoidungID);
}
