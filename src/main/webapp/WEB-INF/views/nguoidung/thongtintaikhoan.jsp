<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<title>Thêm sản phẩm</title>
<body>
	<div id="layoutSidenav_content">
		<main>
		<div class="container">
				<div class="col-sm-12 text-center mt-3 mb-3">
					<h3>Thông tin tài khoản</h3>
				</div>
				<form:form action="trang-chu" method="get" modelAttribute="nguoidung" >
				<div class="form-group row">
					<form:label path="ho" cssClass="col-sm-2 col-form-label">Họ tên: </form:label> 
					<form:label path="ho" cssClass="col-sm-2 col-form-label">${nguoidung.ho} ${nguoidung.ten}</form:label> 
				</div>
				<div class="form-group row">
					<form:label path="ho" cssClass="col-sm-2 col-form-label">Email: </form:label> 
					<form:label path="ho" cssClass="col-sm-2 col-form-label">${nguoidung.email}</form:label> 
				</div>
				
				<div class="form-group row">
					<form:label path="ho" cssClass="col-sm-2 col-form-label">Số điện thoại: </form:label> 
					<form:label path="ho" cssClass="col-sm-2 col-form-label">${nguoidung.soDienThoai}</form:label> 
				</div>
				
				<div class="form-group row">
					<form:label path="ho" cssClass="col-sm-2 col-form-label">Địa chỉ: </form:label> 
					<c:forEach items="${listDC}" var="dc" varStatus="stt">
					<form:label path="ho" cssClass="col-sm-10 col-form-label">${stt.count}: ${dc.toString()}</form:label> 
					<form:label path="ho" cssClass="col-sm-2 col-form-label"></form:label>
					</c:forEach>
				</div>
				
				<div class="form-group row">
				<div class="col-3">
					<a href="<c:url value="/trang-chu" />" type="submit" class="btn btn-primary" > Quay lại</a>
				</div>
				<div class="col-1"></div>	
				<div class="col-3">
					<a href="<c:url value="doi-mat-khau/${nguoidung.id}" />" type="submit" class="btn btn-danger" > Đổi mất khẩu</a>
				</div>
				<div class="col-1"></div>	
				<div class="col-3">
					<a href="<c:url value="them-dia-chi/${nguoidung.id}" />" type="submit" class="btn btn-danger" > Thêm địa chỉ</a>
				</div>
						
				</div>
				
				<div class="form-group row" style="float: right;">
					<div class="col-sm-2"></div>
					
					<%-- <div class="col-sm-3">
						
					</div> --%>
					<div class="col-sm-7">
						
					</div>
				</div>
			</form:form>
			<div class="form-group row">

		</div>
</div>
		</main>

	</div>

</body>
