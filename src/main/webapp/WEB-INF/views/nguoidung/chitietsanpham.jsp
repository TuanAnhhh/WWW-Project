<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<title>Chi tiết sản phẩm</title>
<body class="js">
	<!-- Start Blog Single -->
	<section class="blog-single section">
		<div class="container">
		<form:form action="luu-binh-luan/${sp.id}" method="POST" enctype="multipart/form-data">
			<div class="row">
				<div class="col-lg-12 col-12">
					<div class="blog-single-main">
						<div class="row no-gutters">
						
							<div class="col-lg-6 col-md-12 col-sm-12 col-xs-12">
								<!-- Product Slider -->
								<div class="product-gallery">
									<div class="quickview-slider-active">
										<div class="single-slider">
											<img src="<c:url value="/resources/images/user/sanpham/${sp.anhDaiDien}"/>" alt="#">
										</div>
										<div class="single-slider">
											<img src="<c:url value="/resources/images/user/sanpham/${sp.anhDaiDien}"/>" alt="#">
										</div>
										
									</div>
								</div>
								<!-- End Product slider -->
							</div>
							<div class="col-lg-6 col-md-12 col-sm-12 col-xs-12">
								<div class="quickview-content">
									<h2>${sp.ten}</h2>
									<div class="quickview-ratting-review">
										<div class="quickview-ratting-wrap">
											<div class="quickview-ratting">
												<i class="yellow fa fa-star"></i> <i class="yellow fa fa-star"></i>
												<i class="yellow fa fa-star"></i>
												<i class="yellow fa fa-star"></i> <i class="fa fa-star"></i>
											</div>
											<a href="#"> ( ${sp.soLuotMua} customer review)</a>
										</div>
										<div class="quickview-stock">
										<c:if test="${sp.soLuong > 0}">
											<span><i class="fa fa-check-circle-o"></i> còn hàng ${sp.soLuong}</span>
											
										</c:if>
										<c:if test="${sp.soLuong == 0}">
											<span><i class="fa fa-times-circle"></i> hết hàng</span>
											
										</c:if>
										
											
										</div>
									</div>
									<h3>${sp.gia - sp.gia*sp.phanTramGiamGia} VNĐ</h3>
									<div class="quickview-peragraph">
										<p>${sp.moTa}</p>
									</div>
									<!-- <div class="size">
										<div class="row">
											<div class="col-lg-6 col-12">
												<h5 class="title">Size</h5>
												<select>
													<option selected="selected">s</option>
													<option>m</option>
													<option>l</option>
													<option>xl</option>
												</select>
											</div>
											<div class="col-lg-6 col-12">
												<h5 class="title">Color</h5>
												<select>
													<option selected="selected">orange</option>
													<option>purple</option>
													<option>black</option>
													<option>pink</option>
												</select>
											</div>
										</div>
									</div> -->
									<!-- <div class="quantity">
										Input Order
										<div class="input-group">
											<div class="button minus">
												<button type="button" class="btn btn-primary btn-number"
													disabled="disabled" data-type="minus" data-field="quant[1]">
													<i class="ti-minus"></i>
												</button>
											</div>
											<input type="text" name="quant[1]" class="input-number" data-min="1"
												data-max="1000" value="1">
											<div class="button plus">
												<button type="button" class="btn btn-primary btn-number"
													data-type="plus" data-field="quant[1]">
													<i class="ti-plus"></i>
												</button>
											</div>
										</div>
										/ End Input Order
									</div> -->
									<div class="add-to-cart">
										<a href="#" class="btn">Thêm vào giỏ hàng</a> 
									</div>
									
								</div>
							</div>
						</div>

					</div>
				</div>

			</div>
			<div class="row">
				<div class="col-8">
					<div class="blog-detail">
						<h2 class="blog-title">Chi tiết sản phẩm</h2>
						<div class="content">
							<p>${sp.moTa}</p>
							<p>${sp.noiDung}</p>
						</div>
					</div>
					
					<div class="comments">
						
						<div class="row">
							<div class="col-12">
							<h3 class="comment-title">Bình luận</h3>
							
							<textarea rows = "3" cols = "30" class="form-control" name="binhLuan" > </textarea>
							<br>
							</div>
						</div>
						
						<div class="row">
							<div class="col-10">
							<input name="anhSanPham" type="file" >	
							</div>
							
							<div class="col-2">
							<input type="submit" class="btn btn-primary" value="Bình Luận">
							<%-- 	<a href="<c:url value="luu-binh-luan/${sp.id}" />" type="submit" class="btn btn-primary" >Bình Luận</a> --%>
							</div>
						</div>
						
						<br>		
						
						<c:forEach items="${listBL}" var="bl">	
						<hr>		
						<!-- Single Comment -->
						<div class="single-comment">
							<img src="https://png.pngtree.com/png-vector/20190710/ourmid/pngtree-user-vector-avatar-png-image_1541962.jpg" alt="#">
							<div class="content">
								<h4>${bl.nguoidung.ho} ${bl.nguoidung.ten}<span>${bl.ngayBinhLuan}</span></h4>
							</div>
						</div>
						<div class="content">
								<p>${bl.binhLuan}</p>
								<img style="width: 300px;height: 300px" alt="#" src="<c:url value="/resources/images/user/sanpham/${bl.anhSanPham}"/>">
							</div>
						<!-- End Single Comment -->
						</c:forEach>	
						
					</div>
					
				</div>
				<div class="col-lg-4 col-12">
					<div class="main-sidebar">

					
						<!--/ End Single Widget -->
						<!-- Single Widget -->
						<!-- <div class="single-widget recent-post">
							<h3 class="title">Sản phẩm liên quan</h3>
							Single Post
							<div class="single-post">
								<div class="image">
									<img src="https://via.placeholder.com/100x100" alt="#">
								</div>
								<div class="content">
									<h5><a href="#">Top 10 Beautyful Women Dress in the world</a></h5>
									<ul class="comment">
										<li><i class="fa fa-calendar" aria-hidden="true"></i>Jan 11, 2020</li>
										<li><i class="fa fa-commenting-o" aria-hidden="true"></i>35</li>
									</ul>
								</div>
							</div>
							End Single Post
							
							
						</div> -->
						<!--/ End Single Widget -->
						<!-- Single Widget -->
						<!--/ End Single Widget -->
						<!-- Single Widget -->

						<!--/ End Single Widget -->

					</div>
				</div>
			</div>
			</form:form>
		</div>
		
	</section>
	<!--/ End Blog Single -->

</body>