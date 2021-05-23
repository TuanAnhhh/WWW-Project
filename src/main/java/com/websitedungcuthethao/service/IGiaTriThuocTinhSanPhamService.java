package com.websitedungcuthethao.service;

import com.websitedungcuthethao.entity.GiaTriThuocTinhSanPham;
import com.websitedungcuthethao.entity.SanPham;

public interface IGiaTriThuocTinhSanPhamService {
	void saveGTTTSP(GiaTriThuocTinhSanPham giaTriThuocTinhSanPham);
	void updateGTTTSP(SanPham sanPham);
	GiaTriThuocTinhSanPham findByIdSanPhamAndIDThuocTinh(Long idSP,Long idTT);
}
