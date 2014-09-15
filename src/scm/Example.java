package scm;

import java.io.File;


public class Example {
	public static FileParser entree;
	static int compteur= 0;

	public class Compteur implements ContentHandler
	{
		public int compteur;
		
		public Compteur()
		{
			compteur=0;
		}
		@Override
		public void defaultLine(String content) {
			
			this.compteur++;
		}
		
		
	}

	public static void main(String[] args) 
	{
		
		
		File file= new File(args[1]);
		

		entree= new FileParser();
		entree.parse(file, new ContentHandler() {
			
			@Override
			public void defaultLine(String content) {
				compteur++;
				
			}
		});
		System.out.println("Le monfichier.txt contient "+compteur+" ligne(s)");

	}

}
