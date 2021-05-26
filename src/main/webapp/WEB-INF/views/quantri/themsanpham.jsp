<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<title>Đăng ký tài khoản</title>

<body>
	<div style="margin-left: 300px;margin-top: 100px">
					<h2 class="title">Thêm sản phẩm</h2>
					<form:form action="them-san-pham/save" method="POST"
						modelAttribute="sanPham">
						<div class="row">
						<div class=""></div>
						
						<div class="col-12">
							<div class="col-10">
								<div class="input-group">
									<form:label path="ten">Tên Sản phẩm</form:label>
									<form:input cssClass="input--style-4" type="text" path="ten" />
								</div>
							</div>
							
							<div class="col-10">
								<div class="input-group">
									<form:label path="anhDaiDien">Ảnh đại diện</form:label>
									<input class="input--style-4" type="file" name="anhDaiDien" />
								</div>
							</div>
							
							<div class="col-10">
								<div class="input-group">
									<form:label path="gia">Giá sản phẩm</form:label>
									<form:input cssClass="input--style-4" type="text" path="gia" />
								</div>
							</div>
							
							<div class="col-10">
								<div class="input-group">
									<form:label path="moTa">Mô tả</form:label>
									<form:input cssClass="input--style-4" type="text" path="moTa" />
								</div>
							</div>
							
							<div class="col-10">
								<div class="input-group">
									<form:label path="noiDung">Nội Dung</form:label>
									<form:input cssClass="input--style-4" type="text" path="noiDung" />
								</div>
							</div>
							
							<div class="col-10">
								<div class="input-group">
									<form:label path="soLuong">Số lượng</form:label>
									<form:input cssClass="input--style-4" type="text" path="soLuong" />
								</div>
							</div>
							
							<div class="col-10">
								<div class="input-group">
									<form:label path="thoiGianBaoHanh">Bảo hành</form:label>
									<form:input cssClass="input--style-4" type="text" path="thoiGianBaoHanh" />
								</div>
							</div>
							<div class="col-10">
								<div class="input-group">
									<form:label path="tenDanhMuc">DanhMuc</form:label>
									<form:select class="form-control" id="exampleFormControlSelect1" path="tenDanhMuc">
									<c:forEach items="${listDanhMuc}" var="danhmuc">
										<form:option value="${danhmuc.ten}">${danhmuc.ten}</form:option>
									</c:forEach>
									</form:select>
								</div>
							</div>
							<div class="col-10">
								<div class="input-group">
									<form:label path="tenNhaCungCap">Nhà cung cấp</form:label>
									<form:select class="form-control" id="exampleFormControlSelect1" path="tenNhaCungCap">
									<c:forEach items="${listNhaCungCap}" var="ncc">
										<form:option value="${ncc.tenNhaCungCap}">${ncc.tenNhaCungCap}</form:option>
									</c:forEach>
									</form:select>
								</div>
							</div>
							
							</div>
						</div>
						<div class="p-t-15">
							<button class="btn btn--radius-2 btn--blue" type="submit">Xong</button>
						</div>
					</form:form>
			
	</div>

</body>
</html>