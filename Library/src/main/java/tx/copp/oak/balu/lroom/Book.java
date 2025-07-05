package tx.copp.oak.balu.lroom;

public class Book {	
	
	// my first class === single line comment
	
	/*p
	 * m === multi-line comment
	 */
	
	public static void main(String[] args) {
		
		String book = " Harry Not a Potter Balu has no daughter";
		int index1 = book.indexOf("Balu");
		
		System.out.println("Index is: " + index1);
		
		System.out.println("ZZtop: " + book.substring(index1, index1+4));
		System.out.println("Substring: " + book.substring(5));
		
		int count =0;
		
		String firstName;
		String lastName;
		int age;
		age = 10;
		
		int num = 0;
		int x = 5, y = 6, z = 50, prod=0;
		
		
		prod = x * y * z;
		// i am doing multiplacation
		System.out.println(" Prod is " + prod);
		
		num = num * 5;
		
		book = book + " : " + book;
		
		System.out.println("librarian \n\n\n\n");
		System.out.println("yo \t\tlibrarian ");
		
		
		
		System.out.println(book.toUpperCase());
		System.out.println(" i got a book" + book);
		
		System.out.println(" Length " + book.length());
		
		System.out.println(num);

	}

}
