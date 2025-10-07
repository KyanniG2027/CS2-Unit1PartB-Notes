/**
 * @author Kyanni G
 * @since 3 Oct 2025
 * @version 1.0
 * Notes for topics 1.8-1
 */
public class Main {
   /**
    * main METHOD is the entry point of the program
    *@param INPUT is an array of Strings
    @return void means NO OUTPUT 
    */

   public static void main(String []args) {
      System.out.println("Math Class Methods");
      
      // Absolute Value .abs() method
      // Methods with a RETURN VALUE (non-void)
      //mean you need to "to something" with that output 
      Math.abs(-41); //works but cant see results
      //  You could store the result in a variable
      int absValue = Math.abs(-35);
      System.out.println(absValue);  
     
      //OR you can display it directly 
      System.out.println(Math.abs(-388.55));
      
      //.abs() is an OVERLOADED method
      //meaning there are multiple versions of the same method, 
      //with the same name but diffrent, parameters
      double absValueDoub = Math.abs(-79.73);
      System.out.println(absValueDoub);

      // Math.pow() takes two arguments 
      // and raises the first arg to the power of the second
      double threeSquared = Math.pow(3, 2); 
      System.out.println(threeSquared);

      //Math.sqrt() takes one argument 
      //returns the square root
      double root99 = Math.sqrt(99); 
      System.out.println(root99);

      //Math.random() returns a double
      // between [0.0, 1.0] --> 1.0 is not included
      double randNum = Math.random(); 
      System.out.println(randNum);

      // If you want to generate a number in a diffrent 
      // range, you just adjust the output of Math.random()
      //EX: Random num between 0-100
      double randNum2 = Math.random() * 100 ;
      System.out.println(randNum2); 
      //To adjust the starting point, ADD! 
      double randNum3 = Math.random() +1;
      System.out.println(randNum3);

      // GENERAL FORMAT:
      //(int) (math.random() * max) +min
      int randInt = (int) (Math.random() * 20) + 10; 
      System.out.println(randInt);

   }


}
