/*
Write a static method named longestName 
that reads names typed by the user and prints the longest name (the name that contains the most characters) in the format shown below. 
Your method should accept a console Scanner and an integer N as parameters and should then prompt for N names.

The longest name should be printed with its first letter capitalized and all subsequent letters in lowercase, 
regardless of the capitalization the user used when typing in the name.
If there is a tie for longest between two or more names, use the tied name that was typed earliest.
but don't print a message unless the tie is between the longest names. assume that N is at least 1, 
that each name is at least 1 character long, and that the user will type single-word names consisting of only letters
*/


public static void longestName(Scanner input, int n)
{
   String name = "";
   boolean tie = false;
    
   for(int i = 1; i <= n; i++)
   {
       System.out.print("name #" + i + "? ");
       String name1 = input.next();
       
       if(name1.length() == name.length())
       {
           tie = true;
       }
       else if(name1.length()>name.length())
       {
           name = name1;
           tie = false;
       }
   }
   
    String capitalize = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    System.out.println(capitalize + "'s name is longest");
    
    if(tie == true)
    {
        System.out.println("(There was a tie!)");
    }
    
    
}
