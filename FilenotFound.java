package Preparation8;

import java.io.File;
import java.io.FileReader;

public class FilenotFound {
	public static void main(String[] args) {
		try {
			File f=new File("Documents");
			FileReader fr=new FileReader(f);
			int temp=0;
			while((temp=fr.read())!=-1) {
				System.out.println((char)temp);
				
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
