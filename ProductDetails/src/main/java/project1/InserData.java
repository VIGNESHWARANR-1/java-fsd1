package project1;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insertData")
public class InserData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   
    public InserData() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		out.print("<h1>Display the Record</h1>");
		out.print("<table border='1'><tr><th>Product Id</th><th>Product Name</th><th>Product Cost</th></tr>");
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/productdemo","root","Vickychella27@");
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product where ID="+id+"");
			while(rs.next()) {
				out.print("<tr><td>");
				out.println(rs.getInt(1));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(2));
				out.print("</td>");
				out.print("<td>");
				out.println(rs.getString(3));
				out.print("</td>");
				out.print("</tr>");
				
						
			}
		}
	    catch(Exception p){
	    	System.out.println(p);
	    }
		out.print("</table>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
