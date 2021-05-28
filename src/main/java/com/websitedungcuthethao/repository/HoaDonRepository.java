package com.websitedungcuthethao.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.websitedungcuthethao.entity.HoaDon;
import com.websitedungcuthethao.entity.SanPham;

public interface HoaDonRepository extends JpaRepository<HoaDon, Long> {
	List<HoaDon> findByTrangThai(boolean tt, Pageable pageable);

}
