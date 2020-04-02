import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
                if(s.length() >400000)
                    return;
                
                if(s.length() == 0 || s == "")
                    System.out.println("0");
               
                String[] tokens = s.trim().split("[ .,?!'@_]+");

        System.out.println(tokens.length);

            for(int i=0;i<tokens.length;i++)
                System.out.println(tokens[i]);

        scan.close();
    }
}

