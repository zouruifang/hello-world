package com.cslg.cn;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Triangle;

/**
 * Servlet implementation class triangleServlet
 */

public class triangleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public triangleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());		
		//request.setAttribute("Triangle", triang);//将triangle存储到HttpServletRequest对象中
        double side1=Double.parseDouble(request.getParameter("side1"));
        double side2=Double.parseDouble(request.getParameter("side2"));
        double side3=Double.parseDouble(request.getParameter("side3"));
        Triangle triang=new Triangle(side1,side2,side3);//创建javabean对象
		
		HttpSession session=request.getSession();
		session.setAttribute("side1", new Double(side1));
		session.setAttribute("side2", new Double(side2));
		session.setAttribute("side3", new Double(side3));
		session.setAttribute("msg", null);
		//验证合法性
		if(isTriangle(triang.getSide1(),triang.getSide2(),triang.getSide3())) {
			double p=(triang.getSide1()+triang.getSide2()+triang.getSide3())/2.0;
		    double area=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		    //System.out.println(area);
			session.setAttribute("msg", new Double(area));
		}
		else {
			session.setAttribute("msg", "输入数据不能构成三角形！");
		}
	
			response.sendRedirect(request.getContextPath()+"/show.jsp");//重定向到show.jsp
//			request.getRequestDispatcher("show.jsp").forward(request, response);
//					
	}
	public boolean isTriangle(double side1,double side2,double side3) {
		boolean msg=false;
		if(side1<0 || side2<0 || side3<0)
			return false;
		if(side1<side2+side3 && side2<side1+side3 && side3<side1+side2)
			msg= true;
		return msg;
	}

}
