<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<title>Thêm sản phẩm</title>
<body>
	<div id="layoutSidenav_content">
		<main>
		<div class="container">
				<div class="col-sm-12 text-center mt-3 mb-3">
					<h3>Đơn Hàng đang giao</h3>
					
					<hr>
				</div>
				<form action="trang-chu" method="get">
				
					<c:forEach items="${listHD}" var="hd" >
						
						<br>
				<div class="form-group row">
					<label  class="col-sm-2 col-form-label">Họ tên người nhận: </label> 
					<label  class="col-sm-2 col-form-label">${nguoidung.ho} ${nguoidung.ten}</label> 
				</div>
				<div class="form-group row">
					<label  class="col-sm-2 col-form-label">Email: </label> 
					<label  class="col-sm-2 col-form-label">${nguoidung.email}</label> 
				</div>
				<div class="form-group row">
					<label  class="col-sm-2 col-form-label">Mã đơn hàng: </label> 
					<label  class="col-sm-2 col-form-label">${hd.id}</label> 
					
				</div>
				<div class="form-group row">
					<label  class="col-sm-2 col-form-label">Ngày đặt: </label> 
					<label  class="col-sm-2 col-form-label">${hd.ngayDat}</label> 
				</div>
				<div class="form-group row">
					<label  class="col-sm-2 col-form-label">Ngày dự kiến nhận: </label> 
					<label  class="col-sm-2 col-form-label">${hd.ngayNhanDuKien}</label> 
				</div>
				<div class="form-group row">
					<label  class="col-sm-2 col-form-label">Tổng tiền: </label> 
					<label  class="col-sm-2 col-form-label"><span><fmt:formatNumber type="number" pattern = "#,### VND" value="${hd.tongTienHoaDon}" /></span></label> 
				</div>	
				<div class="form-group row" >
				<div class="col-9"></div>
					<div class="col-3">
					<a href="<c:url value="/don-hang/xac-nhan/${hd.id}" />" type="submit" class="btn btn-primary" > Đã nhận hàng</a>
				</div>
				</div>	
				<hr>
					</c:forEach>
				
				<div class="form-group row">
				<div class="col-3">
					<a href="<c:url value="/trang-chu" />" type="submit" class="btn btn-primary" > Quay lại</a>
				</div>
				<div class="col-4">
					
				</div>
				<div class="col-3">
					<a href="<c:url value="don-hang/don-hang-da-nhan/${nguoidung.id}" />" type="submit" class="btn btn-primary" >Đơn hàng đã nhận</a>
				</div>
				</div>
			</form>
			<div class="form-group row">
		</div>
</div>
		</main>

	</div>

</body>
