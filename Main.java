package adder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner  input = new Scanner(System.in);
    	String sn = "\0";
    	int i = 0;
    	
    	while (i < 4)
    	{
    		sn = input.next();
    		args[i] = sn;
    		
    		i++;
    	}
    	
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide four integers to add");
        }
        
         if (i >= 4)
         {
        	 System.err.println("Please limit your inputs to four integer");
         }
         
         if ((sn == null) || (sn != "-"))
         {
        	 System.err.println ("Please enter a valid intger.");
         }
        		 
        input.close();
       }

    private static int addArguments(String[] args) {
       
	if (args[0] == "-");
	{
		Integer.valueOf(args[0]) = -1;
		return (Integer.valueOf(args[0]) * (Integer.valueOf(args[1]) +  Integer.valueOf(args[2]) + Integer.valueOf(args[3])));
	} 
	return Integer.valueOf(args[0]) + Integer.valueOf(args[1]) +  Integer.valueOf(args[2]) +  	Integer.valueOf(args[3]);
    }
}
