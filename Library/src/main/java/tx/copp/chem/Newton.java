package tx.copp.chem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Newton {

	private HashMap<String, Element> chemMap = new HashMap<String, Element>();

	public void loadElements() {
		Element oxygen = new Element();
		oxygen.setName("Oxygen");
		oxygen.setAtomicNumber(8);
		oxygen.setAtmoicMass(16);
		oxygen.setSymbol("O");

		Element hyd = new Element();
		hyd.setName("Hydrogen");
		hyd.setAtomicNumber(1);
		hyd.setAtmoicMass(2);
		hyd.setSymbol("H");

		Element gld = new Element();
		gld.setName("Gold");
		gld.setAtomicNumber(79);
		gld.setAtmoicMass(196);
		gld.setSymbol("Au");

		Element ur = new Element();
		ur.setName("Uraniam");
		ur.setAtomicNumber(92);
		ur.setAtmoicMass(238);
		ur.setSymbol("U");

		Element ra = new Element();
		ra.setName("Radium");
		ra.setAtomicNumber(88);
		ra.setAtmoicMass(226);
		ra.setSymbol("Ra");

		Element th = new Element();
		th.setName("Thorium");
		th.setAtomicNumber(90);
		th.setAtmoicMass(232);
		th.setSymbol("Th");

		chemMap.put(oxygen.getSymbol(), oxygen);
		chemMap.put(hyd.getSymbol(), hyd);
		chemMap.put(gld.getSymbol(), gld);
		chemMap.put(ur.getSymbol(), ur);
		chemMap.put(ra.getSymbol(), ra);
		chemMap.put(th.getSymbol(), th);

	}

	public void writeFile(String name)	{
		
		
	}
	
	
	
	
	
	
	
	
	
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
			scan.close();

		} } catch (FileNotFoundException e) {
		    e.printStackTrace(); 
		}
			
		}
	public Element search(String key) {
		return chemMap.get(key);

	}

	public HashMap<String, Element> getChemMap() {
		return chemMap;
	}

	public void display() {
		Set<String> keyList = chemMap.keySet();

		for (String symbol : keyList) {
			Element ele = chemMap.get(symbol);
			System.err.println(ele);
		}
		}
		
		public void delFile(String name)	{
			
			File chemF = new File(name);
			
			if(chemF.exists())	{
				System.err.println("trying to delete file....path:");
				System.err.println("Path: " + chemF.getParentFile());
				chemF.delete();
			}
				
			}

	

	public static void main(String[] args) {
		Newton n1 = new Newton();
		n1.loadFile();
		
		System.out.println("=============");
		
		System.out.println(n1.getChemMap().get("H"));
		
		n1.loadElements();
		
		
		// System.out.println(n1.getChemMap());

		n1.display();

		System.out.println(n1.search("Th"));
		
		n1.delFile("C:/jwork");
	}

	public void sayHello(Object object) {
		// TODO Auto-generated method stub
		
		
	}
}
