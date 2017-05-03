<!DOCTYPE html>
<%@page pageEncoding="utf-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="">
<head>
	<meta charset="utf-8">
	<title>Retina Dashboard</title>
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta name="robots" content="" />
	<meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0">
	<link rel="stylesheet" href="../css/style.css" media="all" />
	<!--[if IE]><link rel="stylesheet" href="../css/ie.css" media="all" /><![endif]-->
</head>
<body>
<div class="testing">
<header class="main">
	<h1><strong>Retina</strong> Dashboard</h1>
	<input type="text" value="search" />
</header>
<%@include file="navbar.jsp"%>
</div>
<%@include file="functions-list.jsp"%>
<c:if test="${msg}!=null">
	<section class="alert">
		<div class="green">
			<p>${msg}</p>
		</div>
	</section>
</c:if>

<section class="content">
	<section class="widget">
		<header>
			<span class="icon">&#128100;</span>
			<hgroup>
				<h1>Users</h1>
				<h2>Current member accounts</h2>
			</hgroup>
		</header>
		<div class="content">
			<table id="myTable" border="0" width="100">
				<thead>
					<tr>
						<th>姓名</th>
						<th>密码</th>
						<th>类别</th>
						<th>部门</th>
						<th>操作</th>
					</tr>
				</thead>
					<tbody>
					<c:forEach items="${admins}" var="admin">
						<tr>
							<td class="avatar"><img src="../images/uiface3.png" alt="" height="40" width="40" />${admin.name}</td>
							<td>${admin.passwd}</td>
							<td>${admin.type}</td>
							<td>${admin.department}</td>
							<td>
								<a href="/admin/admin-change-table?name=${admin.name}&type=1">修改</a>
								<a href="/admin/admin-admin-delete?name=${admin.name}&type=1">删除</a>
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			<button class="button"><a href="/admin/admin-add-table">添加新用户</a> </button>
		</div>
	</section>
</section>
<script src="../js/jquery-1.6.1.min.js"></script>
<script src="../js/jquery.wysiwyg.js"></script>
<script src="../js/custom.js"></script>
<script src="../js/cycle.js"></script>
<script src="../js/jquery.checkbox.min.js"></script>
<script src="../js/flot.js"></script>
<script src="../js/flot.resize.js"></script>
<script src="../js/flot-graphs.js"></script>
<script src="../js/flot-time.js"></script>
<script src="../js/cycle.js"></script>
<script src="../js/jquery.tablesorter.min.js"></script>
</body>
</html>