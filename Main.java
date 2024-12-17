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
		ArrayList<Integer> ar = new ArrayList<Integer>();
	    for(int i =0;i<arr.length;i++){
	        ar.add(arr[i]);
	    }	
	    for(int i =0;i<ar.size()/2;i++)
	    {
	        Collections.swap(ar,i,ar.size()-i-1);
	    }
	    for(int i = 0; i < ar.size(); i++) {   
    System.out.print(ar.get(i)+" ");
}  
	}
}
