package techproed.jdbcOrnekler;

import java.sql.*;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class Jdbc1Query02 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root","1234");

		Statement st = (Statement) con.createStatement();
		
		ResultSet  tablo = st.executeQuery("SELECt * FROM bolumler");

		while (tablo.next()) {
			System.out.println(tablo.getInt(1) + " " + tablo.getString("bolum_isim")+" "+tablo.getString(3));
			
		}
		System.out.println("=============");
		st.executeQuery("SELECT personel_isim,maas FROM personel"+ " WHERE bolum_id in(10,30)"
		+"ORDER BY maas DESC");
		ResultSet tablo2 = null;
		while(tablo2.next()) {
			System.out.println(tablo2.getString(1)+ "\t" +tablo2.getInt(2));
		}
		
	}
    

}
