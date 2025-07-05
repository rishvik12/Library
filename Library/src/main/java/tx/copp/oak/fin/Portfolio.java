package tx.copp.oak.fin;

import java.util.ArrayList;

public class Portfolio {

	private String id;
	
	private String name;
	
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	private ArrayList<Holding>	holdingList = new ArrayList<Holding>(); String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public ArrayList<Holding> getHoldings() {
		return holdingList;
	}



	public void setHoldings(ArrayList<Holding> holdings) {
		this.holdingList = holdings;
	}
	
	


	public void addHolding(Holding input)	{
		holdingList.add(input);
		
		

	}

	


	@Override
	public String toString() {
		return "Portfolio [name=" + name + ", holdingList=" + holdingList + "]";
	}
	
	public double getTotalMktValue()	{
		double tmv = 0;
		
		for (Holding holding : holdingList) {
			tmv = tmv + holding.getNumberofshares() * holding.getStock().getPrice();
		}
		
		return tmv;
		
	}

}
