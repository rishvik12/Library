package tx.copp.oak.balu.lroom;

import java.util.Random;

public class Counter {

	public int addNum(int num1, int num2)	{
		
		System.out.println("Adding Numbers " + num1 + "and" + num2);
		int temp = 0;
		
		temp = num1 + num2;
		
		return temp;
	}
	
	public static void main(String[] args) {
		int counter = 5;
		Counter bk = new Counter();
		bk.addNum(15, 10);

		Random random = new Random();
		int numb = 0;
		
		while(counter > 0)	{
			numb = random.nextInt(10)+1;
			System.out.println("Rand: "+numb);
			//System.out.println("please wait" + counter);
			counter -- ;
			if (counter == 92) {
				System.out.println("sorry i am breaking" + counter);
				break;
			
				
			}
		}
		
		System.out.println("Kaboom");
	}


}
