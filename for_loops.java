// Java program to illustrate 
// infinite loop 
public class Example1  
{ 
    public static void main(String[] args)  
    { 
        for( ; ; ) 
        { 
            System.out.println("This is an infinite loop"); 
        } 
    } 
  
}


// Java program to illustrate 
// Initializing multiple variables  
// in initialization block 
public class Example2  
{ 
  
    public static void main(String[] args)  
    { 
        int x = 2; 
        for(long y = 0, z = 4; x < 10 && y < 10; x++, y++)  
        { 
            System.out.println(y + " "); 
        } 
      
        System.out.println(x); 
    } 
}




// Java program to illustrate 
// redeclaring a variable 
// in initialization block 
public class Example3  
{ 
    public static void main(String[] args)  
    {     
        // x is integer 
        int x = 0; 
          
        // redeclaring x as long will not work 
        for(long y = 0, x = 1; x < 5; x++)  
        {  
            System.out.print(x + " "); 
        } 
          
    } 
} 


public class Example3  
{ 
    public static void main(String[] args)  
    {     
        // x is integer 
        int x = 0; 
        long y = 10; 
          
        for (y = 0, x = 1; x < 5; x++)  
        {  
            System.out.print(x + " "); 
        } 
          
    } 
}
