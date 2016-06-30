package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionJavaLoop {
	

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int a = scan.nextInt();
	        int i = 0;
	        while( i < a)
	            { 
	             
	            int b = scan.nextInt();
	            int c = scan.nextInt();
	            int d = scan.nextInt();
	            int prevAns = b;
	            for(int j = 0; j < d; j++)
	                {
	                int ans = 2^j*c; 
	                prevAns = prevAns + ans;
	                System.out.print(prevAns);
	                System.out.print(" ");  
	            } 
	            i++;
	            System.out.println("");
	        }
	        

	    }
	}
