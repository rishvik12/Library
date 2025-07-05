package tx.copp.oak.balu.lroom;

import java.util.HashMap;

public class LearnHash {

	
		HashMap<String, String> northHs = new HashMap<String, String>();
		
		
	public void addStudents () {
		northHs.put("001"," Arjun");
		northHs.put("002", "Varun");
		
		northHs.put("003"," a");
		northHs.put("004", "b");
		
		northHs.put("005","c");
		northHs.put("006", "d");
		
	}
	
		public static void main(String[] args)	{
			LearnHash nh1 = new LearnHash();
			nh1.addStudents();
			
			System.err.println(nh1.northHs);

	}

}
