import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exception1 {
	public static void main (String args[]) throws Exception
	{
		try(BufferedReader Br =new BufferedReader(new InputStreamReader(System.in) ))
		{
		String str="";
				str=Br.readLine();
	}
	}

}
