<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<title>Đăng ký tài khoản</title>
<body class="bg-primary">
	<div id="layoutAuthentication">
		<div id="layoutAuthentication_content">
			<main>
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-5">
						<div class="card shadow-lg border-0 rounded-lg mt-5">
							<div class="card-header">
								<h3 class="text-center font-weight-light my-4">Đăng ký tài khoản</h3>
							</div>
							<div class="card-body">
								<form:form method="POST" action="dangky/xac-nhan" modelAttribute="nguoiDung">
									<div class="row">
										<div class="col-5">
											<div class="form-group">
												<form:label class="small mb-1" path="ho">Họ</form:label> 
												<form:input cssClass="form-control py-4" type="text"  path="ho" />
											</div>
										</div>
										<div class="col-7">
											<div class="form-group">
												<form:label path="ten" class="small mb-1">Tên</form:label>
												<form:input cssClass="form-control py-4" type="text"  path="ten" />
											</div>
										</div>
									</div>
									
									<div class="form-group">
										<div class="row">
											
											<div class="col-5">
												<form:label path="gioiTinh" class="small mb-1">Giới tính</form:label>
												<div class="p-t-10">
													<form:radiobutton value="true" path="gioiTinh" label="Nam" />
													<form:radiobutton value="false" path="gioiTinh" label="Nữ"/>						
												</div>
											</div>
										</div>
										
									</div>
									<div class="form-group">
										<form:label path="tenDangNhap"  class="small mb-1">Tên đăng nhập</form:label>
										<form:input cssClass="form-control py-4" type="text" path="tenDangNhap" />
									</div>	
									<div class="form-group">
										<form:label path="email" class="small mb-1">Email</form:label>
										<form:input cssClass="form-control py-4" type="email" path="email" />
									</div>
									<div class="form-group">
										<form:label path="soDienThoai" class="small mb-1">Số điện thoại</form:label>
										<form:input cssClass="form-control py-4" type="text"
											path="soDienThoai" />
									</div>
									<div class="form-group">
										<form:label path="matKhau" class="small mb-1">Mật khẩu</form:label>
										<form:password cssClass="form-control py-4" path="matKhau" />
									</div>
									<div class="form-group">
										<form:label path="" class="small mb-1">Nhập lại mật khẩu</form:label>
										<form:password cssClass="form-control py-4" path="" />
									</div>
									<button type="submit" class="btn btn-primary" style="float: right;">Đăng ký</button>

								</form:form>
							</div>

						</div>
					</div>
				</div>
			</div>
			</main>
		</div>
		<div id="layoutAuthentication_footer">
			<footer class="py-4 bg-light mt-auto">
				<div class="container-fluid">
					<div
						class="d-flex align-items-center justify-content-between small">
						<div class="text-muted">Copyright &copy; Your Website 2021</div>
						<div>
							<a href="#">Privacy Policy</a> &middot; <a href="#">Terms
								&amp; Conditions</a>
						</div>
					</div>
				</div>
			</footer>
		</div>
	</div>
</body>