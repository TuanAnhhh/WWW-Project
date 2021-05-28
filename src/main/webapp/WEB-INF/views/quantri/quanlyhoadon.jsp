<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<title>Quản lý hóa đơn</title>

<body>
	<div id="layoutSidenav_content">
		<main>
		<div class="container-fluid">
		<form action="<c:url value='/quan-tri/quan-ly-hoa-don?page=${abstractDTO.page}&limit=${abstractDTO.limit}'/>" id="formSubmit"> 
			<h1 class="mt-4">Quản lý hóa đơn</h1>
			
			<div class="card mb-4">
				<div class="card-header">
					<i class="fas fa-table mr-1"></i> Danh sách hóa đơn đã lập
				</div>

				<div class="card-body">

					<div class="table-responsive">
						
						<table class="table table-bordered" id="dataTable" width="100%"
							cellspacing="0">
							<thead>
								<tr>
									<th>STT</th>
									<th>ID</th>
									<th>Tác vụ</th>
									
								</tr>
							</thead>

							<tbody>
							<c:forEach items="${dsHD}" var="nd" varStatus="stt">
								<tr>
									<td>${stt.count}</td>
									<td>${nd.id }</td>
								
									<td>
									<a href="" class="mr-2 ml-2"><i class="far fa-edit"></i></a>
									<a href=""><i class="fas fa-trash-alt"></i></a>
									
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
	</script> </content>
</body>
