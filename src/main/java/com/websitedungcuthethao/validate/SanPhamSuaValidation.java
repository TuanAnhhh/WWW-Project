package com.websitedungcuthethao.validate;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.websitedungcuthethao.entity.SanPham;

@Component
public class SanPhamSuaValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return SanPham.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		if(!supports(target.getClass()))
			return ;
		
		SanPham sanPham= (SanPham) target;
		
		String ten=sanPham.getTen();
		if(ten.equals("")) {
			errors.rejectValue("ten", null, "Tên sản phẩm không được để trống");
		}
		
		String anhDaiDien=sanPham.getAnhDaiDien();
		
		if(anhDaiDien.equals("")) {
			errors.rejectValue("anhDaiDien", null, "Chưa chọn ảnh đại diện");
		}
		
		
		try {
			double gia=sanPham.getGia();
		} catch (Exception e) {
			errors.rejectValue("gia", null, "Giá sản phẩm phải là chữ số");
		}
		String moTa=sanPham.getMoTa();
		if(moTa.equals("")) {
			errors.rejectValue("moTa", null, "Mô tả sản phẩm không được để trống");
		}
		String noiDung=sanPham.getNoiDung();
		if(noiDung.equals("")) {
			errors.rejectValue("noiDung", null, "Nội dung sản phẩm không được để trống");
		}
		
		try {
			double phanTramgiamGia=sanPham.getPhanTramGiamGia();
		} catch (Exception e) {
			errors.rejectValue("phanTramgiamGia", null, "phầm trăm giảm giá sản phẩm phải là chữ số");
		}
		
		try {
			int thoiGianBaoHanh=sanPham.getThoiGianBaoHanh();
		} catch (Exception e) {
			errors.rejectValue("thoiGianBaoHanh", null, "thời gian bảo hành sản phẩm phải là chữ số");
		}
		
		String thuongHieu=sanPham.getThuongHieu();
		if(thuongHieu.equals("")) {
			errors.rejectValue("thuongHieu", null, "Thương hiệu sản phẩm không được để trống");
		}
		
	}

}