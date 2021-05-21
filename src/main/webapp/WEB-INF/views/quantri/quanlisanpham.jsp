<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<title>Danh sách người dùng</title>

<body>
	<div class="container">
		<h2 style="margin-top: 100px;margin-left: 5%;">Quản lí sản phẩm</h2>
		
		<form action="${danhmuc.ten}">
			<c:forEach items="${list}" var="danhmuc">
				<div class="dropdown" style=" margin-top: 30px;margin-left: 3%;">
				<div style="color: blue; font-weight: bold;font-size: :20px;">${danhmuc.ten}</div>
						<table class="table table-bordered" style="margin-left: 5%;" id="dataTable" width="100%"
							cellspacing="0">
							<tr>
								<th>STT</th>
								<th>Họ</th>
								<th>Tên</th>
								<th>Giới tính</th>
								<th>Ngày sinh</th>
								<th>Email</th>
								<th>Số điện thoại</th>
								<th>Ngày tạo</th>
								<th>Tên đăng nhập</th>
								<th>Trạng thái</th>
								<th>Quản lý</th>
							</tr>
						</table>
				</div>
			</c:forEach>
		</form>
	</div>
</body>
