package servlet.jdbc.input;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.jdbc.StudentDAO.StudentDAO;

@WebServlet("/DeleteStudent")
public class DeleteStudent extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public DeleteStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		boolean ans = StudentDAO.DeleteStudentFromDB(id);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if (ans == true) {
			out.print("<h3>Successfully Deleted</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("Delete_Data.jsp");
			rd.include(request, response);
		} else {
			out.print("<h3>Not Deleted</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("Delete_Data.jsp");
			rd.include(request, response);
		}
	}

}
