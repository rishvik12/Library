package tx.copp.oak.fin;

public class Company {

	private String name;
	private String sector;
	
	private int outstandingshares;
	private String countryCode;
	private int numberEmp;
	
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public int getOutstandingshares() {
		return outstandingshares;
	}

	public void setOutstandingshares(int outstandingshares) {
		this.outstandingshares = outstandingshares;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public int getNumberEmp() {
		return numberEmp;
	}

	public void setNumberEmp(int numberEmp) {
		this.numberEmp = numberEmp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", sector=" + sector + ", outstandingshares=" + outstandingshares
				+ ", countryCode=" + countryCode + ", numberEmp=" + numberEmp + ", type=" + type + "]";
	}
	
	
	

	}

