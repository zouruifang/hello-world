package com.cslg.cn;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.druid.pool.DruidPooledConnection;
import dao.UserDao;
import util.DbPoolConnection;

import bean.User;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	DbPoolConnection dbp = DbPoolConnection.getInstance();
	UserDao userDao = new UserDao();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		DruidPooledConnection con = null;
		try {
			User user = new User(name, password);
			con = dbp.getConnection();
			User currentUser = userDao.login(con, user);
			if (currentUser == null) {
				request.setAttribute("error", "用户名或者密码错误");
				request.setAttribute("name", name);
				request.setAttribute("password", password);
				request.setCharacterEncoding("utf-8");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			} else {
				HttpSession session = request.getSession();
				session.setAttribute("currentUser", currentUser);
				response.sendRedirect("welcome.jsp");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
