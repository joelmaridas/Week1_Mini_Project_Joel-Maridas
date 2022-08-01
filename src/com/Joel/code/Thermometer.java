package com.Joel.code;

import java.util.Arrays;

public class Thermometer {
	private int degreeF;
	private int degreeC;
	private String name;
	private int []tempreadings=new int[3];
	
	public Thermometer() {
		super();
	}
	
	public Thermometer(int degreeF,int degreeC,String name, int[]tempreadings){
	this.degreeF=degreeF;
	this.degreeC=degreeC;
	this.name=name;
	this.tempreadings=tempreadings;
	}
	public int getDegreeF() {
		return degreeF;
	}
	public void setDegreeF(int degreeF) {
		this.degreeF = degreeF;
	}
	public int getDegreeC() {
		return degreeC;
	}
	public void setDegreeC(int degreeC) {
		this.degreeC = degreeC;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getTempreadings() {
		return tempreadings;
	}
	public void setTempreadings(int[] tempreadings) {
		this.tempreadings = tempreadings;
	}
	
	@Override
	public String toString() {
		return "Thermometer [degreeF=" + degreeF + ", degreeC=" + degreeC + ", name=" + name + ", tempreadings="
				+ Arrays.toString(tempreadings) + "]";
	}

	public static int convertToFahrenheit(int c) {
	double	f = (c * 1.8) + 32;
	return (int) f;
		
	}
	public static int convertToCelsius(int f) {
	double	 c =(( 5 *(f - 32.0)) / 9.0);
	return (int)c;	
	}
	public static double calculateAvgTemp(int[] temps){
		int val=0;
		for (double num: temps) {
	           val += num;
	        }

	        double average = val / temps.length;
	        System.out.println(average);
			return average;
		
	}
	

}
