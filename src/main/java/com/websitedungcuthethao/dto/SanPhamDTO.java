package com.websitedungcuthethao.dto;

public class SanPhamDTO {
	private Long id;
	private String ten;
	private String tenDanhMuc;
	private String tenNhaCungCap;
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
	private String nguoiSua;
	private String tenThuoctinh;
	private String giaTriThuocTinh;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "SanPhamDTO [id=" + id + ", ten=" + ten + ", tenDanhMuc=" + tenDanhMuc + ", tenNhaCungCap="
				+ tenNhaCungCap + ", moTa=" + moTa + ", thuongHieu=" + thuongHieu + ", noiDung=" + noiDung + ", gia="
				+ gia + ", giaGiam=" + giaGiam + ", soLuong=" + soLuong + ", anhDaiDien=" + anhDaiDien + ", soLuotXem="
				+ soLuotXem + ", soLuotMua=" + soLuotMua + ", video=" + video + ", thoiGianBaoHanh=" + thoiGianBaoHanh
				+ ", trangThai=" + trangThai + ", nguoiSua=" + nguoiSua + ", tenThuoctinh=" + tenThuoctinh
				+ ", giaTriThuocTinh=" + giaTriThuocTinh + "]";
	}
	/**
	 * @param id
	 * @param ten
	 * @param tenDanhMuc
	 * @param tenNhaCungCap
	 * @param moTa
	 * @param thuongHieu
	 * @param noiDung
	 * @param gia
	 * @param giaGiam
	 * @param soLuong
	 * @param anhDaiDien
	 * @param soLuotXem
	 * @param soLuotMua
	 * @param video
	 * @param thoiGianBaoHanh
	 * @param trangThai
	 * @param nguoiSua
	 * @param tenThuoctinh
	 * @param giaTriThuocTinh
	 */
	public SanPhamDTO(Long id, String ten, String tenDanhMuc, String tenNhaCungCap, String moTa, String thuongHieu,
			String noiDung, double gia, double giaGiam, int soLuong, String anhDaiDien, int soLuotXem, int soLuotMua,
			String video, int thoiGianBaoHanh, boolean trangThai, String nguoiSua, String tenThuoctinh,
			String giaTriThuocTinh) {
		super();
		this.id = id;
		this.ten = ten;
		this.tenDanhMuc = tenDanhMuc;
		this.tenNhaCungCap = tenNhaCungCap;
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
		this.nguoiSua = nguoiSua;
		this.tenThuoctinh = tenThuoctinh;
		this.giaTriThuocTinh = giaTriThuocTinh;
	}
	public SanPhamDTO() {
		// TODO Auto-generated constructor stub
	}
	
}
