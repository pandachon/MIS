package action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB.DbUtil;
import Dao.Guitar;
import Dao.GuitarSpec;
import Dao.Inventory;
/**
 * Servlet implementation class guitarPost
 */
@WebServlet("/guitarPost")
public class guitarPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public guitarPost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String builder = request.getParameter("builder");
		String type = request.getParameter("type");
		String backwood = request.getParameter("backwood");
		String topwood = request.getParameter("topwood");
		

		//根据查询条件，分装成一个查询对象GuitarSpec
		GuitarSpec guitarspec = new GuitarSpec(builder,type,backwood,topwood);
		
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		List<Guitar> matchingGuitars = inventory.search(guitarspec);

		request.setAttribute("matchingGuitar", matchingGuitars);
		request.getRequestDispatcher("/searchguitar.jsp").forward(request,response);
	}

	private static void initializeInventory(Inventory inventory){
		Connection connection = null;
		DbUtil db =  new DbUtil();
		PreparedStatement ps = null;
		connection = db.connection;
		
		try {
				ps = connection.prepareStatement("select * from Guitar");
	
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()){			
					inventory.addGuitar(rs.getString(1),rs.getDouble(2),rs.getString(4),rs.getInt(8), new GuitarSpec(rs.getString(3),rs.getString(5),rs.getString(6),rs.getString(7)));
				}
				if(rs != null){
					rs.close();
				}
				if(ps != null){
					ps.close();
				}
				connection.close();
			} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
