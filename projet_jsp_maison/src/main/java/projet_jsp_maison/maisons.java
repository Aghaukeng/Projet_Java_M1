package projet_jsp_maison;

public class maisons {
	private int id;
	private String adresse;
	private int taille;
	private int nb_chambres;
	private int nb_salles_de_bain;
	private double prix;
	private String description ;
	
	/**
	 * @param id
	 * @param adresse
	 * @param taille
	 * @param nb_chambres
	 * @param nb_salles_de_bain
	 * @param prix
	 * @param description
	 */
	public maisons(int id, String adresse, int taille, int nb_chambres, int nb_salles_de_bain, double prix,
			String description) {
		super();
		this.id = id;
		this.adresse = adresse;
		this.taille = taille;
		this.nb_chambres = nb_chambres;
		this.nb_salles_de_bain = nb_salles_de_bain;
		this.prix = prix;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getNb_chambres() {
		return nb_chambres;
	}

	public void setNb_chambres(int nb_chambres) {
		this.nb_chambres = nb_chambres;
	}

	public int getNb_salles_de_bain() {
		return nb_salles_de_bain;
	}

	public void setNb_salles_de_bain(int nb_salles_de_bain) {
		this.nb_salles_de_bain = nb_salles_de_bain;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "maisons [id=" + id + ", adresse=" + adresse + ", taille=" + taille + ", nb_chambres=" + nb_chambres
				+ ", nb_salles_de_bain=" + nb_salles_de_bain + ", prix=" + prix + ", description=" + description+"]";
	}

}
