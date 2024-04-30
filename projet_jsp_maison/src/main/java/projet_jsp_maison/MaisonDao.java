package projet_jsp_maison;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;



public class MaisonDao{

	static List<maisons> listmaisons= new ArrayList<maisons>();

	static public List<maisons> getAllmaisons()throws Exception {

		String sql = "SELECT * FROM maisons";

		Connection conn = Dbconnect.getConnection();
		Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {

			int id = resultSet.getInt("id");
			String adresse = resultSet.getString("adresse");
			int taille = resultSet.getInt("taille");
			int nb_chambres= resultSet.getInt("nb_chambres");
			int nb_salles_de_bain = resultSet.getInt("nb_salles_de_bain");
			double prix = resultSet.getDouble("prix");
			String description = resultSet.getString("description");
			maisons itemmaisons = new maisons (id,adresse,taille,nb_chambres,nb_salles_de_bain,prix,description);
			listmaisons.add(itemmaisons);
		}
		resultSet.close();
		statement.close();
		conn.close();

		// itemmaisondisconnect();

		return listmaisons;

}
	static public maisons getmaisonsById(int maisonsid) throws Exception {

		Connection conn = Dbconnect.getConnection();

		String query = "select * from maisons where id = " + maisonsid;
		Statement stmt = conn.createStatement();

		ResultSet res = stmt.executeQuery(query);
		res.next();
		int id = res.getInt("id");
		String adresse = res.getString("adresse");
		int taille= res.getInt("taille");
		int nb_chambres= res.getInt("nb_chambres");
		int nb_salles_de_bain= res.getInt("nb_salles_de_bain");
		double prix = res.getInt("prix");
		String description= res.getString("description");
		maisons unemaisons = new maisons (id, adresse,taille,nb_chambres,nb_salles_de_bain, prix, description);

		return unemaisons;

	}

}
	
