<%-- 
    Document   : index2
    Created on : Apr 6, 2019, 12:31:42 AM
    Author     : lenovo
--%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="model.Product"%>
<%@page import="get.ProductGet"%>
<%@page import="model.Cart"%>
<%@page import="model.User"%>
<%@page import="model.Category"%>
<%@page import="get.CategoryGet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Bootstrap style --> 
        <link id="callCss" rel="stylesheet" href="shop/themes/bootshop/bootstrap.min.css" media="screen"/>
        <link href="shop/themes/css/base.css" rel="stylesheet" media="screen"/>
        <!-- Bootstrap style responsive -->	
        <link href="shop/themes/css/bootstrap-responsive.min.css" rel="stylesheet"/>
        <link href="shop/themes/css/font-awesome.css" rel="stylesheet" type="text/css">
        <!-- Google-code-prettify -->	
        <link href="shop/themes/js/google-code-prettify/prettify.css" rel="stylesheet"/>
    </head>
    <div>
        <%
            ProductGet productGet = new ProductGet();  
            DecimalFormat formatter = new DecimalFormat("###,###,###");
            Cart cart = (Cart) session.getAttribute("cart");
            User user = null;
            if(session.getAttribute("user") != null){
                user = (User) session.getAttribute("user");
            }
            CategoryGet categoryget = new CategoryGet();
        %>
    </div>
    <div id="carouselBlk">
            <div id="myCarousel" class="carousel slide">
                    <div class="carousel-inner">
                      <div class="item active">
                      <div class="container">
                            <a href="#"><img style="width:100%" src="shop/themes/images/carousel/1.png" alt="special offers"/></a>
                            <div class="carousel-caption">
                                      <h4>Second Thumbnail label</h4>
                                      <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                                    </div>
                      </div>
                      </div>
                      <div class="item">
                      <div class="container">
                            <a href="#"><img style="width:100%" src="shop/themes/images/carousel/2.png" alt=""/></a>
                                    <div class="carousel-caption">
                                      <h4>Second Thumbnail label</h4>
                                      <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                                    </div>
                      </div>
                      </div>
                      <div class="item">
                      <div class="container">
                            <a href="register.html"><img src="shop/themes/images/carousel/3.png" alt=""/></a>
                            <div class="carousel-caption">
                                      <h4>Second Thumbnail label</h4>
                                      <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                                    </div>

                      </div>
                      </div>
                       <div class="item">
                       <div class="container">
                            <a href="#"><img src="shop/themes/images/carousel/4.png" alt=""/></a>
                            <div class="carousel-caption">
                                      <h4>Second Thumbnail label</h4>
                                      <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                                    </div>

                      </div>
                      </div>
                       <div class="item">
                       <div class="container">
                            <a href="register.html"><img src="shop/themes/images/carousel/5.png" alt=""/></a>
                            <div class="carousel-caption">
                                      <h4>Second Thumbnail label</h4>
                                      <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                            </div>
                      </div>
                      </div>
                       <div class="item">
                       <div class="container">
                            <a href="register.html"><img src="shop/themes/images/carousel/6.png" alt=""/></a>
                            <div class="carousel-caption">
                                      <h4>Second Thumbnail label</h4>
                                      <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                                    </div>
                      </div>
                      </div>
                    </div>
                    <a class="left carousel-control" href="#myCarousel" data-slide="prev">&lsaquo;</a>
                    <a class="right carousel-control" href="#myCarousel" data-slide="next">&rsaquo;</a>
              </div> 
    </div>
    <div id="mainBody">
	<div class="container">
            <div class="row">
    <!-- Sidebar ================================================== -->
            <div id="sidebar" class="span3">
                    <div class="well well-small"><a id="myCart" href="checkout.jsp"><img src="shop/themes/images/ico-cart.png" alt="cart"><%=formatter.format(cart.countItem())%> Items in your cart  <span class="badge badge-warning pull-right">$<%=formatter.format(cart.totalCart())%></span></a></div>
                    <ul id="sideManu" class="nav nav-tabs nav-stacked">
                            <li class="subMenu open"><a> ELECTRONICS [230]</a>
                                    <ul>
                                    <li><a class="active" href="products.html"><i class="icon-chevron-right"></i>Cameras (100) </a></li>
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>Computers, Tablets & laptop (30)</a></li>
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>Mobile Phone (80)</a></li>
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>Sound & Vision (15)</a></li>
                                    </ul>
                            </li>
                            <li class="subMenu"><a> CLOTHES [840] </a>
                            <ul style="display:none">
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>Women's Clothing (45)</a></li>
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>Women's Shoes (8)</a></li>												
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>Women's Hand Bags (5)</a></li>	
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>Men's Clothings  (45)</a></li>
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>Men's Shoes (6)</a></li>												
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>Kids Clothing (5)</a></li>												
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>Kids Shoes (3)</a></li>												
                            </ul>
                            </li>
                            <li class="subMenu"><a>FOOD AND BEVERAGES [1000]</a>
                                    <ul style="display:none">
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>Angoves  (35)</a></li>
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>Bouchard Aine & Fils (8)</a></li>												
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>French Rabbit (5)</a></li>	
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>Louis Bernard  (45)</a></li>
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>BIB Wine (Bag in Box) (8)</a></li>												
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>Other Liquors & Wine (5)</a></li>												
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>Garden (3)</a></li>												
                                    <li><a href="products.html"><i class="icon-chevron-right"></i>Khao Shong (11)</a></li>												
                            </ul>
                            </li>
                            <li><a href="products.html">HEALTH & BEAUTY [18]</a></li>
                            <li><a href="products.html">SPORTS & LEISURE [58]</a></li>
                            <li><a href="products.html">BOOKS & ENTERTAINMENTS [14]</a></li>
                    </ul>
                    <br/>
                      <div class="thumbnail">
                            <img src="shop/themes/images/products/panasonic.jpg" alt="Bootshop panasonoc New camera"/>
                            <div class="caption">
                              <h5>Panasonic</h5>
                                    <h4 style="text-align:center"><a class="btn" href="product_details.html"> <i class="icon-zoom-in"></i></a> <a class="btn" href="#">Add to <i class="icon-shopping-cart"></i></a> <a class="btn btn-primary" href="#">$222.00</a></h4>
                            </div>
                      </div><br/>
                            <div class="thumbnail">
                                    <img src="shop/themes/images/products/kindle.png" title="Bootshop New Kindel" alt="Bootshop Kindel">
                                    <div class="caption">
                                      <h5>Kindle</h5>
                                        <h4 style="text-align:center"><a class="btn" href="product_details.html"> <i class="icon-zoom-in"></i></a> <a class="btn" href="#">Add to <i class="icon-shopping-cart"></i></a> <a class="btn btn-primary" href="#">$222.00</a></h4>
                                    </div>
                              </div><br/>
                            <div class="thumbnail">
                                    <img src="shop/themes/images/payment_methods.png" title="Bootshop Payment Methods" alt="Payments Methods">
                                    <div class="caption">
                                      <h5>Payment Methods</h5>
                                    </div>
                              </div>
            </div>
    <!-- Sidebar end=============================================== -->
                    <div class="span9">		
                            <div class="well well-small">
                            <h4>Featured Products <small class="pull-right">200+ featured products</small></h4>
                            <div class="row-fluid">
                            <div id="featured" class="carousel slide">
                            <div class="carousel-inner">
                              <div class="item active">
                              <ul class="thumbnails">
                                <%
                                    for (Product p : productGet.getListProductByFeatured(0, 4)) {
                                %>
                                    <li class="span3">
                                      <div class="thumbnail">
                                      <i class="tag"></i>
                                            <a href="single.jsp?productID=<%=p.getProductID()%>"><img class="img-responsive" src="<%=p.getProductImage()%>" alt="" /></a>
                                            <div class="caption">
                                              <h5><%=p.getProductName()%></h5>
                                              <h4><a class="btn" href="single.jsp?productID=<%=p.getProductID()%>">VIEW</a> <span class="pull-right" style="font-size: 13px">$<%=formatter.format(p.getProductPrice())%></span></h4>
                                            </div>
                                      </div>
                                    </li>
                                <% } %>
                              </ul>
                              </div>
                               <div class="item">
                              <ul class="thumbnails">
                                    <%
                                    for (Product p : productGet.getListProductByFeatured(4, 4)) {
                                %>
                                    <li class="span3">
                                      <div class="thumbnail">
                                      <i class="tag"></i>
                                            <a href="single.jsp?productID=<%=p.getProductID()%>"><img class="img-responsive" src="<%=p.getProductImage()%>" alt="" /></a>
                                            <div class="caption">
                                              <h5><%=p.getProductName()%></h5>
                                              <h4><a class="btn" href="single.jsp?productID=<%=p.getProductID()%>">VIEW</a> <span class="pull-right" style="font-size: 13px">$<%=formatter.format(p.getProductPrice())%></span></h4>
                                            </div>
                                      </div>
                                    </li>
                                <% } %>
                              </ul>
                              </div>
                               <div class="item">
                              <ul class="thumbnails">
                                    <%
                                    for (Product p : productGet.getListProductByFeatured(8, 4)) {
                                %>
                                    <li class="span3">
                                      <div class="thumbnail">
                                      <i class="tag"></i>
                                            <a href="single.jsp?productID=<%=p.getProductID()%>"><img class="img-responsive" src="<%=p.getProductImage()%>" alt="" /></a>
                                            <div class="caption">
                                              <h5><%=p.getProductName()%></h5>
                                              <h4><a class="btn" href="single.jsp?productID=<%=p.getProductID()%>">VIEW</a> <span class="pull-right" style="font-size: 13px">$<%=formatter.format(p.getProductPrice())%></span></h4>
                                            </div>
                                      </div>
                                    </li>
                                <% } %>
                              </ul>
                              </div>
                               <div class="item">
                              <ul class="thumbnails">
                                    <%
                                    for (Product p : productGet.getListProductByFeatured(12, 4)) {
                                %>
                                    <li class="span3">
                                      <div class="thumbnail">
                                      <i class="tag"></i>
                                            <a href="single.jsp?productID=<%=p.getProductID()%>"><img class="img-responsive" src="<%=p.getProductImage()%>" alt="" /></a>
                                            <div class="caption">
                                              <h5><%=p.getProductName()%></h5>
                                              <h4><a class="btn" href="single.jsp?productID=<%=p.getProductID()%>">VIEW</a> <span class="pull-right" style="font-size: 13px">$<%=formatter.format(p.getProductPrice())%></span></h4>
                                            </div>
                                      </div>
                                    </li>
                                <% } %>
                              </ul>
                              </div>
                              </div>
                              <a class="left carousel-control" href="#featured" data-slide="prev">‹</a>
                              <a class="right carousel-control" href="#featured" data-slide="next">›</a>
                              </div>
                              </div>
                    </div>
                    <h4>Latest Products </h4>
                              <ul class="thumbnails">
                                    <%
                                    for (Product p : productGet.getListProductByLatest(0, 8)) {
                                %>
                                    <li class="span3">
                                      <div class="thumbnail">
                                            <a href="single.jsp?productID=<%=p.getProductID()%>"><img class="img-responsive" src="<%=p.getProductImage()%>" alt="" /></a>
                                            <div class="caption">
                                              <h5><%=p.getProductName()%></h5>
                                              <p></p>
                                              <h4 style="text-align:center"><a class="btn" href="single.jsp?productID=<%=p.getProductID()%>"> <i class="icon-zoom-in"></i></a> <a class="btn" href="CartServlet?command=plus&productID=<%=p.getProductID()%>">Add to <i class="icon-shopping-cart"></i></a> <a class="btn btn-primary" href="#" style="font-size: 12px">$<%=formatter.format(p.getProductPrice())%></a></h4>
                                            </div>
                                      </div>
                                    </li>
                                <% } %>
                                    <li class="span3">
                                      <div class="thumbnail">
                                            <a  href="product_details.html"><img src="shop/themes/images/products/11.jpg" alt=""/></a>
                                            <div class="caption">
                                              <h5>Product name</h5>
                                              <p> 
                                                    Lorem Ipsum is simply dummy text. 
                                              </p>
                                               <h4 style="text-align:center"><a class="btn" href="product_details.html"> <i class="icon-zoom-in"></i></a> <a class="btn" href="#">Add to <i class="icon-shopping-cart"></i></a> <a class="btn btn-primary" href="#" style="font-size: 12px">$222.00</a></h4>
                                            </div>
                                      </div>
                                    </li>
                              </ul>	

                    </div>
                    </div>
            </div>
    </div>
<!-- Placed at the end of the document so the pages load faster ============================================= -->
  <script src="shop/themes/js/jquery.js" type="text/javascript"></script>
  <script src="shop/themes/js/bootstrap.min.js" type="text/javascript"></script>
  <script src="shop/themes/js/google-code-prettify/prettify.js"></script>
  
  <script src="shop/themes/js/bootshop.js"></script>
  <script src="shop/themes/js/jquery.lightbox-0.5.js"></script>

</html>