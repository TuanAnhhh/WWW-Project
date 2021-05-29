package com.websitedungcuthethao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DiaChi{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "nguoidungID")
	private NguoiDung nguoidung;
	
	@Column(columnDefinition = "nvarchar(25)")
	private String quan;
	
	@Column(columnDefinition = "nvarchar(25)")
	private String thanhPho;
	
	@Column(columnDefinition = "nvarchar(25)")
	private String tinh;

	public DiaChi(int id, NguoiDung nguoidung, String quan, String thanhPho, String tinh) {
		super();
		this.id = id;
		this.nguoidung = nguoidung;
		this.quan = quan;
		this.thanhPho = thanhPho;
		this.tinh = tinh;
	}

	public DiaChi(NguoiDung nguoidung, String quan, String thanhPho, String tinh) {
		super();
		this.nguoidung = nguoidung;
		this.quan = quan;
		this.thanhPho = thanhPho;
		this.tinh = tinh;
	}

	public DiaChi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public NguoiDung getNguoidung() {
		return nguoidung;
	}

	public void setNguoidung(NguoiDung nguoidung) {
		this.nguoidung = nguoidung;
	}

	public String getQuan() {
		return quan;
	}

	public void setQuan(String quan) {
		this.quan = quan;
	}

	public String getThanhPho() {
		return thanhPho;
	}

	public void setThanhPho(String thanhPho) {
		this.thanhPho = thanhPho;
	}

	public String getTinh() {
		return tinh;
	}

	public void setTinh(String tinh) {
		this.tinh = tinh;
	}

	@Override
	public String toString() {
		return quan  + "-"+thanhPho +"-"+  tinh ;
	}
	
	
}
