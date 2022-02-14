package sec04.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*@WebServlet("/logout")*/
public class LogoutTest extends HttpServlet {
	ServletContext context;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		context = getServletContext();
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String user_id = request.getParameter("user_id");
                                             // List에서 삭제할 user_id 가져옴
		session.invalidate();

		List user_list = (ArrayList) context.getAttribute("user_list"); // ServletContext 에서 user_list 가져옴
		user_list.remove(user_id);  // List 에 저장된 user_id 제거
		context.removeAttribute("user_list");  // ServletContext 에서 user_list 제거
		context.setAttribute("user_list", user_list); // 다시 user_id가 제거된 user_list 를 ServletContext 를 저장
		out.println("<br>로그아웃 했습니다.");
	}
}