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
	<h1><strong>Retina</strong> Dashboard</h1>
	<input type="text" value="search" />
</header>
<%@include file="navbar.jsp"%>
</div>
<%@include file="functions-list.jsp"%>
<section class="alert">
	<div class="green">
		<p>在此处进行学生信息的详细查看，如需进行修改，请返回上一层<a href="/admin/admin-student-list">列表</a> ！</p><span class="close">&#10006;</span>
	</div>
</section>

<section class="content">
	<section class="widget" style="min-height:300px">
		<header>
			<span class="icon">&#59160;</span>
			<hgroup>
				<h1>学生详细信息</h1>
			</hgroup>
		</header>
		<div class="content">
			<table id="myTable" border="0" width="100">
				<thead>
				<h2 align="center">学生详细信息</h2>
				</thead>
				<tbody>
				<tr align="center">
					<td colspan="2"><img src="../images/uiface1.png"></td>
				</tr>
				<tr align="center">
					<td>学生姓名：</td>
					<td>${studentEntity.name}</td>
				</tr>
				<tr align="center">
					<td>学号：</td>
					<td>${studentEntity.stuNo}</td>
				</tr>
				<tr align="center">
					<td>所在学院：</td>
					<td>${studentEntity.college}</td>
				</tr>
				<tr align="center">
					<td>学生姓名：</td>
					<td>${studentEntity.name}</td>
				</tr>
				<tr align="center">
					<td>团队编号：</td>
					<td>${studentEntity.memberByTeamId}</td>
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
					<h1>指导教师评语</h1>
				</hgroup>
			</header>
			<div class="content no-padding timeline">
				<div class="tl-post comments">
					<span class="icon">&#59168;</span>
					<p>
						该生思维独特，勤奋踏实，创新能力强！
					</p>
				</div>
				<div class="tl-post comments">
					<span class="icon">&#59168;</span>
					<p>
						该生思维独特，勤奋踏实，创新能力强！
					</p>
				</div>
				<span class="show-more"><a	 href="#">More</a></span>
			</div>
		</section>
		
		<section class="widget small">
			<header> 
				<span class="icon">&#128196;</span>
				<hgroup>
					<h1>主要经历</h1>
				</hgroup>
			</header>
			<div class="content no-padding timeline">
				<div class="tl-post">
					<span class="icon">&#59185;</span>
					<p>2016年完成国家级大创项目</p>
				</div>
				<div class="tl-post">
					<span class="icon">&#59185;</span>
					<p>2015年完成省级大创项目</p>
				</div>
				<div class="tl-post">
					<span class="icon">&#59185;</span>
					<p>2014年完成校级大创项目</p>
				</div>
				<div class="tl-post">
					<span class="icon">&#59185;</span>
					<p>获得优秀学生称号</p>
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
<!--<script src="../js/flot.js"></script>
<script src="../js/flot.resize.js"></script>
<script src="../js/flot-graphs.js"></script>
<script src="../js/flot-time.js"></script>
<script src="../js/cycle.js"></script>-->
<script src="../js/jquery.tablesorter.min.js"></script>
</body>
</html>