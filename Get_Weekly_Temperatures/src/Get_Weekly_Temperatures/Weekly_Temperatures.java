/*
 This Java application will store data in the form of daily average temperatures for one week.
  Store the day and average temperature in two different array-lists. Your program should prompt 
  the user for the day of the week (Monday through Sunday) and display both the day and temperature 
  for each day. if "week" is entered, the output for your program should provide the temperature for 
  each day and the weekly average
  
  Author: Sam G. Nissan
  Date  : 09/09/2024
  
  Revision: V1
  
 */


package Get_Weekly_Temperatures;

import java.util.Scanner;

public class Weekly_Temperatures {
	
	public static void main(String [] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num;                                       //variable for number of days
		int i;                                        // variable for FOR-LOOPS initial point, update condition
		double ave = 0;                              // variable for average calculation.
		double total = 0;                           // This variable will be needed to calculate the average temperature. 
		
		//Optional not required
		double max = 0;                            //a variable to store the maximum temperature during week
		double min = 1000;                        //a variable  to store the minimum temperature during week
		
		System.out.println("This application will store the average temperature data in the form"
				+ " of daily average temperatures for one week.");
		
		System.out.println(" ");                    // White space
		System.out.print(" Type the number of days the average temerature data is needed to \r\n "
			+"be calculated. Type '7' for full week or any number betweek 1 to 7: ");
		num = input.nextInt();
		
		String[] weekDay = new String[num];                   //Declaring Array to store the week days
		double[] aveTemp = new double[num];                  // Declaring Array to store the daily average temperature 
		
		System.out.println(" ");                            //White space 
		
		for(i = 0; i < weekDay.length; ++i ) {
			System.out.print((i+1) + "-Enter the week day name: ");
			weekDay[i] = input.next();                                         //This line to store the entered week days in the weekDay array 
			
			System.out.print( "  Enter the average temprature in Fehrenheit for " + weekDay[i] + ":");	
			aveTemp[i] = input.nextDouble();                                   //This line to store the entered average in the aveTemp array 
			
			System.out.println("------------------------------------------------------------------------");
			
			total = total + aveTemp[i];                                       // totaling all average temperatures entered in the aveTemp array 
			
			ave = total/num;                                                 // calculating the average entered temperature days
			
			/************************************************OPTIONAL LINES*********************************************************/
			if(max < aveTemp[i]) {			
				max = aveTemp[i];		
			}//End of IF for Maximum Temperature
			
			if(min > aveTemp[i]) {			
				min = aveTemp[i];		
			}//End of IF for Minimum Temperature 
			
			/**********************************************************************************************************************/
			                                           
		} //End of first FOR-LOOP
		
		
		
		
		
		System.out.println(" ");                  //This line as a space to separate between the days.
		System.out.println("All required data related to weekly days and average temprature entered.");
		System.out.println("------------------------------------------------------------------------");
		
		for(i = 0; i < weekDay.length; ++i ) {
			
		     System.out.println("");
		     System.out.println((i+1) +"- On " + weekDay[i] + " the average temprature was: " + String.format("%.2f", aveTemp[i]) + ".");	     	     	
		} //The End of the second FOR-LOOP
		
		
		
		
		
		System.out.println("------------------------------------------------------------------------");		
		System.out.println("The average temperature for all entered week days is: " + String.format("%.2f", ave));
		
		//The lines below are optional not required by the home-work
		System.out.println();
		System.out.println("The maximum temperature in the  week days was: " + String.format("%.2f", max));
		System.out.println("The minimum temperature in the  week days was: " + String.format("%.2f", min));
		
	} //End of main method 	

} // End of Class
