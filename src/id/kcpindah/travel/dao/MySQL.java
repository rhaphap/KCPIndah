package id.kcpindah.travel.dao;

import java.sql.*;

public class MySQL {
	
	private Connection con;
	private Statement stmt;
	private String queryUser = "CREATE TABLE User("
			+ "nama VARCHAR(20) NOT NULL, "
			+ "username VARCHAR(20) NOT NULL PRIMARY KEY, "
			+ "password VARCHAR(20) NOT NULL, "
			+ "tlp VARCHAR(20) NOT NULL "
			+ ");";
	private String queryTravel = "CREATE TABLE travel("
			+ "namatravel VARCHAR(20) NOT NULL PRIMARY KEY, "
			+ "alamat VARCHAR(50) NOT NULL, "
			+ "tlp VARCHAR(20) NOT NULL "
			+ ");";
	private String queryJadwal = "CREATE TABLE jadwal("
			+ "namatravel VARCHAR(20) NOT NULL, "
			+ "jam time NOT NULL, "
			+ "tujuan VARCHAR(20) NOT NULL, "
			+ "PRIMARY KEY(jam, tujuan), "
			+ "FOREIGN KEY(namatravel) REFERENCES travel(namatravel) "
			+ ");";
	private String queryBooking = "CREATE TABLE booking("
			+ "username VARCHAR(20) NOT NULL, "
			+ "namatravel VARCHAR(20) NOT NULL, "
			+ "tgl date NOT NULL, "
			+ "jam time NOT NULL, "
			+ "tujuan VARCHAR(20) NOT NULL, "
			+ "alamat VARCHAR(50) NOT NULL, "
			+ "FOREIGN KEY(username) REFERENCES user(username), "
			+ "FOREIGN KEY(namatravel) REFERENCES travel(namatravel), "
			+ "FOREIGN KEY(jam, tujuan) REFERENCES Jadwal(jam, tujuan) "
			+ ");";
	
	public Connection getConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Travel","root","theaurions00"); //root = nama user, theaurions00 = password
        System.out.println("Connection Successfull");
        return con;
	}
	
	public void createDatabase() throws SQLException{
		con = DriverManager.getConnection("jdbc:mysql://localhost:3307/?user=root&password=theaurions00");
		stmt = con.createStatement();
		int result = stmt.executeUpdate("CREATE DATABASE Travel");
//		stmt.close();
		System.out.println("Database Created");
	}
	
	public void createTable(String query) throws SQLException{
		try{
			this.getConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Table Created Successfully");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			stmt.close();
		}
	}
	
	public void insertData(String query){
		
	}
	
	// Setter & Getter	
	public String getQueryUser() {
		return queryUser;
	}

	public void setQueryUser(String queryUser) {
		this.queryUser = queryUser;
	}

	public String getQueryTravel() {
		return queryTravel;
	}

	public void setQueryTravel(String queryTravel) {
		this.queryTravel = queryTravel;
	}

	public String getQueryJadwal() {
		return queryJadwal;
	}

	public void setQueryJadwal(String queryJadwal) {
		this.queryJadwal = queryJadwal;
	}

	public String getQueryBooking() {
		return queryBooking;
	}

	public void setQueryBooking(String queryBooking) {
		this.queryBooking = queryBooking;
	}
}
