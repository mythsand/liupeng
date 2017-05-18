<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="">
<head>
	<meta charset="utf-8">
	<title>文件下载</title>
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta name="robots" content="" />
	<meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0">
	<link rel="stylesheet" href="../css/style.css" media="all" />
	<link rel="stylesheet" href="../css/dropzone.css" media="all" />
	<!--[if IE]><link rel="stylesheet" href="../css/ie.css" media="all" /><![endif]-->
</head>
<body>
<div class="testing">
<header class="main">
	<h1><strong>大创管理平台</strong></h1>
	<input type="text" value="搜索..." />
</header>
<%--用户导航栏--%>
<%@include file="navbar.jsp"%>
</div>
<%--功能菜单--%>
<%@include file="functions-list.jsp"%>

<%--<section class="alert">--%>
	<%--<div class="green">	--%>
		<%--<p>Hi Lee, you have <a href="#">3 new pages</a> and <a href="#">16 comments</a> to approve, better get going!</p>--%>
		<%--<span class="close">&#10006;</span>--%>
	<%--</div>--%>
<%--</section>--%>
<section class="content">
	<section class="widget">
		<header>
			<span class="icon">&#127748;</span>
			<hgroup>
				<h1>文件查看与下载</h1>
				<h2>所有文件</h2>
			</hgroup>
			<aside>
				<span>
					<a href="#">&#9881;</a>
					<ul class="settings-dd">
						<li><label>Option a</label><input type="checkbox" /></li>
						<li><label>Option b</label><input type="checkbox" checked="checked" /></li>
						<li><label>Option c</label><input type="checkbox" /></li>
					</ul>
				</span>
			</aside>
		</header>
		<div class="content">
			<table id="myTable" border="0" width="100">
				<thead>
				<tr>
					<th>项目编号</th>
					<th >项目名称</th>
					<th>团队编号</th>
					<th>开始日期</th>
					<th>截止日期</th>
					<th>下载文件</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach items="${projects}" var="project">
					<tr>
						<td><input type="checkbox" /> ${project.projectNo}</td>
						<td>${project.title}</td>
						<td>${project.teamNo}</td>
						<td>${project.startDate}</td>
						<td>${project.endDate}</td>
						<td><button class="button">下载</button></td>
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
<script src="../js/jquery.checkbox.min.js"></script>
<!--<script src="../js/flot.js"></script>
<script src="../js/flot.resize.js"></script>
<script src="../js/flot-time.js"></script>
<script src="../js/flot-pie.js"></script>
<script src="../js/flot-graphs.js"></script>
<script src="../js/cycle.js"></script>-->
<script src="../js/jquery.tablesorter.min.js"></script>
<!--<script src="../js/dropzone.js"></script>-->
</body>
</html>