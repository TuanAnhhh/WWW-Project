<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Đăng ký tài khoản</title>

<body>
	<div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
		<div class="wrapper wrapper--w680">
			<div class="card card-4">
				<div class="card-body">
					<h2 class="title">Đổi mật khẩu</h2>
					<form action="doi-mat-khau/luu-mat-khau" method="post">
						<div class="col-4">
							<label class="label">Mật khẩu</label> <input
								class="input--style-4" type="password" placeholder="mật khẩu mới" name="matkhau">
								<label class="label">Xác nhận mật khẩu</label> <input
								class="input--style-4" type="password" placeholder="nhập lại mật khẩu" name="xacnhanmatkhau">
						</div>
						<div class="p-t-15">
							<input type="submit" class="btn btn--radius-2 btn--blue"
								value="Tìm tài khoản" />
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>