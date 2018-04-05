package edu.handong.csee.java.overload;

// TODO write javadoc later
public class Overload {

	public static void main(String[] args) {
		   
		double average1 = Overload.getAverage(1.5, 2.5);
		double average2 = Overload.getAverage(30, 20, 10);
		char average3 = Overload.getAverage('b', 'd');
		
		System.out.println(average1);
		System.out.println(average2);
		System.out.println(average3);
		
	}
	
	public static double getAverage(double first, double second) {
		return (first+second)/2;
	}
	
	public static double getAverage(int first, int second) {
		return (first+second)/2;
	}
	
	public static double getAverage(double first, double second, double third) {
		return (first+second+third)/3;
	}
	
	public static char getAverage(char first, char second) {
		return (char)(((int)first+(int)second)/2);
	}

}
