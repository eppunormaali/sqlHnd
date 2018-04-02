package srvGroupId.srvArtifactId;

import java.sql.*;

public class databaseHandling {

	   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/";

	   //  Database credentials
	   ////static final String USER = "username";
	   ////static final String PASS = "password";
	   
	   public void createDatabase(String db, String USER, String PASS) {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);

	      //STEP 4: Execute a query
	      System.out.println("Creating database...");
	      stmt = conn.createStatement();
	      
	      String sql = "CREATE DATABASE "+db;
	      stmt.executeUpdate(sql);
	      System.out.println("Database created successfully...");
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            stmt.close();
	      }catch(SQLException se2){
	      }// nothing we can do
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("Goodbye!");
	}//createDatabase
	   
	public void deleteDabase(String db, String USER, String PASS) {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      ////Class.forName("com.mysql.jdbc.Driver");
			   Class.forName(JDBC_DRIVER);

		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL+db, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		      System.out.println("Deleting database...");
		      stmt = conn.createStatement();
		      
		      String sql = "DROP DATABASE "+db;
		      stmt.executeUpdate(sql);
		      System.out.println("Database deleted successfully...");
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");
		}//end main
	
	public void createTableToDatabase(String db, String USER, String PASS) {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL+db, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		      System.out.println("Creating table in given database...");
		      stmt = conn.createStatement();
		      
		      String sql = "CREATE TABLE REGISTRATION " +
		                   "(id INTEGER not NULL, " +
		                   " first VARCHAR(255), " + 
		                   " last VARCHAR(255), " + 
		                   " age INTEGER, " + 
		                   " PRIMARY KEY ( id ))"; 

		      stmt.executeUpdate(sql);
		      System.out.println("Created table in given database...");
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");
	}
	
	public void deleteTableFromDatabase(String db, String USER, String PASS) {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL+db, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		      System.out.println("Deleting table in given database...");
		      stmt = conn.createStatement();
		      
		      String sql = "DROP TABLE REGISTRATION ";
		 
		      stmt.executeUpdate(sql);
		      System.out.println("Table  deleted in given database...");
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");		
	}
	
	public void insertRecordToDatabase(String db, String USER, String PASS) {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL+db, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		      System.out.println("Inserting records into the table...");
		      stmt = conn.createStatement();
		      
		      String sql = "INSERT INTO `REGISTRATION` (`id`,`first`,`last`,`age`) VALUES (1, 'Zara', 'Ali', 18)";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO `REGISTRATION` " +
		                   "VALUES (2, 'Mahnaz', 'Fatma', 25)";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO `REGISTRATION` " +
		                   "VALUES (3, 'Zaid', 'Khan', 30)";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO `REGISTRATION` " +
		                   "VALUES(4, 'Sumit', 'Mittal', 28)";
		      stmt.executeUpdate(sql);
		      System.out.println("Inserted records into the table...");

		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");
	}
	
	public void deleteRecordFromDatabase(String db, String USER, String PASS) {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL+db, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();
		      String sql = "DELETE FROM REGISTRATION " +
		                   "WHERE id = 2";
		      stmt.executeUpdate(sql);

		      // Now you can extract all the records
		      // to see the remaining records
		      sql = "SELECT id, first, last, age FROM REGISTRATION";
		      ResultSet rs = stmt.executeQuery(sql);

		      while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("id");
		         int age = rs.getInt("age");
		         String first = rs.getString("first");
		         String last = rs.getString("last");

		         //Display values
		         System.out.print("ID: " + id);
		         System.out.print(", Age: " + age);
		         System.out.print(", First: " + first);
		         System.out.println(", Last: " + last);
		      }
		      rs.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");		
	}
	
	public void updateRecordInDatabase(String db, String USER, String PASS) {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL+db, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();
		      String sql = "DELETE FROM REGISTRATION " +
		                   "WHERE id = 2";
		      stmt.executeUpdate(sql);

		      // Now you can extract all the records
		      // to see the remaining records
		      sql = "SELECT id, first, last, age FROM REGISTRATION";
		      ResultSet rs = stmt.executeQuery(sql);

		      while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("id");
		         int age = rs.getInt("age");
		         String first = rs.getString("first");
		         String last = rs.getString("last");

		         //Display values
		         System.out.print("ID: " + id);
		         System.out.print(", Age: " + age);
		         System.out.print(", First: " + first);
		         System.out.println(", Last: " + last);
		      }
		      rs.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");		
	}
	
		public Connection selectDatabase(String db, String USER, String PASS) {
			   Connection conn = null;
			   try{
			      //STEP 2: Register JDBC driver
			      Class.forName("com.mysql.jdbc.Driver");
			      //STEP 3: Open a connection
			      System.out.println("Connecting to a selected database...");
			      conn = DriverManager.getConnection(DB_URL+db, USER, PASS);
			      System.out.println("Connected database successfully...");
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			      throw new AssertionError("HOX! Database selection fails!!!");
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			      throw new AssertionError("HOX! Database selection fails!!!");
			   }
			   System.out.println("Selected. Goodbye!");
			   return conn;
		}
		
		public void checkDatabaseexist(String db, String USER, String PASS){
			   Connection conn = null;
			   Statement stmt = null;
			   boolean result = false;
			   String name = null;
			   try{
			      //STEP 2: Register JDBC driver
			      Class.forName("com.mysql.jdbc.Driver");

			      //STEP 3: Open a connection
			      System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL, USER, PASS);

			      ResultSet rs = conn.getMetaData().getCatalogs();
			      while (rs.next()) {
			    	  System.out.println(rs.getString("TABLE_CAT"));
			    	    if (rs.getString("TABLE_CAT").equals(db))
			    	    	result = true;
			    	}
			      if (!result)
			    	  throw new testcaseFailException("database exist check fails");

			   }  
			   catch(SQLException se){
				      //Handle errors for JDBC
				      se.printStackTrace();
				      throw new AssertionError("Handle errors for JDBC fails!!!");
			   }catch(Exception e){
				      //Handle errors for Class.forName
				      e.printStackTrace();
				      throw new AssertionError("//Handle errors for Class.forName fails!!!");
			   }
		       finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            conn.close();
			      }catch(SQLException se){
			      }// do nothing
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			         throw new AssertionError("db close fails!!!");
			      }//end finally try
		       }
		}
		
		public void tableExistInDatabase(String table, String db, String USER, String PASS) {
			   Connection conn = null;
			   Statement stmt = null;
			   boolean result= false;
			   try{
			      //STEP 2: Register JDBC driver
			      Class.forName("com.mysql.jdbc.Driver");

			      //STEP 3: Open a connection
			      System.out.println("Connecting to a selected database...");
			      conn = DriverManager.getConnection(DB_URL+db, USER, PASS);
			      System.out.println("Connected database successfully...");
			      
			      //STEP 4: Execute a query
			      System.out.println("Checking database exist...");
			      stmt = conn.createStatement();
			      
			      ResultSet rs = conn.getMetaData().getTables(null, null, "%", null);
			      while (rs.next()) {
			    	  System.out.println(rs.getString(3));
			    	    if (rs.getString(3).equals(table))
			    	    	result = true;
			    	}
			      if (!result)
			    	  throw new testcaseFailException("database exist check fails");

			   }  
			   catch(SQLException se){
				      //Handle errors for JDBC
				      se.printStackTrace();
				      throw new AssertionError("Handle errors for JDBC fails!!!");
			   }catch(Exception e){
				      //Handle errors for Class.forName
				      e.printStackTrace();
				      throw new AssertionError("//Handle errors for Class.forName fails!!!");
			   }
		       finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            conn.close();
			      }catch(SQLException se){
			      }// do nothing
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			         throw new AssertionError("db close fails!!!");
			      }//end finally try
		       }
		}

		public void checkRecordInDatabase(String field, String db, String USER, String PASS) {
			   Connection conn = null;
			   Statement stmt = null;
			   boolean result= false;
			   try{
			      //STEP 2: Register JDBC driver
			      Class.forName("com.mysql.jdbc.Driver");

			      //STEP 3: Open a connection
			      System.out.println("Connecting to a selected database...");
			      conn = DriverManager.getConnection(DB_URL+db, USER, PASS);
			      System.out.println("Connected database successfully...");
			      
			      //STEP 4: Execute a query
			      System.out.println("Creating statement...");
			      stmt = conn.createStatement();
			      String sql = "SELECT * from REGISTRATION WHERE id = " + "2";

			      ResultSet rs = stmt.executeQuery(sql);

			         //Retrieve by column name
			      if (rs.getString("last").equals(field))
			    		  result = true;
			      if (!result)
			    	  throw new testcaseFailException("database gield check fails!!!");
			         //Display values
			         System.out.println(rs.getString("last"));
			      rs.close();
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            conn.close();
			      }catch(SQLException se){
			      }// do nothing
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   System.out.println("Goodbye!");	
		}

		public void updateRecord(String filedName, String newFieldValue, int rowIndex, String db, String USER, String PASS) {
			   Connection conn = null;
			   Statement stmt = null;
			   boolean result= false;
			   try{
			      //STEP 2: Register JDBC driver
			      Class.forName("com.mysql.jdbc.Driver");

			      //STEP 3: Open a connection
			      System.out.println("Connecting to a selected database...");
			      conn = DriverManager.getConnection(DB_URL+db, USER, PASS);
			      System.out.println("Connected database successfully...");
			      
			      //STEP 4: Execute a query
			      System.out.println("Creating statement...");
			      stmt = conn.createStatement();
			      String sql = "update REGISTRATION set "+filedName+"=? where id = ?";
			      PreparedStatement preparedStmt = conn.prepareStatement(sql);
			      
			      preparedStmt.setString(1, newFieldValue);
			      preparedStmt.setInt(2, rowIndex);
			      
			      preparedStmt.executeUpdate();
			         //Retrieve by column name
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            conn.close();
			      }catch(SQLException se){
			      }// do nothing
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   System.out.println("Goodbye!");	
		}

}
