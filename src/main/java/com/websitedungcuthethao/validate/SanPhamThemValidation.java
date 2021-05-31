package com.websitedungcuthethao.validate;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.websitedungcuthethao.dto.ThemSanPhamDTO;


@Component
public class SanPhamThemValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return ThemSanPhamDTO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		if(!supports(getClass()))
			return ;
		
		ThemSanPhamDTO sanPhamDTO=(ThemSanPhamDTO) target;
		
		String ten=sanPhamDTO.getTen();
		if(ten.equals("")) {
			errors.rejectValue("ten", null, "Tên sản phẩm không được để trống");
		}
		
		CommonsMultipartFile anhDaiDien=sanPhamDTO.getAnhDaiDien();
		
		if(anhDaiDien.getOriginalFilename().equals("")) {
			errors.rejectValue("anhDaiDien", null, "Chưa chọn ảnh đại diện");
		}
		
		
		try {
			double gia=sanPhamDTO.getGia();
		} catch (Exception e) {
			errors.rejectValue("gia", null, "Giá sản phẩm phải là chữ số");
		}
		String moTa=sanPhamDTO.getMoTa();
		if(moTa.equals("")) {
			errors.rejectValue("moTa", null, "Mô tả sản phẩm không được để trống");
		}
		String noiDung=sanPhamDTO.getNoiDung();
		if(noiDung.equals("")) {
			errors.rejectValue("noiDung", null, "Nội dung sản phẩm không được để trống");
		}
		
		try {
			int soLuong=sanPhamDTO.getSoLuong();
		} catch (Exception e) {
			errors.rejectValue("soLuong", null, "Số lượng phẩm phải là chữ số");
		}
		
		try {
			int thoiGianBaoHanh=sanPhamDTO.getThoiGianBaoHanh();
		} catch (Exception e) {
			errors.rejectValue("thoiGianBaoHanh", null, "thời gian bảo hành sản phẩm phải là chữ số");
		}
		
		String giaTriThuocTinh=sanPhamDTO.getGiaTriThuocTinh();
		if(giaTriThuocTinh.equals("")) {
			errors.rejectValue("giaTriThuocTinh", null, "Giá trị thuộc tính sản phẩm không được để trống");
		}
		
		String thuongHieu=sanPhamDTO.getThuongHieu();
		if(giaTriThuocTinh.equals("")) {
			errors.rejectValue("thuongHieu", null, "Thương hiệu sản phẩm không được để trống");
		}
	}

}
