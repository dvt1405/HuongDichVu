package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginfb_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>Login</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <h1>login</h1>\n");
      out.write("  <a href=\"https://www.facebook.com/dialog/oauth?client_id=444755806280822&redirect_uri=https://88774f1b.ngrok.io/MusicShop/loginfb\">Login Facebook</a>\n");
      out.write("<fb:login-button scope=\"public_profile,email\" onlogin=\"checkLoginState();\">\n");
      out.write("</fb:login-button>\n");
      out.write("  \n");
      out.write("  <a href=\"https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/MusicShop/LoginGoogleServlet&response_type=code\n");
      out.write("    &client_id=482864950284-nlvbldolgt2f4ptiqmkvsp2gdbd4j5qg.apps.googleusercontent.com&approval_prompt=force\">Login With Google</a>  \n");
      out.write("\n");
      out.write("<div id=\"status\">\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("  function statusChangeCallback(response) {\n");
      out.write("    console.log('statusChangeCallback');\n");
      out.write("    console.log(response);\n");
      out.write("    if (response.status === 'connected') {\n");
      out.write("      testAPI();\n");
      out.write("    } else {\n");
      out.write("      document.getElementById('status').innerHTML = 'Please log ' +\n");
      out.write("        'into this app.';\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function checkLoginState() {\n");
      out.write("    FB.getLoginStatus(function(response) {\n");
      out.write("      statusChangeCallback(response);\n");
      out.write("    });\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  window.fbAsyncInit = function() {\n");
      out.write("    FB.init({\n");
      out.write("      appId      : '444755806280822',\n");
      out.write("      cookie     : true, \n");
      out.write("      xfbml      : true,  \n");
      out.write("      version    : 'v3.3' \n");
      out.write("    });\n");
      out.write("\n");
      out.write("    FB.getLoginStatus(function(response) {\n");
      out.write("      statusChangeCallback(response);\n");
      out.write("    });\n");
      out.write("\n");
      out.write("  };\n");
      out.write("\n");
      out.write("  (function(d, s, id) {\n");
      out.write("    var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("    if (d.getElementById(id)) return;\n");
      out.write("    js = d.createElement(s); js.id = id;\n");
      out.write("    js.src = \"https://connect.facebook.net/en_US/sdk.js\";\n");
      out.write("    fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("  }(document, 'script', 'facebook-jssdk'));\n");
      out.write("\n");
      out.write("  function testAPI() {\n");
      out.write("    console.log('Welcome!  Fetching your information.... ');\n");
      out.write("    FB.api('/me', function(response) {\n");
      out.write("      console.log('Successful login for: ' + response.name);\n");
      out.write("      var name = response.name;\n");
      out.write("      document.getElementById('status').innerHTML =\n");
      out.write("        'Thanks for logging in, ' + name + '!';\n");
      out.write("      window.location=\"http://localhost:8080/MusicShop/loginfb?name=\"+name+\"&id=\"+response.id;\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("  }\n");
      out.write("</script>\n");
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
