package tx.copp.oak.balu.lroom;

import java.util.ArrayList;
import java.util.Iterator;

import tx.copp.oak.fin.Holding;

public class GTTest {

	public void doLoop() {

		String[] test = new String[4];
		test[0] = "Radon";
		test[1] = "Argon";
		test[2] = "Neon";
		test[3] = "Helium";

		System.out.println(test);

		for (String zztop : test) {
			System.out.println(zztop.toUpperCase());
		}

		// for (int i = 0; i < test.length; i++) {
		// System.out.println(test[i].toLowerCase());

		int k=0;
		while (true) {
			System.out.println("Enter your Password");

			java.util.Scanner scan = new java.util.Scanner(System.in);
			String pass = scan.nextLine();

			if (pass.equals("zztop")) {
				System.out.println("good job u got my diamonds");
				break;

			} else {
				System.out.println("retry or jail");

				k++;
				if(k == 5)
					break;
			}
		}
	}
	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person pablo = new Person();

		GTTest gtTest = new GTTest();
		gtTest.doLoop();

		pablo.setName("Pablo Exco");
		pablo.setAge(5);
		pablo.setSsn("121212");
		pablo.setAddress("111 Colombia");

		System.out.println(pablo);

		Holding nt = new Holding();

		Bat manbat = new Bat();
		manbat.setEyes(2);
		manbat.setInfo("Bat Rock they Fly");
		manbat.setLegs(2);
		manbat.setWings(2);

		System.err.println("=============");
		System.out.println(manbat);
		System.err.println("=============");

		Cat coolcat = new Cat();
		coolcat.setEyes(2);
		coolcat.setInfo("cats are cool");
		coolcat.setLegs(4);
		coolcat.setTail(1);

		System.err.println("=============");
		System.out.println(coolcat);
		System.err.println("=============");

		Rat fatrat = new Rat();
		fatrat.setCheese(47);
		fatrat.setEyes(2);
		fatrat.setInfo("rats are also cool");
		fatrat.setLegs(4);

		System.err.println("=============");
		System.out.println(fatrat);
		System.err.println("=============");

		ArrayList<Mammal> manRay = new ArrayList<Mammal>();
		manRay.add(manbat);
		manRay.add(coolcat);
		manRay.add(fatrat);

		System.err.println("==========");
		System.out.println("manBat");
		System.err.println("==========");

		for (Mammal mammal : manRay) {
			System.out.println(mammal.getEyes());
		}

	}

	@Override
	public String toString() {
		return "GTTest [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
