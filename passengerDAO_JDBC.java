
import java.util.*;
import java.sql.*;
public class passengerDAO_JDBC implements passengerDAO{
																																																																																																																																																																																																																																															Connection dbConnection;

	public passengerDAO_JDBC(Connection dbconn){
		// JDBC driver name and database URL
 		//  Database credentials
		dbConnection = dbconn;

	}	

	@Override
 	public void bookTicket(){
 		//passenger passenger=new passenger();
 		java.sql.PreparedStatement preparedStatement=null;
 		String sql;
 		Statement stmnt= null;
 		
 		int r=0;
 		
 		try{
 		sql = "Insert into passenger(name,ticket_no,phone_no,age,sex) values (?,?,?,?,?)";
 		preparedStatement = dbConnection.prepareStatement(sql);
 		System.out.println("Enter name; ");
 		Scanner se1= new Scanner(System.in);
 		String name1= se1.nextLine();


 		System.out.println("Enter phone_no; ");
 		Scanner se2= new Scanner(System.in);
 		int phone_no1 = se2.nextInt();
 		System.out.println("Enter age; ");
 		Scanner se3= new Scanner(System.in);
 		int age1= se3.nextInt();
 		System.out.println("Enter sex; ");
 		Scanner se4= new Scanner(System.in);
 		String sex1= se4.nextLine();
 		int ticket_no1 =(int )(Math.random());

 		preparedStatement.setString(1,name1);
 		preparedStatement.setInt(2,ticket_no1);
 		preparedStatement.setInt(3,phone_no1);
 		preparedStatement.setInt(4,age1);
 		preparedStatement.setString(5,sex1);	
 	    r = preparedStatement.executeUpdate();
 		preparedStatement.close();
 		
 		}
 		catch(SQLException e)
 		{
 			e.printStackTrace();
 		}
 		
 	}

 	@Override
 	public String searchTicket() {
 		
 	 	java.sql.PreparedStatement preparedStatement=null;
 	 	String sql;
 	 	Statement stmt = null;
      	
 	    try{
 	    stmt = dbConnection.createStatement();
 	    sql = "SELECT * FROM passenger where ticket_no=?";
 	    
 	    System.out.println("Enter Ticket Number: ");
 	    Scanner se = new Scanner(System.in);
 	    int ticket_no1 = se.nextInt();

 	    ResultSet rs = stmt.executeQuery(sql);

 	 	preparedStatement.setInt(1,ticket_no1);
 	    
 	    while(rs.next())
 	    {
 	    String name=rs.getString("name");
 	    long phone_no=rs.getLong("phone_no");
 	    }
 	    preparedStatement.close();
 		
 	}
 	catch (SQLException e) {
 		e.printStackTrace();
 	}
 	    String sw="hgctf";
 	    return sw;
 		
}

	@Override
 	public void cancelTicket(){
 		java.sql.PreparedStatement preparedStatement=null;
 		String sql;

 	    try{
 	    sql = "delete FROM passenger where ticket_no=?";

 	    preparedStatement = dbConnection.prepareStatement(sql);
 	    System.out.println("Enter your Ticket Number: ");
 	    Scanner se = new Scanner(System.in);
 	    int ticket_no1 = se.nextInt();

 	    preparedStatement.setInt(1,ticket_no1);
 	    int r = preparedStatement.executeUpdate();
 		preparedStatement.close();
 		
 	}
 	catch (SQLException e) {
 		e.printStackTrace();
 	}
 			
 	}

}