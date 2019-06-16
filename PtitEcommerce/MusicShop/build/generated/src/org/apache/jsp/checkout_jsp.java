package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import get.ProductGet;
import model.Product;
import java.util.Map;
import model.Item;
import model.Cart;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>PTIT ECOMMERCE - GIỎ HÀNG</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Classic Style Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<!-- //js -->\n");
      out.write("<!-- cart -->\n");
      out.write("<script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("<!-- cart -->\n");
      out.write("<!-- for bootstrap working -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("<!-- //for bootstrap working -->\n");
      out.write("<!-- animation-effect -->\n");
      out.write("<link href=\"css/animate.min.css\" rel=\"stylesheet\"> \n");
      out.write("<script src=\"js/wow.min.js\"></script>\n");
      out.write("<script>\n");
      out.write(" new WOW().init();\n");
      out.write("</script>\n");
      out.write("<!-- //animation-effect -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Cabin:400,500,600,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");

            
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
            DecimalFormat formatter = new DecimalFormat("###,###,###");
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"banner-top\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h2 class=\"animated wow fadeInLeft\" data-wow-delay=\".5s\">Thanh toán</h2>\n");
      out.write("\t\t<h3 class=\"animated wow fadeInRight\" data-wow-delay=\".5s\"><a href=\"index.html\">Trang Chủ</a><label>/</label>Thanh Toán</h3>\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("        \t\t<div class=\"check-out\">\t \n");
      out.write("\t\t<div class=\"container\">\t \n");
      out.write("\t \n");
      out.write("\t\t\t\t\t\n");
      out.write("                           \n");
      out.write(" <table class=\"table animated wow fadeInLeft\" data-wow-delay=\".5s\">\n");
      out.write("\t\t  <tr>\n");
      out.write("                      <th class=\"t-head\">Hình ảnh</th>\n");
      out.write("\t\t\t<th class=\"t-head \">Mặt Hàng</th>\n");
      out.write("\t\t\t<th class=\"t-head\">Giá</th>\n");
      out.write("\t\t\t<th class=\"t-head\">Số Lượng</th>\n");
      out.write("                        <th class=\"t-head\"></th>\n");
      out.write("\t\t\n");
      out.write("\t\t  </tr>\n");
      out.write("\n");
      out.write("                  ");
for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {
      out.write("\n");
      out.write("\t\t  <tr class=\"cross1\">\n");
      out.write("\t\t\t<td class=\"t-data\">\n");
      out.write("\t\t\t\t<a href=\"single.jsp?productID=");
      out.print(list.getValue().getProduct().getProductID());
      out.write("\" class=\"at-in\">\n");
      out.write("                                  <img src=\"");
      out.print(list.getValue().getProduct().getProductImage());
      out.write("\" class=\"fashion-grid\" alt=\"\"> \n");
      out.write("                                 \n");
      out.write("\t\t\t\t</a>\n");
      out.write("                            </td>\n");
      out.write("                        <td class=\"t-data\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<h3>");
      out.print(list.getValue().getProduct().getProductName());
      out.write("</h3>\n");
      out.write("\t\t\t </td>\n");
      out.write("\t\t\t<td class=\"t-data\">");
      out.print(formatter.format(list.getValue().getProduct().getProductPrice()));
      out.write(" VNĐ</td>\n");
      out.write("\t\t\t<td class=\"t-data\"><div class=\"quantity\"> \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"quantity-select\">            \n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"entry value-minus\">&nbsp;</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"entry value\"><span class=\"span-1\">");
      out.print(list.getValue().getQuantity());
      out.write("</span></div>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"entry value-plus active\">&nbsp;</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                \n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                        \t \t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</td>\n");
      out.write("                        \n");
      out.write("                        <td class=\"t-data\"><a href=\"CartServlet?command=remove&productID=");
      out.print(list.getValue().getProduct().getProductID());
      out.write("\"><img src=\"images/circle.png\" class=\"img-responsive \" alt=\"\"></a></td>\n");
      out.write("\t\t\t\n");
      out.write("\t\t  </tr>\n");
      out.write("\t\t  ");
 } 
      out.write("\n");
      out.write("\t\t \n");
      out.write("\t</table>\n");
      out.write("\t\t\t\t<div class=\" cart-total\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t <h5 class=\"continue\" >Tổng Cộng Giỏ Hàng</h5>\n");
      out.write("\t\t\t <div class=\"price-details\">\n");
      out.write("\t\t\t\t <h3>Chi Tiết Giá</h3>\n");
      out.write("\t\t\t\t <span>Tổng Cộng</span>\n");
      out.write("\t\t\t\t <span class=\"total1\"></span>\n");
      out.write("\t\t\t\t <span>Giảm giá</span>\n");
      out.write("\t\t\t\t <span class=\"total1\">---</span>\n");
      out.write("\t\t\t\t <span>Phí vận chuyển</span>\n");
      out.write("\t\t\t\t <span class=\"total1\"></span>\n");
      out.write("\t\t\t\t <div class=\"clearfix\"></div>\t\t\t\t \n");
      out.write("\t\t\t </div>\t\n");
      out.write("\t\t\t <ul class=\"total_price\">\n");
      out.write("\t\t\t   <li class=\"last_price\"> <h4>Tổng Cộng</h4></li>\t\n");
      out.write("\t\t\t   <li class=\"last_price\"><span>");
      out.print(formatter.format(cart.totalCart()));
      out.write(" VNĐ</span></li>\n");
      out.write("\t\t\t   <div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t </ul>\n");
      out.write("\t\t\t\n");
      out.write("<!--\t\t\t <a href=\"checkoutstep.jsp\">Thanh Toán</a>-->\n");
      out.write("                    <fieldset>\n");
      out.write("                        <legend>Thanh toán qua cổng PayPal</legend>\n");
      out.write("                        <form action=\"https://www.sandbox.paypal.com/cgi-bin/webscr\" method=\"post\">\n");
      out.write("\n");
      out.write("                            <!-- Nhập địa chỉ email người nhận tiền (người bán) -->\n");
      out.write("                            <input type=\"hidden\" name=\"business\" value=\"phamducmanh.ptit@gmail.com\">\n");
      out.write("\n");
      out.write("                            <!-- tham số cmd có giá trị _xclick chỉ rõ cho paypal biết là người dùng nhất nút thanh toán -->\n");
      out.write("                            <input type=\"hidden\" name=\"cmd\" value=\"_xclick\">\n");
      out.write("\n");
      out.write("                            <!-- Thông tin mua hàng. -->\n");
      out.write("                            <input type=\"hidden\" name=\"item_name\" value=\"BILL IN PTITECOMMERCE\">\n");
      out.write("                            <!--Trị giá của giỏ hàng, vì paypal không hỗ trợ tiền việt nên phải đổi ra tiền $-->\n");
      out.write("                            <input type=\"number\" name=\"amount\" placeholder=\"Nhập số tiền vào\" value=\"");
      out.print(cart.totalCart());
      out.write("\" style=\"display: none\">\n");
      out.write("                                        <!--Loại tiền-->\n");
      out.write("                            <input type=\"hidden\" name=\"currency_code\" value=\"USD\">\n");
      out.write("                                        <!--Đường link mình cung cấp cho Paypal biết để sau khi xử lí thành công nó sẽ chuyển về theo đường link này-->\n");
      out.write("                            <input type=\"hidden\" name=\"return\" value=\"http://localhost/demothanhtoanonline/thanhcong.html\">\n");
      out.write("                                        <!--Đường link mình cung cấp cho Paypal biết để nếu  xử lí KHÔNG thành công nó sẽ chuyển về theo đường link này-->\n");
      out.write("                            <input type=\"hidden\" name=\"cancel_return\" value=\"http://localhost/demothanhtoanonline/loi.html\">\n");
      out.write("                            <!-- Nút bấm. -->\n");
      out.write("                            <input type=\"submit\" name=\"submit\" value=\"Thanh toán quay Paypal\" style=\"color: #fff;\n");
      out.write("                                                                                                    background: #FF7000;\n");
      out.write("                                                                                                    text-decoration: none;\n");
      out.write("                                                                                                    padding: 0.5em 1em;\n");
      out.write("                                                                                                    font-size: 1em;\n");
      out.write("                                                                                                    display: inline-block;\n");
      out.write("                                                                                                    margin-top: 1em;\">\n");
      out.write("                        </form>\n");
      out.write("                </fieldset>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t </div>\n");
      out.write("\t\t </div>\n");
      out.write("\t\t \t\t\t\t<!--quantity-->\n");
      out.write("\t\t\t<script>\n");
      out.write("\t\t\t$('.value-plus').on('click', function(){\n");
      out.write("\t\t\t\tvar divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10)+1;\n");
      out.write("\t\t\t\tdivUpd.text(newVal);\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t$('.value-minus').on('click', function(){\n");
      out.write("\t\t\t\tvar divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10)-1;\n");
      out.write("\t\t\t\tif(newVal>=1) divUpd.text(newVal);\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t</script>\n");
      out.write("\t\t\t<!--quantity-->\n");
      out.write("                        \n");
      out.write("                        <div class=\"social animated wow fadeInUp\" data-wow-delay=\".1s\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"col-sm-3 social-ic\">\n");
      out.write("\t\t\t<a href=\"#\">FACEBOOK</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-sm-3 social-ic\">\n");
      out.write("\t\t\t<a href=\"#\">TWITTER</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-sm-3 social-ic\">\n");
      out.write("\t\t\t<a href=\"#\">GOOGLE+</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-sm-3 social-ic\">\n");
      out.write("\t\t\t<a href=\"#\">PINTEREST</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t<div class=\"clearfix\"></div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
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
