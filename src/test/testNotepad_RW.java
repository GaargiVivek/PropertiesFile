package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testNotepad_RW {

	public static void main(String[] args) throws IOException 
	{
		/*
		//create a file
		File file = new File("E:\\Notepad_RW\\test.txt");
		file.createNewFile();
		
		//write in a file
		FileWriter fw = new FileWriter("E:\\Notepad_RW\\test.txt");
		BufferedWriter fileWrite = new BufferedWriter(fw);
		
		fileWrite.write("My first Notepad write");
		fileWrite.newLine();
		fileWrite.write("This is my second line");
		fileWrite.flush();
		*/
		
		//read a file
		FileReader fr = new FileReader("E:\\Notepad_RW\\test.txt");
		BufferedReader fileRead = new BufferedReader(fr);
		//System.out.println(fileRead.readLine());
		//System.out.println(fileRead.readLine());
		//String t = fileRead.readLine();
		String i = "";
		while((i = fileRead.readLine())!= null)
		{
			System.out.println(i);
		}
		
		
		
	}
}
