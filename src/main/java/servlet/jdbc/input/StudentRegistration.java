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

@WebServlet("/StudentRegistration")
public class StudentRegistration extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public StudentRegistration() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		String email = request.getParameter("email");
		String course = request.getParameter("course");
		String batch = request.getParameter("batch");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		StudentEntity st = new StudentEntity(name, contact, email, course, batch);
		System.out.println(st);
		boolean ans = StudentDAO.InsertStudentIntoDB(st);

		if (ans == true) {
			RequestDispatcher rd = request.getRequestDispatcher("addStudent.jsp");
			rd.include(request, response);
			out.print("<h3>Successfully Added</h3>");
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("addStudent.jsp");
			rd.include(request, response);
			out.print("<h3>Failed to Add</h3>");
		}
	}

}
