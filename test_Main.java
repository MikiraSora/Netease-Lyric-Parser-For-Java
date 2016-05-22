import java.util.*;
import java.util.regex.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		
		try{
		FileInputStream file=new FileInputStream("/sdcard/4537875");
		byte[] buf=new byte[file.available()];
		Reader r=new InputStreamReader(file);
		CharSequence chars="";
		int c;//=(char)-1;
		while((c=r.read())!=-1)
		  chars+=String.valueOf((char)c);
		System.out.println(chars);
		file.close();
		
		Lrc_Parser lp=new Lrc_Parser(new Lrc_Parser_Option(),new Lrc_Parser_Expr());
		Lrc_Parser_Result res=lp.Decode(chars.toString(),null);
		System.out.println("test successfully.");
		System.out.println("Title : "+res.Title);
		System.out.println(("Artist : "+res.Artist));
		System.out.println("Lyric Length : "+res.Lyric.length());
		System.out.println(res.Lyric);
			
		}catch(Exception e){e.fillInStackTrace();System.out.println(e);}
		System.out.println("end");
		}
}
