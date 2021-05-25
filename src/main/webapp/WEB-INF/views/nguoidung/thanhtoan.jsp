<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<title>Thanh toán</title>
<body>
	<section class="shop checkout section">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-12">
					<div class="checkout-form">
						<h2>Thông tin đơn hàng</h2>
						
						<!-- Form -->
						<form class="form" method="post" action="#">
							<div class="row">
								<div class="col-lg-6 col-md-6 col-12">
									<div class="form-group">
										<label>Họ<span>*</span></label> <input type="text"
											name="name"  disabled="disabled" value="${nguoidung.ho}">
									</div>
								</div>
								<div class="col-lg-6 col-md-6 col-12">
									<div class="form-group">
										<label>Tên<span>*</span></label> <input type="text"
											name="name"  disabled="disabled" value="${nguoidung.ten}">
									</div>
								</div>
								<div class="col-lg-6 col-md-6 col-12">
									<div class="form-group">
										<label>Email<span>*</span></label> <input type="email"
											name="email"  disabled="disabled" value="${nguoidung.email}">
									</div>
								</div>
								<div class="col-lg-6 col-md-6 col-12">
									<div class="form-group">
										<label>Số điện thoại<span>*</span></label> <input type="number"
											name="number"  disabled="disabled" value="${nguoidung.soDienThoai}">
									</div>
								</div>
								<div class="col-lg-12 col-md-12 col-12">
									<div class="form-group">
										<label>Địa chỉ<span>*</span></label> <select
											name="country_name" id="country">
											<c:forEach items="${nguoidung.dsDiaChi}" var="diachi">
												<option value="${diachi.id}">${diachi}</option>
											</c:forEach>
											
										</select>
										
									</div>
									<a href="">Sử dụng địa chỉ khác</a>
								</div>
								
								
							</div>
						</form>
						<!--/ End Form -->
					</div>
				</div>
				<div class="col-lg-4 col-12">
					<div class="order-details">
						<!-- Order Widget -->
						<div class="single-widget">
							<h2>Tổng tiền hóa đơn</h2>
							<div class="content">
								<ul>
									<li>Sub Total<span>$330.00</span></li>
									<li>(+) Shipping<span>$10.00</span></li>
									<li class="last">Total<span>$340.00</span></li>
								</ul>
							</div>
						</div>
						<!--/ End Order Widget -->
						
						
						<!--/ End Payment Method Widget -->
						<!-- Button Widget -->
						<div class="single-widget get-button">
							<div class="content">
								<div class="button">
									<a href="#" class="btn">Tiến hành đặt hàng</a>
								</div>
							</div>
						</div>
						<!--/ End Button Widget -->
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--/ End Checkout -->
</body>
