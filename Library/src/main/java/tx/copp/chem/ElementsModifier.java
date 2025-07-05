package tx.copp.chem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ElementsModifier {

	private String name;
	
	private HashMap<String, Element> chemMap = new HashMap<String, Element>();
	

	public void loadFile() {

		String fileName = "./chem.dat";
		File chemF = new File(fileName);
		try {
			Scanner scan = new Scanner(chemF);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Scanner scan = new Scanner(chemF);

			while (scan.hasNextLine())	{
				String line = scan.nextLine();

				String[] elRay = line.split(",");

				Element temp = new Element();
				temp.setName(elRay[0]);
				temp.setSymbol(elRay[1]);
				temp.setAtomicNumber(Integer.parseInt(elRay[3]));
				temp.setAtmoicMass(Double.parseDouble(elRay[2]));

				chemMap.put(temp.getSymbol(), temp);

				System.err.println(elRay[0]);
				
				if (chemF.exists())	{
					System.err.println();
			}
			
		}
			scan.close();

			
		} catch (FileNotFoundException e) {
		    e.printStackTrace(); 
		}
			
		}
	
	public Element search(String key) {
		return chemMap.get(key);

	}

		
	public void modFile(String name) throws IOException {}
		

	public static void main(String[] args) {
		
		
			
		ElementsModifier n1 = new ElementsModifier();
		n1.loadFile();
				
		Scanner scn = null;
		scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("========Bro Enter Symbol========");
			String sym = scn.nextLine();
			
			
			System.out.println("==========");
			System.out.println(n1.search(sym));
			System.out.println("==========");
		
			
		}
		
		

	}


	
}
