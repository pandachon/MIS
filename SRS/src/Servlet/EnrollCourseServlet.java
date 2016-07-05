package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.AjaxResult;

/**
 * Servlet implementation class EnrollCourseServlet
 */
@WebServlet("/EnrollCourseServlet")
public class EnrollCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnrollCourseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/json");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
	    
		try {
            //�˴�ֱ�ӷ���ѡ�γɹ���û��ִ��ѡ���߼�
			//System.out.println(AjaxResult.Success("ѡ�γɹ���"));
			//out.print(AjaxResult.Success("ѡ�γɹ���"));
			out.print(AjaxResult.error("ѡ��ʧ�ܣ��Ѿ�ѡ������ͬ�Ŀγ̣�"));
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			AjaxResult.error("ѡ��ʧ�ܣ�ԭ��....");
		}	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
