package com.websitedungcuthethao.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class SanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@CreatedDate
	private LocalDate ngayTao;
	
	@CreatedBy
	private String nguoiTao;

	private String ten;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "danhmucID", nullable = false)
	private DanhMuc danhmuc;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "nhacungcapID", nullable = false)
	private NhaCungCap nhacungcap;

	private String moTa;

	private String thuongHieu;

	private String noiDung;

	private double gia;

	private double giaGiam;

	private int soLuong;

	private String anhDaiDien;

	private int soLuotXem;
	
	private int soLuotMua;

	private String video;

	private int thoiGianBaoHanh;

	private boolean trangThai;
	
	@LastModifiedDate
	private LocalDate ngaySua;

	@LastModifiedBy
	private String nguoiSua;

//	@OneToMany(mappedBy = "sanpham")
//	private List<GiaTriThuocTinhSanPham> dsThuocTinhSanPham = new ArrayList<GiaTriThuocTinhSanPham>();
}
