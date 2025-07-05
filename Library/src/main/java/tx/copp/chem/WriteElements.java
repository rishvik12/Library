package tx.copp.chem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteElements	{
	public void writeChems(String fileName) throws IOException	{
		
		Date currentDate = new Date();
		SimpleDateFormat spf = new SimpleDateFormat("yyyy_MMteElements")	{
			
		};
		System.err.println(spf.format(currentDate));
		
		String FileWriter = null;
		fileName = fileName + "_" +
		FileWriter; OutputStreamWriter ft = new FileWriter(fileName);
		
		ft.write("Darling plz cook me some murg mussalum and fisk tikka \n");
		ft.write("darling dont flippin forget guljamun and dil pickle \n");
		ft.write("Allah bless u \n");
		ft.close();
		
	}

}
