<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>   
<html>

	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" />
		<link rel="stylesheet" href="css/Site.css" />
		<link rel="stylesheet" href="css/zy.all.css" />
		<link rel="stylesheet" href="css/font-awesome.min.css" />
		<link rel="stylesheet" href="css/amazeui.min.css" />
		<link rel="stylesheet" href="css/admin.css" />
		<style>
		
		</style>
	<body>
		<div class="dvcontent">

			<div>
				<!--tab start-->
				<div class="tabs">
					<div class="hd">
						<ul style="">
							<li style="box-sizing: initial;-webkit-box-sizing: initial;" class="on">查看分类</li>
							<li class="" style="box-sizing: initial;-webkit-box-sizing: initial;">添加分类</li>
						</ul>
					</div>
					<div class="bd">
						<ul style="display: block;padding: 20px;">
							<li>
								<!--分页显示角色信息 start-->
								<div id="dv1">
									<table class="table" id="tbRecord">
										<thead>
										
											<tr>
												<th>分类编号</th>
												<th>分类名称</th>
												<th>分类描述</th>
												<th>备注</th>
												<th>编辑</th>
												<th>删除</th>
											</tr>
										</thead>
										<c:forEach items="${classifications}" var="list">
										<tbody>
											<tr>
												<td>${list.id}</td>
												<td>${list.cName}</td>
												<td>${list.describes}</td>
												<td>${list.note} </td>
												<td class="edit"><button onclick="btn_edit(id=${list.id})"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(id=${list.id})"><i class="icon-trash bigger-120"></i>删除</button></td>
										</tbody>
									</c:forEach>
									</table>
									
								</div>
								<!--分页显示角色信息 end-->
							</li>
						</ul>
						<ul class="theme-popbod dform" style="display: none;">
							<div class="am-cf admin-main" style="padding-top: 0px;">
			<!-- content start -->
			
	<div class="am-cf admin-main" style="padding-top: 0px;">
		<!-- content start -->
		<div class="admin-content">
			<div class="admin-content-body">
				
				<div class="am-g">
					<div class="am-u-sm-12 am-u-md-4 am-u-md-push-8">
						
					</div>
					<div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4"
						style="padding-top: 30px;">
						<form class="am-form am-form-horizontal"
							action="insert" method="post">
						
							<div class="am-form-group">
								<label for="user-name"  class="am-u-sm-3 am-form-label">
									分类名称</label>
								<div class="am-u-sm-9">
									<input type="text" id="name" required
										placeholder="分类名称" name="cName">
										<small>10字以内...</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-intro" class="am-u-sm-3 am-form-label">
									备注</label>
								<div class="am-u-sm-9">
									<textarea class="" rows="5" id="note" name="note"
										placeholder="输入备注"></textarea>
									<small>250字以内...</small>
								</div>
							</div>
							<div class="am-form-group">
								<div class="am-u-sm-9 am-u-sm-push-3">
									<input type="submit" class="am-btn am-btn-success" value="添加分类" />
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		
		</div>
		<!-- content end -->
	</div>
							<!-- end-->
						</ul>
					</div>
				</div>
				<!--tab end-->

			</div>

			
			 <script src="js/jquery-1.7.2.min.js" type="text/javascript"></script>
              <script src="js/plugs/Jqueryplugs.js" type="text/javascript"></script>
              <script src="js/_layout.js"></script>
             <script src="js/plugs/jquery.SuperSlide.source.js"></script>
			<script>
				var num = 1;
				$(function() {

				 $(".tabs").slide({ trigger: "click" });

				});

	
				var btn_save = function() {
					var id = $("#RawMaterialsTypePageId  option:selected").val();
					var  name = $("#RawMaterialsTypeName").val();
					var  describes= $("#RawMaterialsTypeDescription").val();
					var ramark = $("#Ramark").val();
					$.ajax({
						type: "post",
						url: "insert",
						data: { cName: c_name, note: note, statuss: statuss, describes: describes },
						success: function(data) {
							if(data > 0) {
								$.jq_Alert({
									message: "添加成功",
									btnOktext: "确认",
									dialogModal: true,
									btnOkClick: function() {
										//$("#RawMaterialsTypeName").val("");
										//$("#RawMaterialsTypeDescription").val("");
										//$("#Ramark").val("");                           
										//page1();
										location.reload();

									}
								});
							}
						}
					});
					alert(t);
				}

				var btn_edit= function(id) {
					$.jq_Panel({
						message: "是否可以修改?",
						btnOkClick: function() {
							$.ajax({
								type: "post",
								url: "select",
								data: { id: id },
								success: function(data) {
									if(data > 0) {
										$.jq_Alert({
											message: "删除成功",
											
											btnOkClick: function() {
												
												page1();
											}
										});
									}
								}
							});
						}
					});
				}
				var btn_delete = function(id) {
					$.jq_Confirm({
						message: "您确定要删除吗?",
						btnOkClick: function() {
							$.ajax({
								type: "post",
								url: "delete",
								data: { id: id },
								success: function(data) {
									if(data > 0) {
										$.jq_Alert({
											message: "删除成功",
											
											btnOkClick: function() {
												
												page1();
											}
										});
									}
								}
							});
						}
					});
				}
			</script>

		</div>
	</body>

</html>