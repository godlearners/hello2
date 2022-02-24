package org.great.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class ReadUrlFile {
	public static BufferedReader bufferReader;
	public static InputStream inputStream;
	public static InputStreamReader isr;
    public static BufferedReader readUrl(String urlpath)
    {   
    	File urlFile=new File(urlpath);
    	try {
			inputStream=new FileInputStream(urlFile);
			 try {
				isr=new InputStreamReader(inputStream,"utf-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    bufferReader=new  BufferedReader(isr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
    	 return bufferReader;

    }
	
}
