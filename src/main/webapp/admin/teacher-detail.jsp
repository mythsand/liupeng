<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@page pageEncoding="utf-8" language="java" %>
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
		<h1><strong>大创管理平台</strong> </h1>
		<input type="text" value="搜索..." />
	</header>
<%@include file="navbar.jsp"%>
</div>
<%@include file="functions-list.jsp"%>

<section class="alert">
	<div class="green">	
		<p>此处查看教师详细信息，如需修改，请返回上一层 <a href="/admin/admin-teacher-list">列表</a> </p>
		<span class="close">&#10006;</span>
	</div>
</section>
<section class="content">
	<section class="widget" style="min-height:300px">
		<header>
			<span class="icon">&#59160;</span>
			<hgroup>
				<h1>教师个人详细信息</h1>
			</hgroup>
		</header>
		<div class="content">
			<table id="myTable" border="0" width="100">
				<thead>
				<h2 align="center">${teacherEntity.name}的详细信息</h2>
				</thead>
				<tbody>
				<tr align="center">
					<td colspan="2">
						<img src="../images/uiface2.png">
					</td>
				</tr>
				<tr align="center">
					<td>姓名：</td>
					<td>${teacherEntity.name}</td>
				</tr>
				<tr align="center">
					<td>工号：</td>
					<td>${teacherEntity.teaNo}</td>
				</tr>
				<tr align="center">
					<td>所在学院：</td>
					<td>${teacherEntity.college}</td>
				</tr>
				<tr align="center">
					<td>指导团队：</td>
					<td>
						<ul>
							<c:forEach items="${teamEntityList}" var="team">
								<li>${team.teamNo}</li>
							</c:forEach>
						</ul>
					</td>
				</tr>
				</tbody>
			</table>
		</div>
	</section>
	<div class="widget-container">
		<section class="widget small">
			<header>
				<span class="icon">&#59168;</span>
				<hgroup>
					<h1>学生留言</h1>
				</hgroup>
			</header>
			<div class="content no-padding timeline">
				<div class="tl-post comments">
					<span class="icon">&#59168;</span>
					<p>
						<a href="#">123说:</a> 请问什么时候开始中期检查？
						<span class="reply"><input type="text" value="Respond to comment..."/></span>
					</p>
				</div>
				<div class="tl-post comments">
					<span class="icon">&#59168;</span>
					<p>
						<a href="#">meme说:</a> 如何实现浏览器的跨域访问？
						<span class="reply"><input type="text" value="Respond to comment..."/></span>
					</p>
				</div>
				<span class="show-more"><a	 href="#">More</a></span>
			</div>
		</section>
		
		<section class="widget small">
			<header> 
				<span class="icon">&#128196;</span>
				<hgroup>
					<h1>指导经历</h1>
				</hgroup>
			</header>
			<div class="content no-padding timeline">
				<div class="tl-post">
					<span class="icon">&#59185;</span>
					<p>2016年指导完成国家级大创</p>
				</div>
				<div class="tl-post">
					<span class="icon">&#59185;</span>
					<p>2015年指导完成省级大创</p>
				</div>
				<div class="tl-post">
					<span class="icon">&#59185;</span>
					<p>2014年指导完成校级大创</p>
				</div>
			</div>
		</section>
	</div>
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