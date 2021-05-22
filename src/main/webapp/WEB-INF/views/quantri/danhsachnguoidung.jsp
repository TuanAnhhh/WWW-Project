<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<title>Danh sách người dùng</title>

<body>
	<div id="layoutSidenav_content">
		<main>
		<div class="container-fluid">
			<h1 class="mt-4">Tables</h1>
			<ol class="breadcrumb mb-4">
				<li class="breadcrumb-item"><a href="index.html">Quản lí
						người dùng</a></li>
				<li class="breadcrumb-item active">Tables</li>
			</ol>

			<div class="card mb-4">
				<div class="card-header">
					<i class="fas fa-table mr-1"></i> Danh sách người dùng
				</div>

				<div class="card-body">

					<div class="table-responsive">
						
						<table class="table table-bordered" id="dataTable" width="100%"
							cellspacing="0">
							<thead>
								<tr>
									<th>STT</th>
									<th>Họ </th>
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
							</thead>

							<tbody>
							<c:forEach items="${list }" var="nd">
								<tr>
									<td>${nd.id }</td>
									<td>${nd.ho }</td>
									<td>${nd.ten }</td>
									<td>${nd.gioiTinh }</td>
									<td>${nd.ngaySinh }</td>
									<td>${nd.email }</td>
									<td>${nd.soDienThoai }</td>
									<td>${nd.ngayTao }</td>
									<td>${nd.tenDangNhap }</td>
									<td>${nd.trangThai }</td>
									
									<td><a href="quan-ly-nguoi-dung/sua-trang-thai/${nd.id}"><i class="far fa-edit"></i></a></td>
								</tr>
								</c:forEach>
							</tbody>

						</table>
						
						<nav aria-label="Page navigation example">
							<ul class="pagination">
								<li class="page-item"><a class="page-link" href="#">Previous</a></li>
								<li class="page-item"><a class="page-link" href="#">1</a></li>
								<li class="page-item"><a class="page-link" href="#">2</a></li>
								<li class="page-item"><a class="page-link" href="#">3</a></li>
								<li class="page-item"><a class="page-link" href="#">Next</a></li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
		</div>
		</main>

	</div>
	</div>
</body>
