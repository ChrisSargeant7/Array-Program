/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.program;

import java.util.Scanner;
import java.util.Arrays;


/**
 *
 * @author Christopher Sargeant
 */
public class ArrayProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter 5 numbers for this Array");
        Scanner input = new Scanner (System.in); // this is the scanner that is used for this program
        System.out.println("Please enter your first number: ");
        float num1 = input.nextFloat(); // from here to float num5 are the numbers that the user will input, from there they will be added to the array.
        System.out.println("Please enter your second number: ");
        float num2 = input.nextFloat();
        System.out.println("Please enter your third number: ");
        float num3 = input.nextFloat();
        System.out.println("Please enter your fourth number: ");
        float num4 = input.nextFloat();
        System.out.println("Please enter your fifth number: ");
        float num5 = input.nextFloat();
        
        float [] ArrayList = {num1, num2, num3, num4, num5}; // this is the array, this contains all the numbers that the user inputted
        
        System.out.println("");
        
        System.out.println("#-------------------------------------------------------------------------------------------------------------------------------------------------------#");
        
        System.out.println("Your Array Before the sorting process: " + Arrays.toString(ArrayList)); // this is where the array is shown in the order that the user inputted it.
         
        float sum = 0; // this is the algorithm I used in order to figure out the sum of the ArrayList
        for(float i : ArrayList){
            sum +=i;       

        }
        float mean = sum/ArrayList.length; // This is the mean that is required to be figured out, This simply uses the sum formula and goes from there to make the mean by dividing it by the array length.
             
        System.out.println("This is your Array after the sorting process " + Arrays.toString(BubbleSort(ArrayList))); // this is the ArrayList after all the numbers in it have been sorted, they will be displayed in order from the lowest to the highest
        
        System.out.println("#-------------------------------------------------------------------------------------------------------------------------------------------------------#");
        
        System.out.println("Max-           " );
        MaxArray(ArrayList); // This is the Method I used to get the max value it will be brought up later in the code
        System.out.println();
        System.out.println("Min-           "  );
        MinArray(ArrayList); // This is the method used to find the minimum value it will also brought up later in the code
        System.out.println();
        System.out.println("Sum-           ");
        System.out.println(sum); // this is the printing of the Sum variable
        System.out.println();
        System.out.println("Mean-          ");
        System.out.println(mean); // this is the printing of the Mean variable
        System.out.println();
        System.out.println("Variance-      " );
        MyVariance(ArrayList); // this the method I used to make variance, It will be brought up later in the code
        System.out.println();
        System.out.println("Standard Deviation-         " );
        SDArray(ArrayList); // this is the final method which was used to make standard deviation
        
        System.out.println("#-------------------------------------------------------------------------------------------------------------------------------------------------------#");
    }
    public static float[] BubbleSort( float [] ArrayList ){ // This is the method I used to sort the ArrayList
    int j;
    boolean flag = true;
    float temp;
        while (flag){
            flag = false;
            for (j=0; j < ArrayList.length-1; j++)
            { 
               if (ArrayList[j]> ArrayList[j+1]) 
               {
                   temp = ArrayList[j];
                   ArrayList[j] = ArrayList[j+1];
                   ArrayList[j+1] = temp;
                   flag = true;
               }}}
        return ArrayList;} // this what the program returns at the end once the program has sorted all the numbers
     
    public static void MyVariance (float [] ArrayList) {  // this is the method that I used to make Variance
        
         float sum = 0; // in order to find it I needed the sum, since this method does not share variables with the main method I made sum in it
        for(float i : ArrayList){
            sum +=i;       

        }
        float mean = sum/ArrayList.length; // from there I did a similar thing with the mean
             
        float variance = 0; // this is what I used to make the variane
        for(float y : ArrayList)
            variance += (mean-y)*(mean-y);
        float variance2 = variance/ArrayList.length; // At the end we took the number that is in variance and divided it by the length of the array in order to make the true cariance
        
        System.out.println(variance2); // this is the result of the method
    
}
    public static void MaxArray (float [] ArrayList){ // this is the method I used to find the max value
        
    float max = ArrayList[BubbleSort(ArrayList).length-1]; // as this is simply finding the max value all I did was look through the array list and find the last number as it will be the largest after sorting

        
        System.out.println(max);   // this is the printing of the result of the program
        
    }
    
    public static void MinArray (float [] ArrayList){ // this is the method to find the minimum value
                float min = ArrayList[0]; // as this is simply finding the smallest value in the array it was simply making the value the variable will print the first value in the list

                System.out.println(min); // this is the printing of the result
        
    }

   
   
   public static void SDArray (float [] ArrayList){ // this is my final method which I used in order to make Standard deviation 
       
      float sum = 0; // much of the method follows the same rules as the variance method
        for(float i : ArrayList){
            sum +=i;       

        }
        float mean = sum/ArrayList.length;
             
        float variance = 0;
        for(float y : ArrayList)
            variance += (mean-y)*(mean-y);
        float variance2 = variance/ArrayList.length;
        
       float standarddeviation = (float) Math.sqrt(variance2); // in order to find the standard deviation all you must do is square root the variance, with that in mind math.sqrt does that which make it the perfect candidate for the task

       System.out.println(standarddeviation); // this is the priting of the result
       
   }
}