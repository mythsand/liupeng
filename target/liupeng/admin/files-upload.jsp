<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="">
<head>
	<meta charset="utf-8">
	<title>文件上传</title>
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
			<span class="icon">&#59153;</span>
			<hgroup>
				<h1>文件上传</h1>
				<h2>拖拽到此处</h2>
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
			<div id="dropzone">
				<form action="/stu/file-upload" class="dropzone" id="my-awesome-dropzone" enctype="multipart/form-data", method="post">
					<div><p>项目编号：</p><input class="field-wrap" type="text" name="project_id"></div>
					<div><p class="processing">上传文件：</p><input type="file" name="file"></div>
					<input type="submit" value="提交">
				</form>
			</div>
		</div>
	</section>
</section>
<script src="../js/jquery-1.6.1.min.js"></script>
<script src="../js/jquery.wysiwyg.js"></script>
<script src="../js/custom.js"></script>
<script src="../js/jquery.checkbox.min.js">gi</script>
<!--<script src="../js/flot.js"></script>
<script src="../js/flot.resize.js"></script>
<script src="../js/flot-time.js"></script>
<script src="../js/flot-pie.js"></script>
<script src="../js/flot-graphs.js"></script>
<script src="../js/cycle.js"></script>-->
<script src="../js/jquery.tablesorter.min.js"></script>
<script src="../js/dropzone.js"></script>
</body>
</html>