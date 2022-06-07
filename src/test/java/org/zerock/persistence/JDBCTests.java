package org.zerock.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	
	@Test
	public void testConnectcion() throws Exception{
        
		Class clz = Class.forName("org.mariadb.jdbc.Driver");
		
		Connection con = 
				DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/sample",
											"root",
											"1155211");
		
		log.info(con);
		
		con.close();

}
}