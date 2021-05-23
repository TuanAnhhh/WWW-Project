package com.websitedungcuthethao.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.websitedungcuthethao.entity.DiaChi;

public class NguoiDungDTONew {


	private String ho;

	private String ten;

	private boolean gioiTinh;

	private LocalDate ngaySinh;

	private String email;

	private String soDienThoai;

	private String tenDangNhap;

	private String matKhau;
	Set<DiaChi> dsDiaChi = new HashSet<DiaChi>();


	

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public Set<DiaChi> getDsDiaChi() {
		return dsDiaChi;
	}

	public void setDsDiaChi(Set<DiaChi> dsDiaChi) {
		this.dsDiaChi = dsDiaChi;
	}
	
}
