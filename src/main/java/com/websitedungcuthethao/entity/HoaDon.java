package com.websitedungcuthethao.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
public class HoaDon extends BaseEntity{
	
	
	@ManyToOne
	@JoinColumn(name = "nguoidungID")
	private NguoiDung nguoidung;
	
	private boolean trangThai;
	
	private LocalDate ngayDat;
	
	private LocalDate ngayNhanDuKien;
	
	private LocalDate ngayNhan;

	public HoaDon(NguoiDung nguoidung, boolean trangThai, LocalDate ngayDat, LocalDate ngayNhanDuKien,
			LocalDate ngayNhan) {
		super();
		this.nguoidung = nguoidung;
		this.trangThai = trangThai;
		this.ngayDat = ngayDat;
		this.ngayNhanDuKien = ngayNhanDuKien;
		this.ngayNhan = ngayNhan;
	}

	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NguoiDung getNguoidung() {
		return nguoidung;
	}

	public void setNguoidung(NguoiDung nguoidung) {
		this.nguoidung = nguoidung;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	public LocalDate getNgayDat() {
		return ngayDat;
	}

	public void setNgayDat(LocalDate ngayDat) {
		this.ngayDat = ngayDat;
	}

	public LocalDate getNgayNhanDuKien() {
		return ngayNhanDuKien;
	}

	public void setNgayNhanDuKien(LocalDate ngayNhanDuKien) {
		this.ngayNhanDuKien = ngayNhanDuKien;
	}

	public LocalDate getNgayNhan() {
		return ngayNhan;
	}

	public void setNgayNhan(LocalDate ngayNhan) {
		this.ngayNhan = ngayNhan;
	}

	@Override
	public String toString() {
		return "HoaDon [nguoidung=" + nguoidung + ", trangThai=" + trangThai + ", ngayDat=" + ngayDat
				+ ", ngayNhanDuKien=" + ngayNhanDuKien + ", ngayNhan=" + ngayNhan + "]";
	}
	
	
	
}
