package Õ‚≤ø≈≈–Ú;

import java.io.*;

public class C {

	public static void main(String[] args) throws IOException{
		
			DataOutputStream output=new DataOutputStream(
			new BufferedOutputStream(new FileOutputStream("C:\\Users\\asus\\Desktop\\data.txt")));
	for(int i=0;i<8000;i++)
    {
	   output.writeInt((int)(Math.random()*100000));
    }
	output.close();
	DataInputStream input=new DataInputStream(new FileInputStream("C:\\Users\\asus\\Desktop\\data.txt"));
	for(int i=0;i<100;i++)
		System.out.print(input.readInt()+" ");
	input.close();
	}

}
