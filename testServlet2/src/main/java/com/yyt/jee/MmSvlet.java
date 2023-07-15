package com.yyt.jee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MmSvlet
 */
@WebServlet("/MmSvlet")
public class MmSvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public MmSvlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
	@javax.ejb.EJB
	private HelloBean bean;
	
	@javax.inject.Inject
	private HelloPojo pojo;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		final java.io.Writer writer = response.getWriter();
		writer.append("<html>");
		writer.append("<body><h1>hello</h1></body>");
		writer.append("<body><h1>hello " + bean.from() + " </h1></body>");
		writer.append("<body><h1>hello " + pojo.from() + " </h1></body>");
		writer.append("</html>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
