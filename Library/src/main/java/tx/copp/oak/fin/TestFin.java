package tx.copp.oak.fin;

public class TestFin {

	public static void main(String[] args) {

		Portfolio rishvik = new Portfolio();
		rishvik.setName("robux");
		rishvik.setId("rishfishtishswish");
		
		Holding h1 = new Holding();
		Holding h2 = new Holding();
		Holding h3 = new Holding();
		Holding h4 = new Holding();
		Holding h5 = new Holding();
		
		Company ibmc = new Company();
		ibmc.setName("International Business Machines");
		ibmc.setCountryCode("US");
		ibmc.setNumberEmp(5000);
		ibmc.setOutstandingshares(500000000);
		ibmc.setSector("Technology");
		ibmc.setType("Public");
		
		Security ibm = new Security();
		ibm.setCusip("459200101");
		ibm.setIsin("4592001014");
		ibm.setPrice(250);
		ibm.setSector("Technology");
		ibm.setTicker("IBM");
		ibm.setCompany(ibmc);
		
		
		Company abmc = new Company();
		abmc.setName("American Business Machines");
	abmc.setCountryCode("US");
		abmc.setNumberEmp(5000);
		abmc.setOutstandingshares(500000000);
		abmc.setSector("Technology");
		abmc.setType("Public");

		
		Security abm = new Security();
		abm.setCusip("4592001013");
		abm.setIsin("4592001013");
		abm.setPrice(250);
		abm.setSector("Technology");
		abm.setTicker("ABM");

		abm.setCompany(abmc);
		
		
		Company bbmc = new Company();
		bbmc.setName("British Business Machines");
		bbmc.setCountryCode("US");
		bbmc.setNumberEmp(5000);
		bbmc.setOutstandingshares(500000000);
		bbmc.setSector("Technology");
		bbmc.setType("Public");
		
		Security bbm = new Security();
		bbm.setCusip("4592001012");
		bbm.setIsin("45920010142");
		bbm.setPrice(250);
		bbm.setSector("Technology");
		bbm.setTicker("BBM");
		bbm.setCompany(bbmc);
		
		Security teslac = new Security();
		teslac.setCusip("0982409834919");
		teslac.setIsin("123456789");
		teslac.setPrice(30000);
		teslac.setSector("Technology");
		teslac.setTicker("TSLA");
		
		Security msftc = new Security();
		msftc.setCusip("0982409834919");
		msftc.setIsin("123456789");
		msftc.setPrice(30000);
		msftc.setSector("Technology");
		msftc.setTicker("MSFT");

		h1.setStock(ibm);
		h1.setNumberofshares(1000000);

		h2.setStock(abm);
		h2.setNumberofshares(10000000);

		h3.setStock(bbm);
		h3.setNumberofshares(100000);
		
		h4.setStock(teslac);
		h4.setNumberofshares(10000);
		
		h5.setStock(msftc);
		h5.setNumberofshares(456789);

		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);

		rishvik.addHolding(h1);
		rishvik.addHolding(h2);
		rishvik.addHolding(h3);
		rishvik.addHolding(h4);
		rishvik.addHolding(h5);

		System.out.println("My final Portfolio" + rishvik);
		
		System.out.println(rishvik.getTotalMktValue());

	}

}
