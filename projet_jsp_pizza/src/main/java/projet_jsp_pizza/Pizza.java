package projet_jsp_pizza;

public class Pizza {
	private int nroPizza;
	private String designPizza;
	private double tarifPizza;
	public Pizza(int nroPizza, String designPizza, double tarifPizza) {
		super();
		this.nroPizza = nroPizza;
		this.designPizza = designPizza;
		this.tarifPizza = tarifPizza;
	}
	public int getNroPizza() {
		return nroPizza;
	}
	public void setNroPizza(int nroPizza) {
		this.nroPizza = nroPizza;
	}
	public String getDesignPizza() {
		return designPizza;
	}
	public void setDesignPizza(String designPizza) {
		this.designPizza = designPizza;
	}
	public double getTarifPizza() {
		return tarifPizza;
	}
	public void setTarifPizza(double tarifPizza) {
		this.tarifPizza = tarifPizza;
	}
	@Override
	public String toString() {
		return "Pizza [nroPizza=" + nroPizza + ", designPizza=" + designPizza + ", tarifPizza=" + tarifPizza + "]";
	}
	
	

	

}
