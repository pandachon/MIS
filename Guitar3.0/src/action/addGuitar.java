package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Factory.Idao;
import Factory.MysqlFactory;
import model.Builder;
import model.Guitar;
import model.GuitarSpec;
import model.Type;
import model.Wood;

/**
 * Servlet implementation class addGuitar
 */
@WebServlet("/addGuitar")
public class addGuitar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addGuitar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");
		Double price=Double.parseDouble(request.getParameter("price"));
		String serialNumber=request.getParameter("serialNumber");
		String builder=request.getParameter("builder");
		String type=request.getParameter("type");
		String model=request.getParameter("model");
		Integer numStrings=Integer.parseInt(request.getParameter("numStrings"));
		String backwood=request.getParameter("backwood");
		String topwood=request.getParameter("topwood");
		GuitarSpec spec=new GuitarSpec(Builder.valueOf(builder),  
			       Type.valueOf(type), Wood.valueOf(backwood), Wood.valueOf(topwood));
		
		 Guitar guitar=new Guitar(); 		
			guitar.setPrice(price);	
			guitar.setSerialNumber(serialNumber);
			guitar.setNumStrings(numStrings);
			guitar.setModel(model);	
			guitar.setSpec(spec);

			//根据需要调换数据库
			Idao iDao=new  MysqlFactory();
			try {
				boolean a=iDao.GetGuitarInstance().addGuitar(guitar);
			System.out.println(a);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
