package com.websitedungcuthethao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.websitedungcuthethao.entity.ThuocTinhSanPham;

public interface ThuocTinhSanPhamRepository extends JpaRepository<ThuocTinhSanPham, Long> {
	ThuocTinhSanPham findOneByTenThuoctinh(String ten);
}
