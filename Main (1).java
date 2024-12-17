/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int[] arr = {1,2,3,4,5,2,1,9,11};
		Map<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
		    hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		}
		for(Map.Entry<Integer,Integer> e:hm.entrySet())
		{
		    if(e.getValue()>1)
		    {
		    System.out.println(e.getKey()+" "+e.getValue());
		    }
		}

 
	}
}
