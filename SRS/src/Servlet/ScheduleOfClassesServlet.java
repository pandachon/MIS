package Servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.ScheduleOfClasses;
import Service.ListBox;
import Service.ScheduleOfClassesService;
import Dao.DaoFactory;
import Model.Section;
import Service.AjaxResult;
import Service.ListBox;

/**
 * Servlet implementation class ScheduleOfClassesServlet
 */
@WebServlet("/ScheduleOfClassesServlet")
public class ScheduleOfClassesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScheduleOfClassesServlet() {
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
		
		String semester = "SP2005";
		try {
			ScheduleOfClassesService scs = new ScheduleOfClassesService(semester, DaoFactory.createSectioneDao());
			Map<String, Model.Section> sections = scs.getScheduleOfClasses().getSectionsOffered();
			List<ListBox> dtos = new ArrayList<ListBox>();
			for(String key : sections.keySet()){
				dtos.add(
						new ListBox(sections.get(key).getFullSectionNo()
								       , sections.get(key).getFullSectionInfo()));
			}			
			System.out.println(AjaxResult.success(dtos));
			out.print(AjaxResult.success(dtos));
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();	
			out.print(AjaxResult.error("����XX����"));
		}	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
