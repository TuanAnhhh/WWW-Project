package com.websitedungcuthethao.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websitedungcuthethao.dto.GiohangSanphamDTO;
import com.websitedungcuthethao.entity.ChiTietHoaDon;
import com.websitedungcuthethao.repository.ChiTietHoaDonRepository;
import com.websitedungcuthethao.repository.SanPhamRepository;
import com.websitedungcuthethao.service.IChiTietHoaDonService;

@Transactional
@Service
public class ChiTietHoaDonService  implements IChiTietHoaDonService{
	@Autowired 
	ChiTietHoaDonRepository chiTietHoaDonRepository;

	@Override
	public void saveCTHD(ChiTietHoaDon chiTietHoaDon) {
		chiTietHoaDonRepository.save(chiTietHoaDon);
	}

}
