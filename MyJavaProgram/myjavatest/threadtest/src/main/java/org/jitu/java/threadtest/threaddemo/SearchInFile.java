package org.jitu.java.threadtest.threaddemo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;


public class SearchInFile {

	public static void main(String[] args) throws IOException {

		String pattern= "\"),";
		
		File file=new File("./ErrorCode");
		
		if(file.exists()) 
        { 
            List<Integer> lineNumbers=finder(file, pattern);
            System.out.println(lineNumbers);
        } 
	}
	
	public static List finder(File file,String pattern) throws IOException
	{
		List<Integer> lineNumber= new ArrayList<Integer>();
		BufferedReader br=new BufferedReader(new FileReader(file));
		int lineNo=1;
		String line;
		int found=1;
		System.out.println("Pattern="+pattern);
		File newFile = new File("filename.txt");
		FileWriter writer=new FileWriter(newFile);
		while((line=br.readLine())!=null)
		{
			if(line.contains(pattern))
			{
				System.out.println("line= "+line);
				line=line.replace(pattern, ",\""+found+"\"),");
				lineNumber.add(lineNo);
				found++;
			}
			System.out.println("Write= "+line);
			writer.write(line);
			writer.write("\n");
			lineNo++;
		}
		return lineNumber;
	}
}
