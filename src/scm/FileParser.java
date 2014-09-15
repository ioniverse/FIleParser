package scm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class FileParser {

	InputStream fis;
	InputStreamReader isr;
	BufferedReader br;
	String line=null;
	public void parse(File file, ContentHandler handler)
	{
		try {
			fis= new FileInputStream(file);
			isr= new InputStreamReader(fis);
			br= new BufferedReader(isr);
			
			while ((line=br.readLine())!=null)
				{
					handler.defaultLine(line);
					if(line.charAt(0)=='#')
					handler.commentLine(line);
				}
			br.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
