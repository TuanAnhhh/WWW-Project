package com.websitedungcuthethao.dto;

import java.util.ArrayList;
import java.util.List;

public class AbstractDTO<T> {
	private Long id;
	private Integer page;
	private Integer limit;
	private Integer totalPage;
	private Long totalItem;
	private List<T> listResult = new ArrayList<>();
	private String ten;
	private String tenDanhMuc;
	private String tenNhaCungCap;
	private String moTa;
	private String thuongHieu;
	private String noiDung;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<T> getListResult() {
		return listResult;
	}
	public void setListResult(List<T> listResult) {
		this.listResult = listResult;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTenDanhMuc() {
		return tenDanhMuc;
	}
	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	public String getTenNhaCungCap() {
		return tenNhaCungCap;
	}
	public void setTenNhaCungCap(String tenNhaCungCap) {
		this.tenNhaCungCap = tenNhaCungCap;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getThuongHieu() {
		return thuongHieu;
	}
	public void setThuongHieu(String thuongHieu) {
		this.thuongHieu = thuongHieu;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public double getGiaGiam() {
		return giaGiam;
	}
	public void setGiaGiam(double giaGiam) {
		this.giaGiam = giaGiam;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getAnhDaiDien() {
		return anhDaiDien;
	}
	public void setAnhDaiDien(String anhDaiDien) {
		this.anhDaiDien = anhDaiDien;
	}
	public int getSoLuotXem() {
		return soLuotXem;
	}
	public void setSoLuotXem(int soLuotXem) {
		this.soLuotXem = soLuotXem;
	}
	public int getSoLuotMua() {
		return soLuotMua;
	}
	public void setSoLuotMua(int soLuotMua) {
		this.soLuotMua = soLuotMua;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public boolean isTrangThai() {
		return trangThai;
	}
	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}
	public String getNguoiSua() {
		return nguoiSua;
	}
	public void setNguoiSua(String nguoiSua) {
		this.nguoiSua = nguoiSua;
	}
	public String getTenThuoctinh() {
		return tenThuoctinh;
	}
	public void setTenThuoctinh(String tenThuoctinh) {
		this.tenThuoctinh = tenThuoctinh;
	}
	public String getGiaTriThuocTinh() {
		return giaTriThuocTinh;
	}
	public void setGiaTriThuocTinh(String giaTriThuocTinh) {
		this.giaTriThuocTinh = giaTriThuocTinh;
	}
	private double gia;
	private double giaGiam;
	private int soLuong;
	private String anhDaiDien;
	private int soLuotXem;
	private int soLuotMua;
	private String video;
	private int thoiGianBaoHanh;
	private boolean trangThai;
	private String nguoiSua;
	private String tenThuoctinh;
	private String giaTriThuocTinh;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalItem() {
		return totalItem;
	}
	public void setTotalItem(Long totalItem) {
		this.totalItem = totalItem;
	}

	
	
}
