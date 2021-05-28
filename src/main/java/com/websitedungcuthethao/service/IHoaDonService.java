package com.websitedungcuthethao.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.data.domain.Pageable;

import com.websitedungcuthethao.dto.GiohangSanphamDTO;
import com.websitedungcuthethao.entity.HoaDon;

public interface IHoaDonService {
	void saveHoaDon(HoaDon hoaDon);
	HoaDon findById(Long id);
	void themDSChiTietHoaDon(Long idHD,HashMap<Long, GiohangSanphamDTO> gioHang);
	List<HoaDon> findAllByTrangThaiAndPaging(boolean tt, Pageable pageable);
	Long getTotalItem();
}
