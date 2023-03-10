public class Marrazkia
{
	public static void main (String [] args)
   {
   
   
   logo1();
	logo2();
	logo3();
	marra();
   System.out.println("");
	logo4();
	marra();
   System.out.println("");
	logo3();
     
   }
    public static void marra()
    {
      System.out.print("  ");
      for(int i=1; i<=5; i++)
      {
         System.out.print("*");
      }
      System.out.print("  ");   
    }
    
    public static void logo1()
    {
    
    int A = 1;
    int B = 7;
       
    for(int i=1; i<=4; i++)
    {
    
      System.out.print(" ");
      for(int z=1; z<=7; z++)
      {
      
         if(A <= z && B >= z)
         {
            System.out.print("*");
         }
         else
         {
            System.out.print(" ");
         }      
      }
      System.out.println("");
      A++;
      B--;
    }
    
    }
    
    public static void logo2()
    {
    
    int A = 5;
    int B = 3;
    
    for(int i=1; i<=3; i++)
    {
    
      System.out.print(" ");
      for(int z=1; z<=7; z++)
      {
      
         if(B <= z && A >= z)
         {
            System.out.print("*");
         }
         else
         {
            System.out.print(" ");
         }      
      }
      System.out.println("");
      A++;
      B--;
    }

    
    }
    
    public static void logo3()
    {
    
    for(int i=1; i<=7; i=i+2)
    {
      for(int z=7; z>=i; z=z-2)
      {
         System.out.print(" ");              
      }
      
      System.out.print("*");
      
      for(int z=1; z<= (i-2); z++)
      { 
         System.out.print(" ");
      }
         if(i==1)
         {
            System.out.println(""); 
         }
         else
         {
            System.out.println("*");
         }                 
    }

    
    }
    
    public static void logo4()
    {
    
       for(int i=1; i<=3; i++)
       {
          
          for(int z=1; z<=4; z++)
          {
          
             System.out.print(" ");
          
          }
          
       System.out.println("*");
       
       }
    
    }



}   
