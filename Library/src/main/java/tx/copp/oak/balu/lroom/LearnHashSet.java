package tx.copp.oak.balu.lroom;

import java.util.ArrayList;
import java.util.HashSet;

public class LearnHashSet {

	
		HashSet<String> northHs = new HashSet<String>();
		
	ArrayList<String> northArray = new ArrayList<String>();
	
	
	public HashSet<String> getNorthHs() {
		return northHs;
	}

	public ArrayList<String> getNorthArray() {
		return northArray;
	}

	public void addStudents () {
		northHs.add(" Arjun");
		northHs.add( "Varun");
		northHs.add(" a");
		northHs.add( "b");
		northHs.add("c");
		northHs.add( "d");
		
		for (int i = 0; i < 20; i++) {
			northHs.add("Arjun");
		}
		northArray.add(" Arjun");
		northArray.add( "Varun");
		northArray.add(" a");
		northArray.add( "b");
		northArray.add("c");
		northArray.add( "d");
	}
	
		public static void main(String[] args)	{
			LearnHashSet nh1 = new LearnHashSet();
			nh1.addStudents();
			
			System.out.println("=================");
			System.out.println(nh1.getNorthArray());
			System.out.println("=================");

			System.out.println("=================");
			System.out.println(nh1.getNorthHs());
			System.out.println("=================");

			
			System.err.println(nh1.northHs);

	}

		private void northArray() {
			// TODO Auto-generated method stub
			
		}

}
