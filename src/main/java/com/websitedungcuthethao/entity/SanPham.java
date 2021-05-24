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

@Entity
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

	public SanPham(Long id, LocalDate ngayTao, String nguoiTao, String ten, DanhMuc danhmuc, NhaCungCap nhacungcap,
			String moTa, String thuongHieu, String noiDung, double gia, double giaGiam, int soLuong, String anhDaiDien,
			int soLuotXem, int soLuotMua, String video, int thoiGianBaoHanh, boolean trangThai, LocalDate ngaySua,
			String nguoiSua) {
		super();
		this.id = id;
		this.ngayTao = ngayTao;
		this.nguoiTao = nguoiTao;
		this.ten = ten;
		this.danhmuc = danhmuc;
		this.nhacungcap = nhacungcap;
		this.moTa = moTa;
		this.thuongHieu = thuongHieu;
		this.noiDung = noiDung;
		this.gia = gia;
		this.giaGiam = giaGiam;
		this.soLuong = soLuong;
		this.anhDaiDien = anhDaiDien;
		this.soLuotXem = soLuotXem;
		this.soLuotMua = soLuotMua;
		this.video = video;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.trangThai = trangThai;
		this.ngaySua = ngaySua;
		this.nguoiSua = nguoiSua;
	}

	public SanPham(LocalDate ngayTao, String nguoiTao, String ten, DanhMuc danhmuc, NhaCungCap nhacungcap, String moTa,
			String thuongHieu, String noiDung, double gia, double giaGiam, int soLuong, String anhDaiDien,
			int soLuotXem, int soLuotMua, String video, int thoiGianBaoHanh, boolean trangThai, LocalDate ngaySua,
			String nguoiSua) {
		super();
		this.ngayTao = ngayTao;
		this.nguoiTao = nguoiTao;
		this.ten = ten;
		this.danhmuc = danhmuc;
		this.nhacungcap = nhacungcap;
		this.moTa = moTa;
		this.thuongHieu = thuongHieu;
		this.noiDung = noiDung;
		this.gia = gia;
		this.giaGiam = giaGiam;
		this.soLuong = soLuong;
		this.anhDaiDien = anhDaiDien;
		this.soLuotXem = soLuotXem;
		this.soLuotMua = soLuotMua;
		this.video = video;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.trangThai = trangThai;
		this.ngaySua = ngaySua;
		this.nguoiSua = nguoiSua;
	}

	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(LocalDate ngayTao) {
		this.ngayTao = ngayTao;
	}

	public String getNguoiTao() {
		return nguoiTao;
	}

	public void setNguoiTao(String nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public DanhMuc getDanhmuc() {
		return danhmuc;
	}

	public void setDanhmuc(DanhMuc danhmuc) {
		this.danhmuc = danhmuc;
	}

	public NhaCungCap getNhacungcap() {
		return nhacungcap;
	}

	public void setNhacungcap(NhaCungCap nhacungcap) {
		this.nhacungcap = nhacungcap;
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

	public LocalDate getNgaySua() {
		return ngaySua;
	}

	public void setNgaySua(LocalDate ngaySua) {
		this.ngaySua = ngaySua;
	}

	public String getNguoiSua() {
		return nguoiSua;
	}

	public void setNguoiSua(String nguoiSua) {
		this.nguoiSua = nguoiSua;
	}

	@Override
	public String toString() {
		return "SanPham [id=" + id + ", ngayTao=" + ngayTao + ", nguoiTao=" + nguoiTao + ", ten=" + ten + ", danhmuc="
				+ danhmuc + ", nhacungcap=" + nhacungcap + ", moTa=" + moTa + ", thuongHieu=" + thuongHieu
				+ ", noiDung=" + noiDung + ", gia=" + gia + ", giaGiam=" + giaGiam + ", soLuong=" + soLuong
				+ ", anhDaiDien=" + anhDaiDien + ", soLuotXem=" + soLuotXem + ", soLuotMua=" + soLuotMua + ", video="
				+ video + ", thoiGianBaoHanh=" + thoiGianBaoHanh + ", trangThai=" + trangThai + ", ngaySua=" + ngaySua
				+ ", nguoiSua=" + nguoiSua + "]";
	}
	
	
	

//	@OneToMany(mappedBy = "sanpham")
//	private List<GiaTriThuocTinhSanPham> dsThuocTinhSanPham = new ArrayList<GiaTriThuocTinhSanPham>();
	
	
}
