package com.websitedungcuthethao.service;

import java.util.HashMap;

import com.websitedungcuthethao.dto.GiohangSanphamDTO;
import com.websitedungcuthethao.entity.HoaDon;

public interface IHoaDonService {
	void saveHoaDon(HoaDon hoaDon);
	HoaDon findById(Long id);
	void themDSChiTietHoaDon(Long idHD,HashMap<Long, GiohangSanphamDTO> gioHang);
}
