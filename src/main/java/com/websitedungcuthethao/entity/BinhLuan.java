package com.websitedungcuthethao.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
public class BinhLuan extends BaseEntity {
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "nguoidungID")
	private NguoiDung nguoidung;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sanphamID")
	private SanPham sanpham;
	private String binhLuan;
	private int danhGia;
	private String anhSanPham;
	private LocalDate ngaySua;
	public BinhLuan(NguoiDung nguoidung, SanPham sanpham, String binhLuan, int danhGia, String anhSanPham,
			LocalDate ngaySua) {
		super();
		this.nguoidung = nguoidung;
		this.sanpham = sanpham;
		this.binhLuan = binhLuan;
		this.danhGia = danhGia;
		this.anhSanPham = anhSanPham;
		this.ngaySua = ngaySua;
	}
	public BinhLuan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NguoiDung getNguoidung() {
		return nguoidung;
	}
	public void setNguoidung(NguoiDung nguoidung) {
		this.nguoidung = nguoidung;
	}
	public SanPham getSanpham() {
		return sanpham;
	}
	public void setSanpham(SanPham sanpham) {
		this.sanpham = sanpham;
	}
	public String getBinhLuan() {
		return binhLuan;
	}
	public void setBinhLuan(String binhLuan) {
		this.binhLuan = binhLuan;
	}
	public int getDanhGia() {
		return danhGia;
	}
	public void setDanhGia(int danhGia) {
		this.danhGia = danhGia;
	}
	public String getAnhSanPham() {
		return anhSanPham;
	}
	public void setAnhSanPham(String anhSanPham) {
		this.anhSanPham = anhSanPham;
	}
	public LocalDate getNgaySua() {
		return ngaySua;
	}
	public void setNgaySua(LocalDate ngaySua) {
		this.ngaySua = ngaySua;
	}
	@Override
	public String toString() {
		return "BinhLuan [nguoidung=" + nguoidung + ", sanpham=" + sanpham + ", binhLuan=" + binhLuan + ", danhGia="
				+ danhGia + ", anhSanPham=" + anhSanPham + ", ngaySua=" + ngaySua + "]";
	}
	
	

}
