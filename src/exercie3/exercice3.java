package exercie3;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class exercice3 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		String line;
		HashMap<String, String> hm = new HashMap<>();
		
		try
	      {
			reader = new BufferedReader(new FileReader("test.txt"));
	      }
	    catch(FileNotFoundException exc)
	      {
		System.out.println("Erreur d'ouverture");
	      }
	    while ((line = reader.readLine()) != null)
	    {
	    	System.out.println(line);
	    	for (String i : hm.keySet()) 
	    	{   
	    		System.out.println("adresse : " + i + " score : " + hm.get(i)); 
	    	}
	    }
	      
		/*
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader("test.txt")); 
		String line = reader.readLine();
		System.out.println(line);
		reader.close();
		*/
	}
	
	
}
