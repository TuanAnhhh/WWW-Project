package com.websitedungcuthethao.validate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.websitedungcuthethao.entity.NguoiDung;
import com.websitedungcuthethao.service.impl.NguoiDungService;

@Component
public class DangKiTaiKhoanValidation implements Validator{

	@Autowired
	private NguoiDungService nguoiDungService;
	
	@Override
	public boolean supports(Class<?> clazz) {
		return NguoiDung.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		if(!supports(getClass()))
			return;
		
		NguoiDung nguoiDung= (NguoiDung) target;
		String ho= nguoiDung.getHo();
		if(!ho.matches("^[A-Za-z]+$")) {
			errors.rejectValue("ho", null, "Họ người dùng không được để trống");
		}
		
		String ten = nguoiDung.getTen();
		if(!ten.matches("^[A-Za-z]+$")) {
			errors.rejectValue("ten", null, "Tên người dùng không được để trống");
		}
		
		String tenDangNhap=nguoiDung.getTenDangNhap();
		if(tenDangNhap.equals("")) {
			errors.rejectValue("tenDangNhap", null, "Tên đăng nhập không được để trống");
			
		}
		List<NguoiDung>listND=nguoiDungService.findAll();
		for (NguoiDung nd : listND) {
			if(tenDangNhap.equals(nd.getTenDangNhap())) {
				errors.rejectValue("tenDangNhap", null, "Tên đăng nhập đã tồn tại!");
			}
		}
		
		String email= nguoiDung.getEmail();
		if(!email.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}$")) {
			errors.rejectValue("email", null, "email không hợp lệ");
		}
		
		String soDienThoai=nguoiDung.getSoDienThoai();
		if(!soDienThoai.matches("^0+[0-9]{9}$")) {
			errors.rejectValue("soDienThoai", null, "số điện thoại không được để trống và phải bắt đầu bằng số 0");
		}
		
		String matKhau= nguoiDung.getMatKhau();
		if(!matKhau.matches("^[A-Za-z0-9]{6,}$")) {
			errors.rejectValue("matKhau", null, "Mật khẩu không được để trống và chỉ bài gồm chữ cái và số!");
		}
	}

}
