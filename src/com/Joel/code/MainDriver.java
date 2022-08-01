package com.Joel.code;
import java.util.Scanner;
public class MainDriver {
	public static void main(String [] args) {
		Scanner name=new Scanner(System.in);
		System.out.println("Please name your Thermometer");
		String thermo_name=name.nextLine();
		
		System.out.println("Hi, user thank you for using " + thermo_name + " Today!");
		
		System.out.println("Please enter the farheniet value");
		int Far=name.nextInt();
		Thermometer thermometer = new Thermometer();
		thermometer.setDegreeF(Far);
		
		System.out.println("Please enter the Celsius value");
		int Cel=name.nextInt();
		thermometer.setDegreeC(Cel);
		
		int far= Thermometer.convertToFahrenheit(Cel);
		
		int cel=Thermometer.convertToCelsius(Far);
		
		System.out.println("The converted value from Celsius to Farheniet is "+ far);
		
		System.out.println("The converted value from Farheniet to Celsius is " + cel);
        
		int arr[]=new int[3];
		System.out.println("Please enter three recent temperture readings");
		for (int i=0;i<3;i++)
		{
			arr[i]=name.nextInt();
		}
		 Thermometer.calculateAvgTemp(arr);
		 System.out.println("Good bye I am closing now");
		
	}
	

}
