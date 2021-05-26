<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<title>Danh sách người dùng</title>

<body>
	<div class="container">
		<h2 style="margin-top: 100px; margin-left: 5%;">Quản lí sản phẩm</h2>
		<form action="quan-ly-san-pham/them-san-pham">
			<div class="row">
				<div class="col-1"></div>
				<div class="col-7">
					<div class="form-group">
						<label for="exampleFormControlSelect1">Danh Mục</label> 
						<select class="form-control" id="exampleFormControlSelect1">
						<c:forEach items="${list}" var="danhmuc">
							<option>${danhmuc.ten}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="col-1"></div>
				<div class="col-3" style="margin-top: 29px;">
					<button type="submit" class="btn btn-primary">Thêm sản phẩm</button>
				</div>
			</div>

			<table class="table table-bordered" style="margin-left: 5%;"
				id="dataTable" >
				<thead>
					<tr>
						<th>STT</th>
						<th>Tên</th>
						<th>Giá</th>
						<th>Mô tả</th>
						<th>Ngày tạo</th>
						<th>Người tạo</th>
						<th>Lượt mua</th>
						<th>Thời gian bảo hành</th>
						<th>Thương hiệu</th>
						<th>Quản lý</th>
					</tr>
					</thead>
					<tbody>
				<c:forEach items="${dsSanPham}" var="sp">
					<tr>
						<td>${sp.id }</td>
						<td>${sp.ten}</td>
						<td>${sp.gia }</td>
						<td>${sp.moTa}</td>
						<td>${sp.ngayTao }</td>
						<td>${sp.nguoiTao }</td>
						<td>${sp.soLuotMua }</td>
						<td>${sp.thoiGianBaoHanh }</td>
						<td>${sp.thuongHieu }</td>
						<td><a href="quan-ly-san-pham/sua-trang-san-pham/${sp.id}"><i
								class="far fa-edit"></i></a></td>
					</tr>
				</c:forEach>
			</tbody>
			</table>
			
			

		</form>
		

		<div class="row">
		<div class="col-1"></div>
			<div class="col-lg-10 col-md-10 col-10">
				<nav aria-label="Page navigation">
					<ul class="pagination" id="pagination"></ul>
					<input type="hidden" value="" id="page" name="page" /> <input
						type="hidden" value="" id="limit" name="limit" />
				</nav>
			</div>
		</div>
		
		
		
		
		
		
		
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

		
	</div>
</body>
