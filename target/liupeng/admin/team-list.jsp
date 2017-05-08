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
				<h1>团队管理</h1>
				<h2>当前团队列表</h2>
			</hgroup>
		</header>
		<div class="content">
			<table id="myTable" border="0" width="100">
				<thead>
					<tr>
						<th></th>
						<th>项目编号</th>
						<th>队长姓名</th>
						<th>指导老师</th>
						<th>操作</th>
					</tr>
				</thead>
					<tbody>
					<c:forEach items="${teams}" var="team">
						<tr>
							<td><input type="checkbox"/>${team.id} </td>
							<td>${team.teamNo}</td>
							<td>${team.leaderByTeam.name}</td>
							<td>${team.teacherByTeam.name}</td>
							<td>
								<a href="/admin/admin-team-delete?name=${team.teamNo}&type=1">删除</a>
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			<button class="button"><a href="/admin/team-add-team">添加队伍</a> </button>
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