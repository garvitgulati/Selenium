package in.lti.day3;
import util.basic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Dbconnection extends basic {
	@Test
	public void f() throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		Connection C = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		ResultSet R = C.createStatement().executeQuery("Select * from login");
		while (R.next()) {
			String user = R.getString(1);
			String pass = R.getString(2);
			driver.get("http://127.0.0.1:8080/htmldb/");
			driver.findElement(By.name("p_t01")).sendKeys(user);
			driver.findElement(By.name("p_t02")).sendKeys(pass);
			driver.findElement(By.cssSelector("input[value='Login']")).click();
			if (driver.getTitle().equals("Oracle")) {
				System.out.println("login done");
				driver.findElement(By.linkText("Logout")).click();
			} else {
				System.out.println("login not done");
			}
		}
	}
}