package jdbcdemo;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		
		try{
			//Get connection to DB
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "Mike" , "Sillygoose1!");
			
			//2. create statement
			Statement myStmt = myConn.createStatement();
			
			//3. Execute SQL query
			ResultSet myRs = myStmt.executeQuery("select * from employees");
			
			//4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
				
			}
			
		}
		catch (Exception exc){
			exc.printStackTrace();
			
		}

	}

}
