<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<title>Danh sách người dùng</title>

<body>

	<div id="layoutSidenav_content">
		<main>
		<div class="container-fluid">
			<form action="<c:url value='/quan-tri/quan-ly-san-pham/?page=${abstractDTO.page}&limit=${abstractDTO.limit}'/>" id="formSubmit"> 
			<div class="row">
			<div class="col-4">
				<h1 class="mt-4">Quản lý sản phẩm</h1>
			</div>
			</div>
				<!-- dangh muc -->
				<div class="row">
					<div class="col-8">
						<div class="form-group">
							<label for="exampleFormControlSelect1">Danh Mục</label> <select
								class="form-control" id="exampleFormControlSelect1" name="maDM">
								<c:forEach items="${list}" var="danhmuc">
									<option value="${danhmuc.id}">${danhmuc.ten}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="col-4" style="margin-top: 29px;">
						<a href="<c:url value='/quan-tri/quan-ly-san-pham/them-san-pham'/>" class="btn btn-primary">Thêm sản phẩm</a>
					</div>
				</div>
				<!-- dangh muc -->

				<div class="card mb-4">
					<div class="card-header">
						<i class="fas fa-table mr-1"></i> Danh sách sản phẩm
					</div>

					<div class="card-body">

						<div class="table-responsive">

							<table class="table table-bordered" id="dataTable" width="100%"
								cellspacing="0">
								<thead>
									<tr class="text-center">
										<th>STT</th>
										<th>Tên</th>
										<th>Giá gốc</th>
										<th>Giá khuyến mãi</th>
										<th>Lượt mua</th>
										<th>Lượt xem</th>
										<th>Thời gian bảo hành (tháng)</th>
										<th>Thương hiệu</th>
										<th >Trạng thái</th>
										<th style="width: 10%">Quản lý</th>

									</tr>
								</thead>

								<tbody>
									<c:forEach items="${dsSanPham}" var="sp" varStatus="count">
										<tr>
											<td>${count.count}</td>
											<td>${sp.ten}</td>
											<td><span><fmt:formatNumber type="number" pattern = "#,### VND" value="${sp.gia}" /></span></td>
											<td><span><fmt:formatNumber type="number" pattern = "#,### VND" value="${sp.gia - sp.gia*sp.phanTramGiamGia/100}" /></span></td>
											<td>${sp.soLuotMua }</td>
											<td>${sp.soLuotXem }</td>
											<td>${sp.thoiGianBaoHanh == 0? "Không bảo hành" : sp.thoiGianBaoHanh }</td>
											<td>${sp.thuongHieu }</td>
											<td>${sp.trangThai? "Đang bán" : "Tạm ngưng" }</td>
											<td class="text-center">
											<a href=" <c:url value="/quan-tri/quan-ly-san-pham/sua-san-pham/${sp.id}" />" class="mr-2"><i class="far fa-edit"></i></a>
											
											<button  type="button" onclick="myFunction(${sp.id})" ><i class="fas fa-trash-alt "></i></button>											
											</td>
										</tr>
									</c:forEach>
								</tbody>

							</table>

							<div class="row">
								<div class="col-lg-12 col-md-12 col-12">
									<nav aria-label="Page navigation">
										<ul class="pagination" id="pagination"></ul>
										<input type="hidden" value="" id="page" name="page" /> <input
											type="hidden" value="" id="limit" name="limit" />
									</nav>
								</div>
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>

		</main>

	</div>

	<content tag="script"> <script type="text/javascript">
		var totalPages = ${abstractDTO.totalPage};
		var currentPage = ${abstractDTO.page};
		var limit = ${abstractDTO.limit};
		$(function() {
			window.pagObj = $('#pagination').twbsPagination({
				totalPages : totalPages,
				visiblePages : 10,
				startPage : currentPage,
				onPageClick : function(event, page) {
					if (currentPage != page) {
						$('#limit').val(limit);
						$('#page').val(page);
						$('#formSubmit').submit();
					}
				}
			});
		});
		
		// thay đổi trạng thái sản phẩm
		
		function myFunction(id) {
            var r = confirm("bạn có thay đổi trạng thái sản phẩm ?");
            if (r == true) {
                window.location.href= "http://localhost:8080/website-dungcuthethao/quan-tri/quan-ly-san-pham/xoa-san-pham/"+id;
            } else{
				alert("Đã hủy thay đổi")
			}
          
        }
	</script> </content>
</body>
