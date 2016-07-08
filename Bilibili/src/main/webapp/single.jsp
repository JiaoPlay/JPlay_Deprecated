<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE jsp>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!--[if lt IE 7 ]><jsp class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><jsp class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><jsp class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><jsp lang="en"> <!--<![endif]-->
<head>

	<!-- Basic Page Needs
  ================================================== -->
	<meta charset="utf-8">
	<title>视频观看</title>
	<meta name="description" content="Free Responsive jsp5 Css3 Templates | zerotheme.com">
	<meta name="author" content="www.zerotheme.com">

	<!-- Mobile Specific Metas
  ================================================== -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

	<!-- CSS
  ================================================== -->
	<link rel="stylesheet" href="css/zerogrid.css">
	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" href="css/menu.css">
	<link rel="stylesheet" href="bootstrap-3.3.5-dist/css/bootstrap.min.css">
	<!-- Owl Carousel Assets -->
	<link href="css/owl.carousel.css" rel="stylesheet">
	<link href="css/owl.theme.css" rel="stylesheet">
	<!-- Custom Fonts -->
	<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

	<!--[if lt IE 8]>
	<div style=' clear: both; text-align:center; position: relative;'>
		<a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
			<img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
		</a>
	</div>
	<![endif]-->
	<!--[if lt IE 9]>
	<script src="js/jsp5.js"></script>
	<script src="js/css3-mediaqueries.js"></script>
	<script src="js/jquery-2.1.1.js"></script>
	<script src="bootstrap-3.3.5-dist/js/bootstrap.min.js">
	<![endif]-->
	<!-- 评论功能的实现-->
	<script>
		window.onload = function(){
			/*var arrIcon = ['http://www.xttblog.com/icons/favicon.ico','http://www.xttblog.com/wp-content/uploads/2016/03/123.png'];*/
			var num = 0;     //控制头像改变
			var iNow = -1;    //用来累加改变左右浮动
			/*var icon = document.getElementById('user_face_icon').getElementsByTagName('img');*/
			var btn = document.getElementById('comment-btn');
			var text = document.getElementById('comment-text');
			var content = document.getElementsById('comment-field');
			/*var img = content.getElementsByTagName('img');
			 var span = content.getElementsByTagName('span');*/

			/*			icon[0].onclick = function(){
			 if(num==0){
			 this.src = arrIcon[1];
			 num = 1;
			 }else if(num==1){
			 this.src = arrIcon[0];
			 num = 0;
			 }
			 }*/
			btn.onclick = function(){
				if(text.value ==''){
					alert('不能发送空消息');
				}else {
					content.innerHTML += '<li><img src="'+arrIcon[num]+'"><span>'+text.value+'</span></li>';
					iNow++;
					/*		if(num==0){
					 img[iNow].className += 'imgright';
					 span[iNow].className += 'spanright';
					 }else {
					 img[iNow].className += 'imgleft';
					 span[iNow].className += 'spanleft';
					 }*/
					text.value = '';
					// 内容过多时,将滚动条放置到最底端
					content.scrollTop=content.scrollHeight;
				}
			}
		}

	</script>

</head>
<body id="wrapper" >
<div class="wrap-body">

	<!--////////////////////////////////////Header-->
	<header>
		<div class="wrap-header">
			<div class="zerogrid">
				<div class="row">
					<a href="index.jsp" class="logo"><img src="images/logo.png" /></a>
					<ul class="social">
						<li><a href="upload.jsp" title="Upload Video"><i class="fa fa-upload"></i>上传</a></li>
						<li><a href="login.jsp" title="Log in"><i class="fa fa-user"></i>登陆</a></li>
						<li><a href="register.jsp" title="Register"><i class="fa fa-bell">注册</i></a></li>
					</ul>
				</div>
			</div>
		</div>
	</header>
	<!--////////////////////////////////////Menu-->
	<a href="#" class="nav-toggle">Toggle Navigation</a>
	<nav class="cmn-tile-nav">
		<ul class="clearfix">
			<li class="colour-1"><a href="gallery.jsp">番剧</a></li>
			<li class="colour-2"><a href="gallery.jsp">动画</a></li>
			<li class="colour-3"><a href="gallery.jsp">教学</a></li>
			<li class="colour-4"><a href="gallery.jsp">直播</a></li>
			<li class="colour-5"><a href="gallery.jsp">音乐</a></li>
			<li class="colour-6"><a href="gallery.jsp">舞蹈</a></li>
			<li class="colour-7"><a href="gallery.jsp">鬼畜</a></li>
			<li class="colour-8"><a href="gallery.jsp">娱乐</a></li>
		</ul>
	</nav>
	<!--////////////////////////////////////Container-->
	<section id="container" class="index-page">
		<div class="wrap-container zerogrid">
			<div class="row">
				<div id="main-content" class="col-2-3">
					<div class="wrap-vid">
						<!-- 视频播放-->
						<%--<iframe width="100%" height="400" src="videos/temp/VID_20150906_200134.mp4" frameborder="0" allowfullscreen></iframe>--%>
						<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
								codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,29,0"
								width="438" height="350">
							<param name="movie" value="tools/flvplayer.swf" />
							<param name="quality" value="high" />
							<param name="allowFullScreen" value="true" />
							<param name="FlashVars" value="vcastr_file=http://127.0.0.1:8080/videos/1467731424937.flv
									&LogoText=JPlay大学视频社区&BufferTime=3" />
							<embed src="tools/flvplayer.swf" allowfullscreen="true"
								   flashvars="vcastr_file=http://127.0.0.1:8080/videos/1467731424937.flv &LogoText=JPlay大学视频社区"
								   quality="high" pluginspage="http://www.macromedia.com/go/getflashplayer"
								   type="application/x-shockwave-flash" width="100%" height="75%">
							</embed>
						</object>
						<div class="barrage">
							<div class="barrage-content">
								<label>发表弹幕：</label>
								<input type="text" placeholder="在这里发表你的吐槽">
								<button type="submit">发送</button>
							</div>
						</div>
					</div>
					<div class="content-bkg">
						<div class="row">
							<div class="share">
								<div class="col-1-4">
									<div class="wrap-col">
										<div class="box-share">
											<a data-toggle="modal"  data-target="#myModal">
												<i class="fa fa-comments"></i>
												<span>评论</span>
											</a>
										</div>
									</div>
								</div>
								<div class="col-1-4">
									<div class="wrap-col">
										<div class="box-share">
											<a href="#">
												<i class="fa fa-share"></i>
												<span>分享 </span>
											</a>
										</div>
									</div>
								</div>
								<%int thumb=110; %>
								<div class="col-1-4">
									<div class="wrap-col">
										<div class="box-share">
											<a href="<s:url action='thumbcountVideoInfo'/>">
												<i class="fa fa-thumbs-up"></i>
												<span><%=thumb %></span>
											</a>
										</div>
									</div>
								</div>
								<div class="col-1-4">
									<div class="wrap-col">
										<div class="box-share">
											<a href="#">
												<i class="fa fa-plus"></i>
												<span>收藏</span>
											</a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="content-bkg">
						<h1 class="vid-name">交大军训</h1>
						<div class="info">
							<h5>By <a href="#">孙励天</a></h5>
							<span><i class="fa fa-calendar"></i>25/3/2015</span>
							<span><i class="fa fa-heart"></i>200</span>
						</div>

						<p>这次的军训之旅虽然短暂，我们的排练也远不尽如人意。其间经历了不少让我们蒙蔽的挫折，但一年后的今天细细回想，我们。。。</p>
					</div>
					<div class="tags">
						<label style="font-size: 140%">标签</label>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="#">交大军训</a>
						<a href="#">六连</a>
					</div>
					<section class="vid-related">
						<div class="header">
							<h2>Related</h2>
						</div>
						<div class="row"><!--Start Box-->
							<div id="owl-demo-1" class="owl-carousel">
								<div class="item wrap-vid">
									<div class="zoom-container">
										<a href="single.jsp">
											<span class="zoom-caption">
												<i class="icon-play fa fa-play"></i>
											</span>
											<img src="images/1.jpg" />
										</a>
									</div>
									<h3 class="vid-name"><a href="#">Video's Name</a></h3>
									<div class="info">
										<h5>By <a href="#">Kelvin</a></h5>
										<span><i class="fa fa-calendar"></i>25/3/2015</span>
										<span><i class="fa fa-heart"></i>1,200</span>
									</div>
								</div>
								<div class="item wrap-vid">
									<div class="zoom-container">
										<a href="single.jsp">
											<span class="zoom-caption">
												<i class="icon-play fa fa-play"></i>
											</span>
											<img src="images/2.jpg" />
										</a>
									</div>
									<h3 class="vid-name"><a href="#">Video's Name</a></h3>
									<div class="info">
										<h5>By <a href="#">Kelvin</a></h5>
										<span><i class="fa fa-calendar"></i>25/3/2015</span>
										<span><i class="fa fa-heart"></i>1,200</span>
									</div>
								</div>
								<div class="item wrap-vid">
									<div class="zoom-container">
										<a href="single.jsp">
											<span class="zoom-caption">
												<i class="icon-play fa fa-play"></i>
											</span>
											<img src="images/3.jpg" />
										</a>
									</div>
									<h3 class="vid-name"><a href="#">Video's Name</a></h3>
									<div class="info">
										<h5>By <a href="#">Kelvin</a></h5>
										<span><i class="fa fa-calendar"></i>25/3/2015</span>
										<span><i class="fa fa-heart"></i>1,200</span>
									</div>
								</div>
								<div class="item wrap-vid">
									<div class="zoom-container">
										<a href="single.jsp">
											<span class="zoom-caption">
												<i class="icon-play fa fa-play"></i>
											</span>
											<img src="images/4.jpg" />
										</a>
									</div>
									<h3 class="vid-name"><a href="#">Video's Name</a></h3>
									<div class="info">
										<h5>By <a href="#">Kelvin</a></h5>
										<span><i class="fa fa-calendar"></i>25/3/2015</span>
										<span><i class="fa fa-heart"></i>1,200</span>
									</div>
								</div>
								<div class="item wrap-vid">
									<div class="zoom-container">
										<a href="single.jsp">
											<span class="zoom-caption">
												<i class="icon-play fa fa-play"></i>
											</span>
											<img src="images/5.jpg" />
										</a>
									</div>
									<h3 class="vid-name"><a href="#">Video's Name</a></h3>
									<div class="info">
										<h5>By <a href="#">Kelvin</a></h5>
										<span><i class="fa fa-calendar"></i>25/3/2015</span>
										<span><i class="fa fa-heart"></i>1,200</span>
									</div>
								</div>
								<div class="item wrap-vid">
									<div class="zoom-container">
										<a href="single.jsp">
											<span class="zoom-caption">
												<i class="icon-play fa fa-play"></i>
											</span>
											<img src="images/14.jpg" />
										</a>
									</div>
									<h3 class="vid-name"><a href="#">Video's Name</a></h3>
									<div class="info">
										<h5>By <a href="#">Kelvin</a></h5>
										<span><i class="fa fa-calendar"></i>25/3/2015</span>
										<span><i class="fa fa-heart"></i>1,200</span>
									</div>
								</div>
								<div class="item wrap-vid">
									<div class="zoom-container">
										<a href="single.jsp">
											<span class="zoom-caption">
												<i class="icon-play fa fa-play"></i>
											</span>
											<img src="images/3.jpg" />
										</a>
									</div>
									<h3 class="vid-name"><a href="#">Video's Name</a></h3>
									<div class="info">
										<h5>By <a href="#">Kelvin</a></h5>
										<span><i class="fa fa-calendar"></i>25/3/2015</span>
										<span><i class="fa fa-heart"></i>1,200</span>
									</div>
								</div>
								<div class="item wrap-vid">
									<div class="zoom-container">
										<a href="single.jsp">
											<span class="zoom-caption">
												<i class="icon-play fa fa-play"></i>
											</span>
											<img src="images/5.jpg" />
										</a>
									</div>
									<h3 class="vid-name"><a href="#">Video's Name</a></h3>
									<div class="info">
										<h5>By <a href="#">Kelvin</a></h5>
										<span><i class="fa fa-calendar"></i>25/3/2015</span>
										<span><i class="fa fa-heart"></i>1,200</span>
									</div>
								</div>
							</div>
						</div>
					</section>
					<ul class="comment" id="comment-field">


					</ul>
				</div>

				<!-- 评论专用模态框（Modal） -->
				<div class="modal fade" id="myModal" tabindex="-1" role="dialog" style="width:100%"
					 aria-labelledby="myModalLabel" aria-hidden="true" >
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close"
										data-dismiss="modal" aria-hidden="true">
									&times;
								</button>
								<h4 class="modal-title" id="myModalLabel">
									添加评论
								</h4>
							</div>
							<form id="dlg-comment"action="commentAction.action">
								<div class="modal-body" style="padding-left: 2%" >
									<p>视频编号：<input type="text" readonly value="1" name="videoId"></p>
									<p>我的评论：
											<textarea required autofocus id="comment-text" name="commentContent" placeholder="在这里发表我的评论..."></textarea></p>
								</div>
								<div class="modal-footer">
									<button type="reset" class="btn btn-default"
											data-dismiss="modal">关闭
									</button>
									<button type="submit" class="btn btn-primary" id="comment-btn">
										上传
									</button>
								</div>
							</form>
						</div><!-- /.modal-content -->
					</div><!-- /.modal -->
				</div>
				<!-- End of dialog -->
			</div>

			<%--<div id="sidebar" class="col-1-3">
                <form id="form-container" action="">
                    <!--<input type="submit" id="searchsubmit" value="" />-->
                    <a class="search-submit-button" href="javascript:void(0)">
                        <i class="fa fa-search"></i>
                    </a>
                    <div id="searchtext">
                        <input type="text" id="s" name="s" placeholder="Search Something...">
                    </div>
                </form>
                <!---- Start Widget ---->
                <div class="widget wid-post">
                    <div class="wid-header">
                        <h5>Latest Posts</h5>
                    </div>
                    <div class="wid-content">
                        <div class="post wrap-vid">
                            <div class="zoom-container">
                                <a href="single.jsp">
                                    <span class="zoom-caption">
                                        <i class="icon-play fa fa-play"></i>
                                    </span>
                                    <img src="images/4.jpg" />
                                </a>
                            </div>
                            <div class="wrapper">
                                <h5 class="vid-name"><a href="#">Video's Name</a></h5>
                                <div class="info">
                                    <h6>By <a href="#">Kelvin</a></h6>
                                    <span><i class="fa fa-calendar"></i>25/3/2015</span>
                                    <span><i class="fa fa-heart"></i>1,200</span>
                                </div>
                            </div>
                        </div>
                        <div class="post wrap-vid">
                            <div class="zoom-container">
                                <a href="single.jsp">
                                    <span class="zoom-caption">
                                        <i class="icon-play fa fa-play"></i>
                                    </span>
                                    <img src="images/14.jpg" />
                                </a>
                            </div>
                            <div class="wrapper">
                                <h5 class="vid-name"><a href="#">Video's Name</a></h5>
                                <div class="info">
                                    <h6>By <a href="#">Kelvin</a></h6>
                                    <span><i class="fa fa-calendar"></i>25/3/2015</span>
                                    <span><i class="fa fa-heart"></i>1,200</span>
                                </div>
                            </div>
                        </div>
                        <div class="post wrap-vid">
                            <div class="zoom-container">
                                <a href="single.jsp">
                                    <span class="zoom-caption">
                                        <i class="icon-play fa fa-play"></i>
                                    </span>
                                    <img src="images/3.jpg" />
                                </a>
                            </div>
                            <div class="wrapper">
                                <h5 class="vid-name"><a href="#">Video's Name</a></h5>
                                <div class="info">
                                    <h6>By <a href="#">Kelvin</a></h6>
                                    <span><i class="fa fa-calendar"></i>25/3/2015</span>
                                    <span><i class="fa fa-heart"></i>1,200</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!---- Start Widget ---->
                <div class="widget wid-news">
                    <div class="wid-header">
                        <h5>Top News</h5>
                    </div>
                    <div class="wid-content">
                        <div class="row">
                            <div class="wrap-vid">
                                <div class="zoom-container">
                                    <a href="single.jsp">
                                        <span class="zoom-caption">
                                            <i class="icon-play fa fa-play"></i>
                                        </span>
                                        <img src="images/1.jpg" />
                                    </a>
                                </div>
                                <h3 class="vid-name">Video's Name</h3>
                                <div class="info">
                                    <h5>By <a href="#">Kelvin</a></h5>
                                    <span><i class="fa fa-calendar"></i>25/3/2015</span>
                                    <span><i class="fa fa-heart"></i>1,200</span>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="wrap-vid">
                                <div class="zoom-container">
                                    <a href="single.jsp">
                                        <span class="zoom-caption">
                                            <i class="icon-play fa fa-play"></i>
                                        </span>
                                        <img src="images/2.jpg" />
                                    </a>
                                </div>
                                <h3 class="vid-name">Video's Name</h3>
                                <div class="info">
                                    <h5>By <a href="#">Kelvin</a></h5>
                                    <span><i class="fa fa-calendar"></i>25/3/2015</span>
                                    <span><i class="fa fa-heart"></i>1,200</span>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="wrap-vid">
                                <div class="zoom-container">
                                    <a href="single.jsp">
                                        <span class="zoom-caption">
                                            <i class="icon-play fa fa-play"></i>
                                        </span>
                                        <img src="images/4.jpg" />
                                    </a>
                                </div>
                                <h3 class="vid-name">Video's Name</h3>
                                <div class="info">
                                    <h5>By <a href="#">Kelvin</a></h5>
                                    <span><i class="fa fa-calendar"></i>25/3/2015</span>
                                    <span><i class="fa fa-heart"></i>1,200</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>--%>


		</div>
</div>
</section>

<!--////////////////////////////////////Footer-->
<footer>
	<div class="zerogrid top-footer">
		<div class="row">
			<div class="col-1-5">
				<a href="#"><img src="images/15.jpg" /></a>
			</div>
			<div class="col-1-5">
				<a href="#"><img src="images/16.jpg" /></a>
			</div>
			<div class="col-1-5">
				<a href="#"><img src="images/17.jpg" /></a>
			</div>
			<div class="col-1-5">
				<a href="#"><img src="images/18.jpg" /></a>
			</div>
			<div class="col-1-5">
				<a href="#"><img src="images/19.jpg" /></a>
			</div>
		</div>
	</div>
	<div class="zerogrid wrap-footer">
		<div class="row">
			<div class="col-1-4 col-footer-1">
				<div class="wrap-col">
					<a href="index.jsp" class="logo"><img src="images/logo.png" /></a>
					<p>Ut volutpat consectetur aliquam. Curabitur auctor in nis ulum ornare. Sed consequat, augue condimentum fermentum gravida, metus elit vehicula dui.</p>
				</div>
			</div>
			<div class="col-1-4 col-footer-2">
				<div class="wrap-col">
					<h3>Categories</h3>
					<ul>
						<li><a href="#">Action</a></li>
						<li><a href="#">Romantic</a></li>
						<li><a href="#">Cartoon</a></li>
						<li><a href="#">Zombies</a></li>
					</ul>
				</div>
			</div>
			<div class="col-1-4 col-footer-3">
				<div class="wrap-col">
					<h3>Recent Posts</h3>
					<ul>
						<li><a href="#">New Videos</a></li>
						<li><a href="#">Featured Videos</a></li>
						<li><a href="#">Most Viewed Videos</a></li>
						<li><a href="#">Sports Videos</a></li>
					</ul>
				</div>
			</div>
			<div class="col-1-4 col-footer-4">
				<div class="wrap-col">
					<h3>Flickr Photos</h3>
					<div class="row">
						<div class="col-1-4">
							<div class="wrap-col">
								<a href="#"><img src="images/6.jpg" /></a>
								<a href="#"><img src="images/10.jpg" /></a>
								<a href="#"><img src="images/13.jpg" /></a>
							</div>
						</div>
						<div class="col-1-4">
							<div class="wrap-col">
								<a href="#"><img src="images/7.jpg" /></a>
								<a href="#"><img src="images/11.jpg" /></a>
								<a href="#"><img src="images/6.jpg" /></a>
							</div>
						</div>
						<div class="col-1-4">
							<div class="wrap-col">
								<a href="#"><img src="images/8.jpg" /></a>
								<a href="#"><img src="images/12.jpg" /></a>
								<a href="#"><img src="images/10.jpg" /></a>
							</div>
						</div>
						<div class="col-1-4">
							<div class="wrap-col">
								<a href="#"><img src="images/9.jpg" /></a>
								<a href="#"><img src="images/13.jpg" /></a>
								<a href="#"><img src="images/8.jpg" /></a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="zerogrid copyright">
		<div class="wrapper">
			Copyright 2015 - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
			<ul class="quick-link f-right">
				<li><a href="#">Privacy Policy</a></li>
				<li><a href="#">Terms of Use</a></li>
			</ul>
		</div>
	</div>
</footer>

<!-- Slider -->
<!-- Slider -->
<script src="js/jquery.min.js"></script>
<script src="bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
<script src="js/jquery-2.1.1.js"></script>
<script src="js/demo.js"></script>
<!-- Search -->
<script src="js/modernizr.custom.js"></script>
<script src="js/classie.js"></script>
<script src="js/uisearch.js"></script>
<script>
	new UISearch( document.getElementById( 'sb-search' ) );
</script>
<!-- Carousel -->
<script src="js/owl.carousel.js"></script>
<script>
	$(document).ready(function() {

		$("#owl-demo-1").owlCarousel({
			items : 4,
			lazyLoad : true,
			navigation : true
		});
		$("#owl-demo-2").owlCarousel({
			items : 4,
			lazyLoad : true,
			navigation : true
		});

	});
</script>
</div>
</body>
</jsp>