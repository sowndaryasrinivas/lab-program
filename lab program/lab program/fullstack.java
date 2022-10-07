

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value ="/student" )
public class Manager1 extends HttpServlet {	
	
	public  Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con=null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","");
		return con;
	}	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Manager1 manager1 = new Manager1();
		Connection con=null;
		 Statement stmt= null;
		 String query=null;
		String f_name = req.getParameter("f_name");
		
		String l_name=req.getParameter("lname");
		
		String email=req.getParameter("email");
		
		String Mnumber=req.getParameter("Mnumber");
		
		System.out.println(f_name +","+l_name+","+email+","+Mnumber);
		
		try {
			 con=manager1.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		long number = Long.valueOf(Mnumber);		
		query="INSERT INTO student (f_name,l_name,email,m_number)VALUES('"+f_name+"','"+l_name+"','"+email+"',"+number+");";
		
		
		System.out.println(query);		
		try {
			stmt = con.createStatement();
			 
			 stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			con=manager1.getConnection();
			
			stmt =con.createStatement();
			
			query="select * from student";
			
			ResultSet RS = stmt.executeQuery(query);
			
			resp.setContentType("text/html");
			
			PrintWriter out=  resp.getWriter();
			
			while(RS.next())
			{
				out.print("<h1>"+RS.getString(1)+","+
						RS.getString(2)+","+RS.getString(3)+","+
						RS.getLong(4)+"</h1>");
				
				out.println();
			}
			
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Done");
	}

}
