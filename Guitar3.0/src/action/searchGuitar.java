package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB.DbUtil;
import Factory.Idao;
import Factory.SqliteFactory;
import model.Builder;
import model.Guitar;
import model.GuitarSpec;
import model.Inventory;
import model.Type;
import model.Wood;

/**
 * Servlet implementation class searchGuitar
 */
@WebServlet("/searchGuitar")
public class searchGuitar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchGuitar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String builder = request.getParameter("builder");
		String type = request.getParameter("type");
		String backwood = request.getParameter("backwood");
		String topwood = request.getParameter("topwood");
		
	   GuitarSpec whatErinLikes = new GuitarSpec(Builder.valueOf(builder),  
	       Type.valueOf(type), Wood.valueOf(backwood), Wood.valueOf(topwood));
	    List matchingGuitars = Inventory.search(whatErinLikes);
	    PrintWriter out=response.getWriter();		
	    if (!matchingGuitars.isEmpty()) {
	      System.out.println("Erin, you might like these guitars:");
        for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
	        Guitar guitar = (Guitar)i.next();
	        GuitarSpec spec = guitar.getSpec();
	        out.println("  We have a " +
	          spec.getBuilder() + " " + guitar.getModel() + " " +
	          spec.getType() + " guitar:\n     " +
	          spec.getBackWood() + " back and sides,\n     " +
	          spec.getTopWood() + " top.\n  You can have it for only $" +
	          guitar.getPrice() + "!\n  -------------------------------------");
	      }
	    } else {
	     out.println("Sorry, Erin, we have nothing for you.");
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
