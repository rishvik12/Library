package tx.copp.oak.balu.lroom;

public class Functiontest {

	
	public int addNum(int num1, int num2)	{
		
		System.out.println("Adding Numbers " + num1 + "and" + num2);
		int temp = 0;
		temp = num1 + num2;
		
		return temp;
		
		}
		
	
	public int multNum(int num1, int num2)	{
		
		System.out.println("Adding Numbers " + num1 + "and" + num2);
		int temp = 0;
		
		
		temp = num1 * num2;
		return temp;

	}
	
public float divNum(int num1, int num2)	{
		
		System.out.println("Adding Numbers " + num1 + "and" + num2);
		float temp = 0;
		
		
		temp = (float)num1 / num2;
		return temp;

	}

	
	 public static void main(String[] args) {
				Functiontest fnc = new Functiontest();
						int temp = fnc.addNum(12, 12);
				System.out.println("Oh God Balu sucks " + temp );
				
						 temp = fnc.multNum(12, 12);
					System.out.println("Oh God Balu sucks" + temp);
					
						
	 }	
						
						
}
