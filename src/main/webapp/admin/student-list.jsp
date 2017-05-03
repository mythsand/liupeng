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
	<h1>大创管理系统</h1>
	<input type="text" value="search" />
</header>
<%@include file="navbar.jsp"%>
</div>
<%@include file="functions-list.jsp"%>

<section class="content">
	<section class="widget">
		<header>
			<span class="icon">&#128100;</span>
			<hgroup>
				<h1>学生列表</h1>
			</hgroup>
		</header>
		<div class="content">
			<table id="myTable" border="0" width="100">
				<thead>
					<tr>
						<th class="avatar">学生姓名</th>
						<th>学号</th>
						<th>学院</th>
						<th>操作</th>
					</tr>
				</thead>
					<tbody>
					<c:forEach items="${students}" var="student">
						<tr>
							<td class="avatar"><img src="../images/uiface1.png" alt="" height="40" width="40" /><a href="admin-student-detail?name=${student.name}">${student.name}</a> </td>
							<td>${student.stuNo}</td>
							<td>${student.college}</td>
							<td>
								<a href="/admin/student-change-table?stu_no=${student.stuNo}&name=${student.name}">修改</a>&nbsp;&nbsp;
								<a href="/admin/admin-student-delete?stu_no=${student.stuNo}" ><font color="gray">删除</font></a>
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
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