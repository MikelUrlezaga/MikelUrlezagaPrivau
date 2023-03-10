public class Ariketa10{
   public static void main (String [] args){
   
      int a=1;
      
      for(int i=1; i<=7; i++)
      { 
         System.out.print(" *");
      }
       System.out.println("");
      
      for(int i=1; i<=5; i++)
      { 
         System.out.println(" * K A I X O *");
      }
      
      for(int i=1; i<=7; i++)
      { 
         System.out.print(" *");
      }
       System.out.println("");
       System.out.println("");
      
      int i=1;
      int z=1;
      
      for(i=1; i<=7; i++)
      { 
         System.out.print(" *");
      }
         
         System.out.println("");
       
      for( z=1; z<=5; z++)
      {  
         System.out.print(" *");
            for( i=1; i<=5; i++)
            {
         
               if (a==i)
               {
                  switch(z)
                  {
                  case 1:
                     System.out.print(" K");
                  break;
               
                  case 2:
                      System.out.print(" A");
                  break;
                  
                  case 3:
                     System.out.print(" I");
                  break;
                  
                  case 4:
                     System.out.print(" X");
                  break;
                  
                  case 5:
                     System.out.print(" O");
                  break;
                  default:
                  }
              }
               else
               {
               System.out.print("  ");
               }
                 a++;
                 System.out.println(" *");
             }
      }   
      System.out.println("");
      for( i=1; i<=7; i++)
      { 
       System.out.print(" *");
      }  
        
        
      for( i=1; i<=7; i++)
      { 
         System.out.print(" *");
      }
         System.out.println("");
         System.out.println("");
      
      i=1;
      z=1;
      a=5;
      
      for(i=1; i<=7; i++)
      { 
         System.out.print(" *");
      }
         
      System.out.println("");
       
      for( z=1; z<=5; z++)
      {  
         System.out.print(" *");
            for( i=1; i<=5; i++)
            {
         
               if (a==i)
               {
                  switch(z)
                  {
                  case 1:
                     System.out.print(" K");
                  break;
               
                  case 2:
                     System.out.print(" A");
                  break;
                  
                  case 3:
                     System.out.print(" I");
                  break;
                  
                  case 4:
                     System.out.print(" X");
                  break;
                  
                  case 5:
                     System.out.print(" O");
                  break;
                  default:
                  }
              }
            else
            {
               System.out.print("  ");
            }
               a--;
               System.out.println(" *");
            }
      } 
      System.out.print("");
      for( i=1; i<=7; i++)
      { 
       System.out.print(" *");
      }
       
  }
}   
