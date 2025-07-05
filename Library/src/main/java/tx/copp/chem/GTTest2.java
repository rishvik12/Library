package tx.copp.chem;

import java.io.IOException;

public class GTTest2 {
	
	public static void main(String[] args)	{
		
		WriteElements rrr = new WriteElements();
		Newton n1 = new Newton();
		try	{
			n1.sayHello(null);
			System.out.println("writeinnow");
			rrr.writeChems("rishvik.txt");
		}	catch (IOException e)	{
			e.printStackTrace();
		
		}
	}

}
