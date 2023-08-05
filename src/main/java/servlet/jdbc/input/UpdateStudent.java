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
import servlet.jdbc.student.StudentEntity;

@WebServlet("/UpdateStudent")
public class UpdateStudent extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public UpdateStudent() {
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
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		String email = request.getParameter("email");
		String course = request.getParameter("course");
		String batch = request.getParameter("batch");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		StudentEntity st = new StudentEntity(id, name, contact, email, course, batch);
		System.out.println(st);
		boolean ans = StudentDAO.UpdateStudentIntoDB(st);
		if (ans == true) {
			out.print("<h3>Successfully Updated</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("Show_Data.jsp");
			rd.include(request, response);
		} else {
			out.print("<h3>Failed Updation</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("Edit_Data.jsp");
			rd.include(request, response);
		}
	}

}
