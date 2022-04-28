package gitPractice;

public class Index {
	
public static void main(String[] args) {
		
		String s = "testyantra";
		String odd="";
		String even="";
		for (int i = 0; i < s.length(); i++)
		{
			if(i%2==0)
			{
				even=even+s.charAt(i);
			}
			else if(i%2==1) 
			{
			    odd=odd+s.charAt(i);	
			}
			
		}
		
		System.out.println(even+" "+odd);
	}


}
