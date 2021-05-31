<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<title>Thêm sản phẩm</title>
<body>
	<div id="layoutSidenav_content">
		<main>
		<div class="container">
				<div class="col-sm-12 text-center mt-3 mb-3">
					<h3>Thêm sản phẩm</h3>
				</div>
				<form:form action="luu-dia-chi"  method="POST" >
					
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Số nhà:</label> 
					 <div class="col-sm-10">
						<input type="text" class="form-control" name="soNha"> 	
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Quận/Huyện:</label> 
					 <div class="col-sm-10">
						<input type="text" class="form-control" name="quanHuyen"> 	
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Tỉnh/Thành phố:</label> 
					 <div class="col-sm-10">
						<input type="text" class="form-control" name="tinhThanhPho"> 	
					</div>
				</div>
				<div class="form-group row" >
					<div class="col-sm-2"></div>
					<div class="col-sm-7">
						<button type="submit" class="btn btn-primary" >Lưu Địa chỉ</button>
					</div>
				</div>
			</form:form>
			<div class="form-group row">

		</div>
</div>
		</main>

	</div>

</body>
