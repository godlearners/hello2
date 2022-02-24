package org.great.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import org.great.com.ReadUrlFile;
import org.great.com.WriteUrlFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br=ReadUrlFile.readUrl("D://test/num/num.txt");
		BufferedWriter bw =WriteUrlFile.writeUrl("D://test/num/result.txt");
		String temp="";
		try {
			while((temp=br.readLine())!=null)
			{
				if(temp.indexOf("Íò")>-1)
				{ 
					float followerNum=Float.valueOf(temp.replaceAll("Íò", ""));
					followerNum=followerNum*10000;
					int num=(int)followerNum;
					temp=String.valueOf(num);
				}
				else if(temp.indexOf("k")>-1)
				{ 
					float followerNum=Float.valueOf(temp.replaceAll("k", ""));
					followerNum=followerNum*1000;
					int num=(int)followerNum;
					temp=String.valueOf(num);
				}
				else if(temp.indexOf("m")>-1)
				{ 
					float followerNum=Float.valueOf(temp.replaceAll("m", ""));
					followerNum=followerNum*1000000;
					int num=(int)followerNum;
					temp=String.valueOf(num);
				}
				else if(temp.indexOf("Èf")>-1)
				{ 
					float followerNum=Float.valueOf(temp.replaceAll("Èf", ""));
					followerNum=followerNum*10000;
					int num=(int)followerNum;
					temp=String.valueOf(num);
				}
				bw.write(temp);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("success");

	}

}
