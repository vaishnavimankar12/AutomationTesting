package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

import org.openqa.selenium.By;

import dynamic_code.Base_class;

public class Databaseclass extends Base_class {

	public static void main(String[] args) throws SQLException {

		
		 /* class= DriverManager 
		  Connection connect= DriverManager.getConnection(String URL, String username, String password);
		 
		  String host;
		  String host = localhost ;
		  String port_number=  "3306";
		 
		  String URL ="jdbc.mysql://host:port_number//databasename";
	
		  String username="root";
		  String password="Admin";
		  
		  Statement create = connect.createStatement();
		  Set<username>=create.executeQuery("select username, password from sqltable where serial_number=1;");
		  username.next();
		  System.out.printLn
		  password.next();
		  */
		
		String host = "localhost" ;
		String port_number=  "3306";
		Launchbrowser("Chrome");
		HitURL("https://www.facebook.com/");
		
		//url string="jdbc:mysql://host:portnumber/database"
		Connection connect = DriverManager.getConnection("jdbc:mysql://"+ ":"+port_number+"/June25","root","vaish@123");
		
		Statement cs = connect.createStatement();
		
		ResultSet result = cs.executeQuery("select username, password from sqltable where serial_number=1;");
		
		result.next();
		
		System.out.println(result.getString("username"));
		System.out.println(result.getString("password"));
		
		d.findElement(By.xpath("//input[@data-testid=\"royal-email\"]")).sendKeys(result.getString("username"));
		d.findElement(By.xpath("//input[@data-testid=\"royal-pass\"]")).sendKeys(result.getString("password"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		  
	}

}
