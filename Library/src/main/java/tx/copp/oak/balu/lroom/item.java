package tx.copp.oak.balu.lroom;

import java.util.Scanner;

public class item {

	public static void main(String[] args) {
		
		int num = 20;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a Number: ");
		num = scanner.nextInt();
		
		if (num > 18) {
			System.out.println( num + " is greater than 18");
		} else if (num == 18) {
			System.out.println( num + " is a 18");
		} else if (num < 12 && num > 12) {
				System.out.println( num + " Lucky ");
		} else if (num < 12 && num > 6) {
					System.out.println( num + " is fun ");
		}else {
			System.out.println(num + "Bad selection");

		}
			
			while(num > 100)	{
				System.out.println( "I am sorry I screwed up " + num);
				num = num + 1;
				
				if(num == 100000)	{
					System.out.println("Finally Exiting" + num);
					System.exit(1);
				}
			}
			
	}

}