package techproed.jdbcOrnekler;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc1Query01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		// 1) Ilgili driver i yuklemeliyiz. Tv nin fisini tak, mesela baska alet calismasin, ne calisacagini bilsin
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		// 2) Baglanti olusturmaliyiz uydu sifrelerini girmeliyiz
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "Gt77736055.,");
		
		// 3) sql komutlari icin bir Statement nesnesi olustur. Her kanal icin kumanda da yer ayarlamak
		Statement st= (Statement) con.createStatement();
		
		// SQL ifadeleri yazabilir ve calistirabiliriz kumanda da 1 e basarim trt1 gelir
		
		ResultSet veri=((java.sql.Statement) st).executeQuery("Select isim, maas FROM personel WHERE id=123456789");
		
		
		//5) sonuclari aldik ve isledik
		
		while (veri.next()) {
			System.out.println(veri.getString("isim") + veri.getInt("maas"));
			
		}
		
		
	

	}

}