<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.websitedungcuthethao.util.SecurityUtils"%>
<nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
	<a class="navbar-brand" href="index.html">Trang quản trị</a>
	<button class="btn btn-link btn-sm order-1 order-lg-0"
		id="sidebarToggle" href="#!">
		<i class="fas fa-bars"></i>
	</button>
	<!-- Navbar Search-->
	<form
		class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
		<div class="input-group">
			<input class="form-control" type="text" name="timKiem"
				placeholder="Tìm kiếm..." aria-label="Search"
				aria-describedby="basic-addon2" />
			<div class="input-group-append">
				<button class="btn btn-primary" type="button">
					<i class="fas fa-search"></i>
				</button>
			</div>
		</div>
	</form>
	<!-- Navbar-->
	<ul class="navbar-nav ml-auto ml-md-0">
		<div class="dropdown">
			<a class="nav-link dropdown-toggle" type="button"
				id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> Welcome <%=SecurityUtils.getPrincipal().getFullName() %><i class="fas fa-user fa-fw"></i>
			</a>
			<div class="dropdown-menu dropdown-menu-right"
				aria-labelledby="dropdownMenuButton">
				<a class="dropdown-item" href="#">Action</a> <a
					class="dropdown-item" href="#">Another action</a> <a
					class="dropdown-item" href="<c:url value="/dang-xuat"/>">Đăng xuất</a>
			</div>
		</div>
	</ul>
</nav>
<div id="layoutSidenav">
	<div id="layoutSidenav_nav">
		<nav class="sb-sidenav accordion sb-sidenav-dark"
			id="sidenavAccordion">
			<div class="sb-sidenav-menu">
				<div class="nav">
					<div class="sb-sidenav-menu-heading">Đơn hàng</div>

					</a> <a class="nav-link" href="tables.html">
						<div class="sb-nav-link-icon">
							<i class="fas fa-table"></i>
						</div> Đơn hàng chưa xác nhận
					</a>
					<div class="sb-sidenav-menu-heading">Quản lý</div>
					<a class="nav-link collapsed" href="#" data-toggle="collapse"
						data-target="#collapseLayouts" aria-expanded="false"
						aria-controls="collapseLayouts">
						<div class="sb-nav-link-icon">
							<i class="fas fa-columns"></i>
						</div> Quản lý
						<div class="sb-sidenav-collapse-arrow">
							<i class="fas fa-angle-down"></i>
						</div>
					</a>
					<div class="collapse" id="collapseLayouts"
						aria-labelledby="headingOne" data-parent="#sidenavAccordion">
						<nav class="sb-sidenav-menu-nested nav">
							<a class="nav-link"
								href=" <c:url value="/quan-tri/quan-ly-nguoi-dung"/> ">Quán
								lú người dùng</a> <a class="nav-link"
								href=" <c:url value="/quan-tri/quan-ly-san-pham?page=1&limit=3"/> ">Quản lý
								sản phẩm</a> <a class="nav-link" href="layout-sidenav-light.html">Quản
								lý hóa đơn</a>
						</nav>
					</div>

				</div>
			</div>
			<div class="sb-sidenav-footer">
				<div class="small">Logged in as:</div>
				Start Bootstrap
			</div>
		</nav>
	</div>