package controller;

public class CalculateBMI {

	//Enter the code here....
	public static double calculate(double height, double weight){
		return (height/weight);
	}
	public static String description(double value){
		if(value < 18.5){
			return "Under Weight";
		}
		else if(value >= 18.5 && value < 24.9){
			return "Normal";
		}
		else if(value >= 25 && value < 29.9){
			return "Over Weight";
		}
		else if(value >= 30 && value < 34.9){
			return "Obese";
		}
		else{
			return "Extremely Obese";
		}
	}
}
