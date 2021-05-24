package com.websitedungcuthethao.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Entity
public class ThuocTinhSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NonNull
	private String tenThuoctinh;
	
	@OneToMany(mappedBy = "thuoctinhsanpham")
	private List<GiaTriThuocTinhSanPham> dsGiaTriThuocTinh = new ArrayList<GiaTriThuocTinhSanPham>();

	public ThuocTinhSanPham(Long id, @NonNull String tenThuoctinh, List<GiaTriThuocTinhSanPham> dsGiaTriThuocTinh) {
		super();
		this.id = id;
		this.tenThuoctinh = tenThuoctinh;
		this.dsGiaTriThuocTinh = dsGiaTriThuocTinh;
	}

	public ThuocTinhSanPham(@NonNull String tenThuoctinh, List<GiaTriThuocTinhSanPham> dsGiaTriThuocTinh) {
		super();
		this.tenThuoctinh = tenThuoctinh;
		this.dsGiaTriThuocTinh = dsGiaTriThuocTinh;
	}

	public ThuocTinhSanPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTenThuoctinh() {
		return tenThuoctinh;
	}

	public void setTenThuoctinh(String tenThuoctinh) {
		this.tenThuoctinh = tenThuoctinh;
	}

	public List<GiaTriThuocTinhSanPham> getDsGiaTriThuocTinh() {
		return dsGiaTriThuocTinh;
	}

	public void setDsGiaTriThuocTinh(List<GiaTriThuocTinhSanPham> dsGiaTriThuocTinh) {
		this.dsGiaTriThuocTinh = dsGiaTriThuocTinh;
	}

	@Override
	public String toString() {
		return "ThuocTinhSanPham [id=" + id + ", tenThuoctinh=" + tenThuoctinh+"]";
	}
	
	
	
}
