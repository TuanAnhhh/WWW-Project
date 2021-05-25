<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>

<title>Danh sách sản phẩm</title>

<body>
<form action="<c:url value='/danh-sach-san-pham/?page=${abstractDTO.page}&limit=${abstractDTO.limit}'/>" id="formSubmit" method="get" >
	<!-- Product Style -->
	<section class="product-area shop-sidebar shop section">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-4 col-12">
					<div class="shop-sidebar">
						<!-- Single Widget -->
						<div class="single-widget category">
							<h3 class="title">Categories</h3>
							<ul class="categor-list">
								<li><a href="#">T-shirts</a></li>
								<li><a href="#">jacket</a></li>
								<li><a href="#">jeans</a></li>
								<li><a href="#">sweatshirts</a></li>
								<li><a href="#">trousers</a></li>
								<li><a href="#">kitwears</a></li>
								<li><a href="#">accessories</a></li>
							</ul>
						</div>
						<!--/ End Single Widget -->
						
						<!-- Single Widget -->
						<div class="single-widget recent-post">
							<h3 class="title">Sản phẩm gợi ý</h3>
							<!-- Single Post -->
							<div class="single-post first">
								<div class="image">
									<img src="https://via.placeholder.com/75x75" alt="#">
								</div>
								<div class="content">
									<h5>
										<a href="#">Girls Dress</a>
									</h5>
									<p class="price">$99.50</p>
									<ul class="reviews">
										<li class="yellow"><i class="ti-star"></i></li>
										<li class="yellow"><i class="ti-star"></i></li>
										<li class="yellow"><i class="ti-star"></i></li>
										<li><i class="ti-star"></i></li>
										<li><i class="ti-star"></i></li>
									</ul>
								</div>
							</div>
							<!-- End Single Post -->
						</div>
						<!--/ End Single Widget -->
						
					</div>
				</div>
				<div class="col-lg-9 col-md-8 col-12">
					<div class="row">
						<div class="col-12">
							<!-- Shop Top -->
							<div class="shop-top">
								<div class="shop-shorter">									
									<div class="single-shorter">
										<label>Sắp xếp theo giá :</label> <select>
											<option selected="selected">Giá</option>
											<option>Giá: Thấp đến cao</option>
											<option>Giá: Cao đến thấp</option>
										</select>
									</div>
								</div>
								<!-- <ul class="view-mode">
									<li class="active"><a href="shop-grid.html"><i
											class="fa fa-th-large"></i></a></li>
									<li><a href="shop-list.html"><i class="fa fa-th-list"></i></a></li>
								</ul> -->
							</div>
							<!--/ End Shop Top -->
						</div>
					</div>

					<!--  load san pham-->
					<div class="row">
						<c:forEach items="${dsSanPham}" var="sp">
							<div class="col-lg-4 col-md-6 col-12">
								<div class="single-product">
									<div class="product-img">
										<a href="product-details.html"> <img class="default-img"
											src="<c:url value="/resources/images/user/sanpham/${sp.anhDaiDien}"/>"
											alt="#"> <img class="hover-img"
											src="<c:url value="/resources/images/user/sanpham/${sp.anhDaiDien}"/>"
											alt="#">
										</a>
										<div class="button-head">
											<div class="product-action-2">
												<a title="Add to cart" href=" <c:url value="/gio-hang/them/${sp.id}"/> ">Thêm vào giỏ hàng</a>
											</div>
										</div>
									</div>
									<div class="product-content">
										<h3>
											<a href="product-details.html">${sp.ten}</a>
										</h3>
										<div class="product-price">
											<span>$ ${sp.gia}</span>
										</div>
									</div>
								</div>
							</div>
						</c:forEach>


					</div>

					<!--phan trang  -->
					<div class="row">
						<div class="col-lg-12 col-md-12 col-12">
							<nav aria-label="Page navigation">
								<ul class="pagination" id="pagination"></ul>
								<input type="hidden" value="" id="page" name="page" />
								 <input type="hidden" value="" id="limit" name="limit" />
							</nav>
						</div>
					</div>
					<!--phan trang  -->
				</div>
			</div>
		</div>
	</section>
	</form>
	<!--/ End Product Style 1  -->
	<content tag="script"> <script type="text/javascript">
	var totalPages = ${abstractDTO.totalPage};
	var currentPage = ${abstractDTO.page};
	var limit = ${abstractDTO.limit};
		$(function() {
			window.pagObj = $('#pagination').twbsPagination({
				totalPages : totalPages,
				visiblePages :10,
				startPage: currentPage,
				onPageClick : function(event, page) {
					if (currentPage != page) {
	            		$('#limit').val(limit);
						$('#page').val(page);
						$('#formSubmit').submit();
					}
				}
			});
		});
	</script> </content>
</body>
