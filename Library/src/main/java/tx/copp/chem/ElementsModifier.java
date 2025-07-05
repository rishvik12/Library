package tx.copp.chem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ElementsModifier {

	private String name;

	public void modFile(String name) throws IOException {
	    File chemF = new File(name);
	    File newChemF = new File(name + ".bak");

	    if (chemF.exists()) {
	        System.err.println("File exists: " + chemF.getAbsolutePath());

	        Scanner scan = new Scanner(chemF);
	        FileWriter wrtt = new FileWriter(newChemF);

	        while (scan.hasNextLine()) {
	            String temp = scan.nextLine();
	            temp = temp.replace(",", "/");
	            wrtt.write(temp + System.lineSeparator());
	        }

	        scan.close();
	        wrtt.close();
	    } else {
	        System.err.println("File does not exist: " + chemF.getAbsolutePath());
	    }
	}
		

	public static void main(String[] args) {
		
		String fileName = "./chem.dat";
		
		ElementsModifier n1 = new ElementsModifier();
		try { 
			n1.modFile(fileName);
		}catch(IOException e) {
			e.printStackTrace();
		}

		HashMap<String, Element> chemMap = new HashMap<String, Element>();

		
		File chemF = new File(fileName);

		try {
			Scanner scan = new Scanner(chemF);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Scanner scan = new Scanner(chemF);

			while (scan.hasNextLine()) {
				String line = scan.nextLine();

				String[] elRay = line.split(",");

				Element temp = new Element();
				temp.setName(elRay[0]);
				chemMap.put(elRay[1], temp);

				System.err.println(temp.getName().toUpperCase());

			}

			scan.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
