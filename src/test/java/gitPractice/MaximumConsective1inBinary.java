package gitPractice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximumConsective1inBinary {
	public static void main(String[] args) throws IOException {
	       Scanner scan=new Scanner(System.in);
	        List<Integer> list = new ArrayList<Integer>();
	        int n = scan.nextInt();
	        int rem=0;
	        while(n>0)
	        {
	            rem=n%2;
	            n=n/2;
	            System.out.println(rem);
	            list.add(rem);
	        }
	        Collections.reverse(list);
	        System.out.println(list); 
	        int max=0;
	        int count=0;
	        for (Integer integer : list)
	        {
	        	Integer ch = integer;
	        	
				if(ch==1)
				{
					count++;
					if(count>max)
					{  
						max=count;
					}
					continue;
				}
				else
				{
					count=0;
					continue;
				}
				
			}
	        System.out.println(max);
	        
	        
	        
	        scan.close();
	    }

}
