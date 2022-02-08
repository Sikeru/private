package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/guguTest")
public class GuguTest extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}

	public void destroy() {
		System.out.println("System 메서드 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		int dan = Integer.parseInt(request.getParameter("dan"));
		
		out.print("<table border = 1px width = 800px align=center>");
		out.print("<tr align=cnter bgcolor='#FFFF66'>");
		out.print("<td colspan=2>"+dan+"단 출력 </td>");
		out.print("</tr>");
		
		for(int i =1; i<10; i++) {
			out.print("<tr align=center>");
			out.print("<td width=400px>");
			out.print(dan+" * "+i);
			out.print("<tr width=400px>");
			out.print(i*dan);
			out.print("</td>");
			out.print("</tr>");
		}
		out.print("</table>");
	}

}
