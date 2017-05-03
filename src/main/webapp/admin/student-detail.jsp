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
		<p>Hi Lee, you have <a href="#">3 new pages</a> and <a href="#">16 comments</a> to approve, better get going!</p>
		<span class="close">&#10006;</span>
	</div>
</section>
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
			<%--<div class="field-wrap">--%>
				<%--<input type="text" value="Title"/>--%>
			<%--</div>--%>
			<%--<div class="field-wrap">--%>
				<%--<input type="text" value="Author"/>--%>
			<%--</div>--%>
			<%--<div class="field-wrap">--%>
				<%--<input type="text" value="Tags"/>--%>
			<%--</div>--%>
			<%--<div class="field-wrap wysiwyg-wrap">--%>
				<%--<textarea class="post" rows="5"></textarea>--%>
			<%--</div>--%>
			<%--<button type="submit" class="green">Post</button> <button type="submit" class="">Preview</button>--%>
			<table id="myTable" border="0" width="100">
				<thead>
				<h2 align="center">学生详细信息</h2>
				</thead>
				<tbody>
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
					<h1>Latest comments</h1>
					<h2>What they're saying</h2>
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
			<div class="content no-padding timeline">
				<div class="tl-post comments">
					<span class="icon">&#59168;</span>
					<p>
						<a href="#">John Doe says:</a> Lorem ipsum dolor sit amet, consecteteur adipiscing elit sed diam nonummy.
						<span class="reply"><input type="text" value="Respond to comment..."/></span>
					</p>
				</div>
				<div class="tl-post comments">
					<span class="icon">&#59168;</span>
					<p>
						<a href="#">John Doe says:</a> Lorem ipsum dolor sit amet, consecteteur adipiscing elit sed diam nonummy.
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
					<h1>Other pages</h1>
					<h2>More pages</h2>
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
			<div class="content no-padding timeline">
				<div class="tl-post">
					<span class="icon">&#59185;</span>
					<p><a href="#">eCommerce design</a> service page.</p>
				</div>
				<div class="tl-post">
					<span class="icon">&#59185;</span>
					<p><a href="#">Search engine optimisation</a> service page..</p>
				</div>
				<div class="tl-post">
					<span class="icon">&#59185;</span>
					<p><a href="#">Website design</a> service page.</p>
				</div>
				<div class="tl-post">
					<span class="icon">&#59185;</span>
					<p><a href="#">Graphic design</a> service page.</p>
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