package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import model.Product;
import get.ProductGet;
import model.Cart;
import model.User;
import model.Category;
import get.CategoryGet;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!-- Bootstrap style --> \n");
      out.write("        <link id=\"callCss\" rel=\"stylesheet\" href=\"shop/themes/bootshop/bootstrap.min.css\" media=\"screen\"/>\n");
      out.write("        <link href=\"shop/themes/css/base.css\" rel=\"stylesheet\" media=\"screen\"/>\n");
      out.write("        <!-- Bootstrap style responsive -->\t\n");
      out.write("        <link href=\"shop/themes/css/bootstrap-responsive.min.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"shop/themes/css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <!-- Google-code-prettify -->\t\n");
      out.write("        <link href=\"shop/themes/js/google-code-prettify/prettify.css\" rel=\"stylesheet\"/>\n");
      out.write("    </head>\n");
      out.write("    <div>\n");
      out.write("        ");

            ProductGet productGet = new ProductGet();  
            DecimalFormat formatter = new DecimalFormat("###,###,###");
            Cart cart = (Cart) session.getAttribute("cart");
            User user = null;
            if(session.getAttribute("user") != null){
                user = (User) session.getAttribute("user");
            }
            CategoryGet categoryget = new CategoryGet();
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div id=\"carouselBlk\">\n");
      out.write("            <div id=\"myCarousel\" class=\"carousel slide\">\n");
      out.write("                    <div class=\"carousel-inner\">\n");
      out.write("                      <div class=\"item active\">\n");
      out.write("                      <div class=\"container\">\n");
      out.write("                            <a href=\"#\"><img style=\"width:100%\" src=\"shop/themes/images/carousel/1.png\" alt=\"special offers\"/></a>\n");
      out.write("                            <div class=\"carousel-caption\">\n");
      out.write("                                      <h4>Second Thumbnail label</h4>\n");
      out.write("                                      <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\n");
      out.write("                                    </div>\n");
      out.write("                      </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"item\">\n");
      out.write("                      <div class=\"container\">\n");
      out.write("                            <a href=\"#\"><img style=\"width:100%\" src=\"shop/themes/images/carousel/2.png\" alt=\"\"/></a>\n");
      out.write("                                    <div class=\"carousel-caption\">\n");
      out.write("                                      <h4>Second Thumbnail label</h4>\n");
      out.write("                                      <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\n");
      out.write("                                    </div>\n");
      out.write("                      </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"item\">\n");
      out.write("                      <div class=\"container\">\n");
      out.write("                            <a href=\"register.html\"><img src=\"shop/themes/images/carousel/3.png\" alt=\"\"/></a>\n");
      out.write("                            <div class=\"carousel-caption\">\n");
      out.write("                                      <h4>Second Thumbnail label</h4>\n");
      out.write("                                      <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                      </div>\n");
      out.write("                      </div>\n");
      out.write("                       <div class=\"item\">\n");
      out.write("                       <div class=\"container\">\n");
      out.write("                            <a href=\"#\"><img src=\"shop/themes/images/carousel/4.png\" alt=\"\"/></a>\n");
      out.write("                            <div class=\"carousel-caption\">\n");
      out.write("                                      <h4>Second Thumbnail label</h4>\n");
      out.write("                                      <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                      </div>\n");
      out.write("                      </div>\n");
      out.write("                       <div class=\"item\">\n");
      out.write("                       <div class=\"container\">\n");
      out.write("                            <a href=\"register.html\"><img src=\"shop/themes/images/carousel/5.png\" alt=\"\"/></a>\n");
      out.write("                            <div class=\"carousel-caption\">\n");
      out.write("                                      <h4>Second Thumbnail label</h4>\n");
      out.write("                                      <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\n");
      out.write("                            </div>\n");
      out.write("                      </div>\n");
      out.write("                      </div>\n");
      out.write("                       <div class=\"item\">\n");
      out.write("                       <div class=\"container\">\n");
      out.write("                            <a href=\"register.html\"><img src=\"shop/themes/images/carousel/6.png\" alt=\"\"/></a>\n");
      out.write("                            <div class=\"carousel-caption\">\n");
      out.write("                                      <h4>Second Thumbnail label</h4>\n");
      out.write("                                      <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\n");
      out.write("                                    </div>\n");
      out.write("                      </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">&lsaquo;</a>\n");
      out.write("                    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">&rsaquo;</a>\n");
      out.write("              </div> \n");
      out.write("    </div>\n");
      out.write("    <div id=\"mainBody\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("    <!-- Sidebar ================================================== -->\n");
      out.write("            <div id=\"sidebar\" class=\"span3\">\n");
      out.write("                    <div class=\"well well-small\"><a id=\"myCart\" href=\"checkout.jsp\"><img src=\"shop/themes/images/ico-cart.png\" alt=\"cart\">");
      out.print(formatter.format(cart.countItem()));
      out.write(" Items in your cart  <span class=\"badge badge-warning pull-right\">$");
      out.print(formatter.format(cart.totalCart()));
      out.write("</span></a></div>\n");
      out.write("                    <ul id=\"sideManu\" class=\"nav nav-tabs nav-stacked\">\n");
      out.write("                            <li class=\"subMenu open\"><a> ELECTRONICS [230]</a>\n");
      out.write("                                    <ul>\n");
      out.write("                                    <li><a class=\"active\" href=\"products.html\"><i class=\"icon-chevron-right\"></i>Cameras (100) </a></li>\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Computers, Tablets & laptop (30)</a></li>\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Mobile Phone (80)</a></li>\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Sound & Vision (15)</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"subMenu\"><a> CLOTHES [840] </a>\n");
      out.write("                            <ul style=\"display:none\">\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Women's Clothing (45)</a></li>\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Women's Shoes (8)</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Women's Hand Bags (5)</a></li>\t\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Men's Clothings  (45)</a></li>\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Men's Shoes (6)</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Kids Clothing (5)</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Kids Shoes (3)</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                            </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"subMenu\"><a>FOOD AND BEVERAGES [1000]</a>\n");
      out.write("                                    <ul style=\"display:none\">\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Angoves  (35)</a></li>\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Bouchard Aine & Fils (8)</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>French Rabbit (5)</a></li>\t\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Louis Bernard  (45)</a></li>\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>BIB Wine (Bag in Box) (8)</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Other Liquors & Wine (5)</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Garden (3)</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    <li><a href=\"products.html\"><i class=\"icon-chevron-right\"></i>Khao Shong (11)</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                            </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"products.html\">HEALTH & BEAUTY [18]</a></li>\n");
      out.write("                            <li><a href=\"products.html\">SPORTS & LEISURE [58]</a></li>\n");
      out.write("                            <li><a href=\"products.html\">BOOKS & ENTERTAINMENTS [14]</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <br/>\n");
      out.write("                      <div class=\"thumbnail\">\n");
      out.write("                            <img src=\"shop/themes/images/products/panasonic.jpg\" alt=\"Bootshop panasonoc New camera\"/>\n");
      out.write("                            <div class=\"caption\">\n");
      out.write("                              <h5>Panasonic</h5>\n");
      out.write("                                    <h4 style=\"text-align:center\"><a class=\"btn\" href=\"product_details.html\"> <i class=\"icon-zoom-in\"></i></a> <a class=\"btn\" href=\"#\">Add to <i class=\"icon-shopping-cart\"></i></a> <a class=\"btn btn-primary\" href=\"#\">$222.00</a></h4>\n");
      out.write("                            </div>\n");
      out.write("                      </div><br/>\n");
      out.write("                            <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"shop/themes/images/products/kindle.png\" title=\"Bootshop New Kindel\" alt=\"Bootshop Kindel\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                      <h5>Kindle</h5>\n");
      out.write("                                        <h4 style=\"text-align:center\"><a class=\"btn\" href=\"product_details.html\"> <i class=\"icon-zoom-in\"></i></a> <a class=\"btn\" href=\"#\">Add to <i class=\"icon-shopping-cart\"></i></a> <a class=\"btn btn-primary\" href=\"#\">$222.00</a></h4>\n");
      out.write("                                    </div>\n");
      out.write("                              </div><br/>\n");
      out.write("                            <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"shop/themes/images/payment_methods.png\" title=\"Bootshop Payment Methods\" alt=\"Payments Methods\">\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                      <h5>Payment Methods</h5>\n");
      out.write("                                    </div>\n");
      out.write("                              </div>\n");
      out.write("            </div>\n");
      out.write("    <!-- Sidebar end=============================================== -->\n");
      out.write("                    <div class=\"span9\">\t\t\n");
      out.write("                            <div class=\"well well-small\">\n");
      out.write("                            <h4>Featured Products <small class=\"pull-right\">200+ featured products</small></h4>\n");
      out.write("                            <div class=\"row-fluid\">\n");
      out.write("                            <div id=\"featured\" class=\"carousel slide\">\n");
      out.write("                            <div class=\"carousel-inner\">\n");
      out.write("                              <div class=\"item active\">\n");
      out.write("                              <ul class=\"thumbnails\">\n");
      out.write("                                ");

                                    for (Product p : productGet.getListProductByFeatured(0, 4)) {
                                
      out.write("\n");
      out.write("                                    <li class=\"span3\">\n");
      out.write("                                      <div class=\"thumbnail\">\n");
      out.write("                                      <i class=\"tag\"></i>\n");
      out.write("                                            <a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\"><img class=\"img-responsive\" src=\"");
      out.print(p.getProductImage());
      out.write("\" alt=\"\" /></a>\n");
      out.write("                                            <div class=\"caption\">\n");
      out.write("                                              <h5>");
      out.print(p.getProductName());
      out.write("</h5>\n");
      out.write("                                              <h4><a class=\"btn\" href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\">VIEW</a> <span class=\"pull-right\" style=\"font-size: 13px\">$");
      out.print(formatter.format(p.getProductPrice()));
      out.write("</span></h4>\n");
      out.write("                                            </div>\n");
      out.write("                                      </div>\n");
      out.write("                                    </li>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("                              </ul>\n");
      out.write("                              </div>\n");
      out.write("                               <div class=\"item\">\n");
      out.write("                              <ul class=\"thumbnails\">\n");
      out.write("                                    ");

                                    for (Product p : productGet.getListProductByFeatured(4, 4)) {
                                
      out.write("\n");
      out.write("                                    <li class=\"span3\">\n");
      out.write("                                      <div class=\"thumbnail\">\n");
      out.write("                                      <i class=\"tag\"></i>\n");
      out.write("                                            <a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\"><img class=\"img-responsive\" src=\"");
      out.print(p.getProductImage());
      out.write("\" alt=\"\" /></a>\n");
      out.write("                                            <div class=\"caption\">\n");
      out.write("                                              <h5>");
      out.print(p.getProductName());
      out.write("</h5>\n");
      out.write("                                              <h4><a class=\"btn\" href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\">VIEW</a> <span class=\"pull-right\" style=\"font-size: 13px\">$");
      out.print(formatter.format(p.getProductPrice()));
      out.write("</span></h4>\n");
      out.write("                                            </div>\n");
      out.write("                                      </div>\n");
      out.write("                                    </li>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("                              </ul>\n");
      out.write("                              </div>\n");
      out.write("                               <div class=\"item\">\n");
      out.write("                              <ul class=\"thumbnails\">\n");
      out.write("                                    ");

                                    for (Product p : productGet.getListProductByFeatured(8, 4)) {
                                
      out.write("\n");
      out.write("                                    <li class=\"span3\">\n");
      out.write("                                      <div class=\"thumbnail\">\n");
      out.write("                                      <i class=\"tag\"></i>\n");
      out.write("                                            <a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\"><img class=\"img-responsive\" src=\"");
      out.print(p.getProductImage());
      out.write("\" alt=\"\" /></a>\n");
      out.write("                                            <div class=\"caption\">\n");
      out.write("                                              <h5>");
      out.print(p.getProductName());
      out.write("</h5>\n");
      out.write("                                              <h4><a class=\"btn\" href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\">VIEW</a> <span class=\"pull-right\" style=\"font-size: 13px\">$");
      out.print(formatter.format(p.getProductPrice()));
      out.write("</span></h4>\n");
      out.write("                                            </div>\n");
      out.write("                                      </div>\n");
      out.write("                                    </li>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("                              </ul>\n");
      out.write("                              </div>\n");
      out.write("                               <div class=\"item\">\n");
      out.write("                              <ul class=\"thumbnails\">\n");
      out.write("                                    ");

                                    for (Product p : productGet.getListProductByFeatured(12, 4)) {
                                
      out.write("\n");
      out.write("                                    <li class=\"span3\">\n");
      out.write("                                      <div class=\"thumbnail\">\n");
      out.write("                                      <i class=\"tag\"></i>\n");
      out.write("                                            <a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\"><img class=\"img-responsive\" src=\"");
      out.print(p.getProductImage());
      out.write("\" alt=\"\" /></a>\n");
      out.write("                                            <div class=\"caption\">\n");
      out.write("                                              <h5>");
      out.print(p.getProductName());
      out.write("</h5>\n");
      out.write("                                              <h4><a class=\"btn\" href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\">VIEW</a> <span class=\"pull-right\" style=\"font-size: 13px\">$");
      out.print(formatter.format(p.getProductPrice()));
      out.write("</span></h4>\n");
      out.write("                                            </div>\n");
      out.write("                                      </div>\n");
      out.write("                                    </li>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("                              </ul>\n");
      out.write("                              </div>\n");
      out.write("                              </div>\n");
      out.write("                              <a class=\"left carousel-control\" href=\"#featured\" data-slide=\"prev\">‹</a>\n");
      out.write("                              <a class=\"right carousel-control\" href=\"#featured\" data-slide=\"next\">›</a>\n");
      out.write("                              </div>\n");
      out.write("                              </div>\n");
      out.write("                    </div>\n");
      out.write("                    <h4>Latest Products </h4>\n");
      out.write("                              <ul class=\"thumbnails\">\n");
      out.write("                                    ");

                                    for (Product p : productGet.getListProductByLatest(0, 8)) {
                                
      out.write("\n");
      out.write("                                    <li class=\"span3\">\n");
      out.write("                                      <div class=\"thumbnail\">\n");
      out.write("                                            <a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\"><img class=\"img-responsive\" src=\"");
      out.print(p.getProductImage());
      out.write("\" alt=\"\" /></a>\n");
      out.write("                                            <div class=\"caption\">\n");
      out.write("                                              <h5>");
      out.print(p.getProductName());
      out.write("</h5>\n");
      out.write("                                              <p></p>\n");
      out.write("                                              <h4 style=\"text-align:center\"><a class=\"btn\" href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write("\"> <i class=\"icon-zoom-in\"></i></a> <a class=\"btn\" href=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("\">Add to <i class=\"icon-shopping-cart\"></i></a> <a class=\"btn btn-primary\" href=\"#\" style=\"font-size: 12px\">$");
      out.print(formatter.format(p.getProductPrice()));
      out.write("</a></h4>\n");
      out.write("                                            </div>\n");
      out.write("                                      </div>\n");
      out.write("                                    </li>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("                                    <li class=\"span3\">\n");
      out.write("                                      <div class=\"thumbnail\">\n");
      out.write("                                            <a  href=\"product_details.html\"><img src=\"shop/themes/images/products/11.jpg\" alt=\"\"/></a>\n");
      out.write("                                            <div class=\"caption\">\n");
      out.write("                                              <h5>Product name</h5>\n");
      out.write("                                              <p> \n");
      out.write("                                                    Lorem Ipsum is simply dummy text. \n");
      out.write("                                              </p>\n");
      out.write("                                               <h4 style=\"text-align:center\"><a class=\"btn\" href=\"product_details.html\"> <i class=\"icon-zoom-in\"></i></a> <a class=\"btn\" href=\"#\">Add to <i class=\"icon-shopping-cart\"></i></a> <a class=\"btn btn-primary\" href=\"#\" style=\"font-size: 12px\">$222.00</a></h4>\n");
      out.write("                                            </div>\n");
      out.write("                                      </div>\n");
      out.write("                                    </li>\n");
      out.write("                              </ul>\t\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("<!-- Placed at the end of the document so the pages load faster ============================================= -->\n");
      out.write("  <script src=\"shop/themes/js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("  <script src=\"shop/themes/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("  <script src=\"shop/themes/js/google-code-prettify/prettify.js\"></script>\n");
      out.write("  \n");
      out.write("  <script src=\"shop/themes/js/bootshop.js\"></script>\n");
      out.write("  <script src=\"shop/themes/js/jquery.lightbox-0.5.js\"></script>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
