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
			<form action="" method="post">
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
					<textarea class="post" rows="5"></textarea>
				</div>
				<button type="submit" class="green">Post</button> <button type="submit" class="">Preview</button>
			</form>
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