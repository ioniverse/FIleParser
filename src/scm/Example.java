package scm;

import java.io.File;


public class Example {
	public static FileParser entree;
	static int compteur= 0;
	static int compteurC=0;


	public static void main(String[] args) 
	{
		
		
		File file= new File(args[1]);
		

		entree= new FileParser();
		entree.parse(file, new ContentHandler() {
			
			@Override
			public void defaultLine(String content) {
				compteur++;
				
			}

			@Override
			public void commentLine(String comment) {
				compteurC++;
				
			}
		});
		System.out.println("Le monfichier.txt contient "
		+compteur+" ligne(s) dont "
		+compteurC+" commentaire(s)");

	}

}
