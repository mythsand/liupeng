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
	<link rel="stylesheet" href="css/style.css" media="all" />
	<!--[if IE]><link rel="stylesheet" href="css/ie.css" media="all" /><![endif]-->
</head>
<body>
<div class="testing">
<header class="main">
	<h1><strong>Retina</strong> Dashboard</h1>
	<input type="text" value="search" />
</header>
<%--用户导航栏--%>
	<%@include file="navbar.jsp"%>
</div>
<%--功能菜单--%>
<%@include file="functions-list.jsp"%>
<section class="content">
	<section class="widget" style="min-height:300px">
		<header>
			<span class="icon">&#59160;</span>
			<hgroup>
				<h1>Blog</h1>
				<h2>Create new blog page</h2>
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
			<form action="/admin-project-change" method="post">
				<div class="field-wrap">
					<label class="label">项目编号</label><input type="text" value="项目编号" name="project_no"/>
				</div>
				<div class="field-wrap">
					<label class="label">项目名称</label>
					<input type="text" value="项目名称" name="title">
				</div>
				<div class="field-wrap">
					<label class="label">团队编号</label>
					<input type="text" value="团队编号" name="team_no"/>
				</div>
				<div class="field-wrap">
					<label class="label">起始日期</label>
					<input type="date" value="" name="start_date"/>
				</div>
				<div class="field-wrap">
					<label class="label">终止日期</label>
					<input type="date" value="" name="end_date"/>
				</div>
				<div class="field-wrap wysiwyg-wrap">
					<label class="label">项目描述</label>
					<textarea class="post" rows="5" name="description"></textarea>
				</div>
				<button type="submit" class="green">Post</button> <button type="submit" class="">Preview</button>
			</form>
		</div>
	</section>
</section>
<script src="js/jquery-1.6.1.min.js"></script>
<script src="js/jquery.wysiwyg.js"></script>
<script src="js/custom.js"></script>
<script src="js/cycle.js"></script>
<script src="js/jquery.checkbox.min.js"></script>
<!--<script src="js/flot.js"></script>
<script src="js/flot.resize.js"></script>
<script src="js/flot-graphs.js"></script>
<script src="js/flot-time.js"></script>
<script src="js/cycle.js"></script>-->
<script src="js/jquery.tablesorter.min.js"></script>
</body>
</html>