package test.com;
import java.io.*;
import java.util.*;


public class Issues {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> issuecsv = new ArrayList<String>();
		
		String csvfile= "C:\\Temp\\Issues.txt";
		String line = "";
		
								
		try {BufferedReader br= new BufferedReader(new FileReader(csvfile));
			while ((line=br.readLine())!=null ) {
				
				issuecsv.add(line);
			}
		}	
		catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		finally {
		}
		for (String iss : issuecsv) {
			System.out.println(iss);
		}
		}

	}

