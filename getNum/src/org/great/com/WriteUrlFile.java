package org.great.com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class WriteUrlFile {
	
	public static BufferedWriter bufferWriteUrl;
	public static OutputStream opt;
	public static OutputStreamWriter osw;
	public static BufferedWriter writeUrl(String savePath)
	{
		File file=new File(savePath);
		try {
		  opt=new FileOutputStream(file,true);
		  try {
			//osw=new OutputStreamWriter(opt,"unicode");
			  osw=new OutputStreamWriter(opt,"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  bufferWriteUrl=new BufferedWriter(osw);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bufferWriteUrl;
	}


}
