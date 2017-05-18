<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<header class="main">
	<h1><strong>大创管理平台</strong></h1>
	<input type="text" value="搜索..." />
</header>
	<%--用户导航栏--%>
	<%@include file="navbar.jsp"%>
	<%--用户导航栏--%>
</div>
<%--功能菜单--%>
<%@include file="functions-list.jsp"%>
<%--功能菜单--%>
<section class="content">
	<section class="widget" style="min-height:300px">
		<header>
			<span class="icon">&#59160;</span>
			<hgroup>
				<h1>通知</h1>
				<h2>发布通知</h2>
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
		<form action="/admin/admin-blog-news" method="get" class="content">
			<div class="field-wrap">
				<input type="text" name="title" value="标题"/>
			</div>
			<div class="field-wrap">
				<input type="text" name="author" value="作者"/>
			</div>
			<%--<div class="field-wrap">--%>
				<%--<input type="text" value="标签"/>--%>
			<%--</div>--%>
			<div class="field-wrap wysiwyg-wrap">
				<textarea name="content" class="post" rows="5"></textarea>
			</div>
			<button type="submit" class="green">发送</button> <button type="submit" class="">预览</button>
		</form>
	</section>
	<%--<div class="widget-container">--%>
		<%--<section class="widget small">--%>
			<%--<header>--%>
				<%--<span class="icon">&#59168;</span>--%>
				<%--<hgroup>--%>
					<%--<h1>Latest comments</h1>--%>
					<%--<h2>What they're saying</h2>--%>
				<%--</hgroup>--%>
				<%--<aside>--%>
					<%--<span>--%>
						<%--<a href="#">&#9881;</a>--%>
						<%--<ul class="settings-dd">--%>
							<%--<li><label>Option a</label><input type="checkbox" /></li>--%>
							<%--<li><label>Option b</label><input type="checkbox" checked="checked" /></li>--%>
							<%--<li><label>Option c</label><input type="checkbox" /></li>--%>
						<%--</ul>--%>
					<%--</span>--%>
				<%--</aside>--%>
			<%--</header>--%>
			<%--<div class="content no-padding timeline">--%>
				<%--<div class="tl-post comments">--%>
					<%--<span class="icon">&#59168;</span>--%>
					<%--<p>--%>
						<%--<a href="#">John Doe says:</a> Lorem ipsum dolor sit amet, consecteteur adipiscing elit sed diam nonummy.--%>
						<%--<span class="reply"><input type="text" value="Respond to comment..."/></span>--%>
					<%--</p>--%>
				<%--</div>--%>
				<%--<div class="tl-post comments">--%>
					<%--<span class="icon">&#59168;</span>--%>
					<%--<p>--%>
						<%--<a href="#">John Doe says:</a> Lorem ipsum dolor sit amet, consecteteur adipiscing elit sed diam nonummy.--%>
						<%--<span class="reply"><input type="text" value="Respond to comment..."/></span>--%>
					<%--</p>--%>
				<%--</div>--%>
				<%--<span class="show-more"><a	 href="#">More</a></span>--%>
			<%--</div>--%>
		<%--</section>--%>
		<%----%>
		<%--<section class="widget small">--%>
			<%--<header> --%>
				<%--<span class="icon">&#128196;</span>--%>
				<%--<hgroup>--%>
					<%--<h1>Other pages</h1>--%>
					<%--<h2>More pages</h2>--%>
				<%--</hgroup>--%>
				<%--<aside>--%>
					<%--<span>--%>
						<%--<a href="#">&#9881;</a>--%>
						<%--<ul class="settings-dd">--%>
							<%--<li><label>Option a</label><input type="checkbox" /></li>--%>
							<%--<li><label>Option b</label><input type="checkbox" checked="checked" /></li>--%>
							<%--<li><label>Option c</label><input type="checkbox" /></li>--%>
						<%--</ul>--%>
					<%--</span>--%>
				<%--</aside>--%>
			<%--</header>--%>
			<%--<div class="content no-padding timeline">--%>
				<%--<div class="tl-post">--%>
					<%--<span class="icon">&#59185;</span>--%>
					<%--<p><a href="#">eCommerce design</a> service page.</p>--%>
				<%--</div>--%>
				<%--<div class="tl-post">--%>
					<%--<span class="icon">&#59185;</span>--%>
					<%--<p><a href="#">Search engine optimisation</a> service page..</p>--%>
				<%--</div>--%>
				<%--<div class="tl-post">--%>
					<%--<span class="icon">&#59185;</span>--%>
					<%--<p><a href="#">Website design</a> service page.</p>--%>
				<%--</div>--%>
				<%--<div class="tl-post">--%>
					<%--<span class="icon">&#59185;</span>--%>
					<%--<p><a href="#">Graphic design</a> service page.</p>--%>
				<%--</div>--%>
			<%--</div>--%>
		<%--</section>--%>
	<%--</div>--%>
</section>
<script src="../js/jquery-1.6.1.min.js"></script>
<script src="../js/jquery.wysiwyg.js"></script>
<script src="../js/custom.js"></script>
<script src="../js/cycle.js"></script>
<script src="../js/jquery.checkbox.min.js"></script>
<!--<script src="js/flot.js"></script>
<script src="js/flot.resize.js"></script>
<script src="js/flot-graphs.js"></script>
<script src="js/flot-time.js"></script>
<script src="js/cycle.js"></script>-->
<script src="../js/jquery.tablesorter.min.js"></script>
</body>
</html>