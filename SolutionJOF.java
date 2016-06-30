package HackerRank;

import java.util.Scanner;
import java.io.*;

public class SolutionJOF {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1 = sc.next();
                int x = sc.nextInt();
                int l = s1.length();
                int space = 15 - l;
                System.out.print(s1);
                for(int j = 0; j < space; j++)
                    {
                    System.out.print(" ");
                    }
                if(x > 99)
                    {
                    System.out.print(x);
                    }
                else if(x > 9)
                    {
                    System.out.print("0");
                    System.out.print(x);
                    }
                else if(x < 10)
                    {
                    System.out.print("00");
                    System.out.print(x);
                }
                    
                System.out.println("");
            }
            System.out.println("================================");

    }
}