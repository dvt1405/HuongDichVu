/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author lenovo
 */
import get.UserGet;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
//import com.restfb.types.User;

public class LoginFacebookServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public LoginFacebookServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String code = request.getParameter("code");
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        System.out.println("----------------:" + name);
//        if (code == null || code.isEmpty()) {
//            RequestDispatcher dis = request.getRequestDispatcher("loginfb.jsp");
//            dis.forward(request, response);
//        } else {
//
//            String accessToken = RestFB.getToken(code);
//            com.restfb.types.User user = RestFB.getUserInfo(accessToken);
//            request.setAttribute("id", user.getId());
//            request.setAttribute("name", user.getName());
//            System.out.println(user.getId());
//            System.out.println(user.getBirthday());
//            System.out.println(user.getName());
//            RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
//            dis.forward(request, response);
//        }
        
        
        
        if (id == null) {
            RequestDispatcher dis = request.getRequestDispatcher("loginfb.jsp");
            dis.forward(request, response);
        } else {
            request.setAttribute("id", id);
            request.setAttribute("name", name);
            model.User user = new model.User(Long.parseLong(id), name, "", "", true, "");
            try {
                User user1 = new UserGet().getUser(Long.parseLong(id));
                System.out.println(user1.getUserID());
                if (user1.getUserID() == 0) {
                    new UserGet().insertUser(new User(Long.parseLong(id), name, "", "", true, ""));

                    System.out.println("Chua co");
                } else {
                    user = user1;
                    System.out.println("Da co");
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginFacebookServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
            dis.forward(request, response);
        }
        RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
        dis.forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
