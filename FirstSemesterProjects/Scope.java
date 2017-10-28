// This program can't find its variable.

 public class Scope
 {
  public static void main(String[] args)
  {
     double[] array = {0, 1, 2.71, 3.14};
    
     System.out.print("The values of the array are: ");
    
     for (int i = 0; i < array.length; i++)
     
        System.out.println(array[i]);
     
     for (int i = 0; i < array.length; i++)
     {
  
        
        if (i < array.length - 1 ) {
           System.out.print(array[i] + ", ");}
        
        else 
           
           System.out.print(array[i]);
     }
        
        
    
     
     
     
  }
 }