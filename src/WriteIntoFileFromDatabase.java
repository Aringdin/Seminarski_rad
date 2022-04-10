/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marko
 */
import java.io.*;
import java.sql.*;
import java.util.*;

public class WriteIntoFileFromDatabase {
	public static void main(String[] args) {
		List data = new ArrayList();

		try {
			Connection con = null;
			
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/seminarski_rad", "root", "");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from zaposleni");

			while (rs.next()) {
				String id = rs.getString("ID_Zap");
				String name = rs.getString("Ime");
				String address = rs.getString("Prezime");
				String contactNo = rs.getString("Radna_uloga");
                                String ID_Operacije = rs.getString("ID_Operacije");
				data.add(id + " " + name + " " + address + " " + contactNo +" "+ID_Operacije);

			}
			writeToFile(data, "Zaposleni.txt");
			rs.close();
			st.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void writeToFile(java.util.List list, String path) {
		BufferedWriter out = null;
		try {
			File file = new File(path);
			out = new BufferedWriter(new FileWriter(file, true));
			for (Object s : list) {
				out.write((String) s);
				out.newLine();

			}
			out.close();
		} catch (IOException e) {
		}
	}
}
