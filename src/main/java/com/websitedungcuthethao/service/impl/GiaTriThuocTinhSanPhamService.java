package com.websitedungcuthethao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websitedungcuthethao.entity.GiaTriThuocTinhSanPham;
import com.websitedungcuthethao.entity.SanPham;
import com.websitedungcuthethao.repository.GiaTriThuocTinhSanPhamRepository;
import com.websitedungcuthethao.repository.ThuocTinhSanPhamRepository;
import com.websitedungcuthethao.service.IGiaTriThuocTinhSanPhamService;

@Service
public class GiaTriThuocTinhSanPhamService implements IGiaTriThuocTinhSanPhamService{


	@Autowired
	private GiaTriThuocTinhSanPhamRepository giaTriThuocTinhSanPhamRepository;
	@Autowired
	private ThuocTinhSanPhamRepository thuocTinhSanPhamRepository;
	

	@Override
	public void saveGTTTSP(GiaTriThuocTinhSanPham giaTriThuocTinhSanPham) {
		giaTriThuocTinhSanPhamRepository.save(giaTriThuocTinhSanPham);
	}

	@Override
	public void updateGTTTSP(SanPham sanPham) {
	
	}

	@Override
	public GiaTriThuocTinhSanPham findByIdSanPhamAndIDThuocTinh(Long idSP, Long idTT) {
		return giaTriThuocTinhSanPhamRepository.findBySanPhamIDAndThuocTinhSanPhamID(idSP, idTT);
	}

}
