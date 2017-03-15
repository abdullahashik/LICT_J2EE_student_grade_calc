
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.GradeCalculate;

/**
 * Servlet implementation class StudentInfoForm
 */
@WebServlet("/StudentInfoForm")
public class StudentInfoForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	GradeCalculate gradeCalculate;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentInfoForm() {
		super();

	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		gradeCalculate = new GradeCalculate() {
		};
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		int data = Integer.parseInt(request.getParameter("data"));
		int machine = Integer.parseInt(request.getParameter("machine"));
		int compiler = Integer.parseInt(request.getParameter("compiler"));
		int oop = Integer.parseInt(request.getParameter("oop"));
		int digital = Integer.parseInt(request.getParameter("digital"));
		double[] marks = { data, machine, compiler, oop, digital };

		double Cgpa = getCgpa(marks);

		request.setAttribute("name", name);
		request.setAttribute("id", id);
		request.setAttribute("marks", gradeCalculate.totalMarks(marks));
		request.setAttribute("cgpa", Cgpa);
		request.setAttribute("grade", gradeCalculate.calculateGrade(Cgpa));
		request.getRequestDispatcher("/result.jsp").include(request, response);
	}

	/**
	 * calculate student cgpa
	 * 
	 */
	protected double getCgpa(double... marks) {
		double[] cgpa = new double[marks.length];
		for (int i = 0; i < marks.length; i++) {
			cgpa[i] = gradeCalculate.calculateCgpa(marks[i]);
		}
		double avgCgpa = gradeCalculate.avgCgpa(cgpa);
		return avgCgpa;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
