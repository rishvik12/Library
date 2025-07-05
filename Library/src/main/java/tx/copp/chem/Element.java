package tx.copp.chem;

public class Element {

	private String name;
	private String symbol;
	private int atomicNumber;
	private double atmoicMass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getAtomicNumber() {
		return atomicNumber;
	}
	public void setAtomicNumber(int atomicNumber) {
		this.atomicNumber = atomicNumber;
	}
	public double getAtmoicMass() {
		return atmoicMass;
	}
	public void setAtmoicMass(double atmoicMass) {
		this.atmoicMass = atmoicMass;
	}
	@Override
	public String toString() {
		return "Element [name=" + name + ", symbol=" + symbol + ", atomicNumber=" + atomicNumber + ", atmoicMass="
				+ atmoicMass + "]";
	}
	
	
	
}
