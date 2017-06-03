package id.kcpindah.travel.dao;

public class Main {

	public static void main(String[] args) throws Exception {
		MySQL sql = new MySQL();
		sql.createDatabase();
		sql.getConnection();
		sql.createTable(sql.getQueryUser());
		sql.createTable(sql.getQueryTravel());
		sql.createTable(sql.getQueryJadwal());
		sql.createTable(sql.getQueryBooking());
//		sql.getConnection().close();
	}

}
