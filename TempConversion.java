import java.util.Scanner;
public class TempConversion {
	public static void main (String[]args){
		int number;
		double temp;
		double temp1;
		double change;
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Farenheit to Celcius");
		System.out.println("2. Celcius to Farenheit");
		System.out.println("3. To exit");
		number = input.nextInt();
		
		if(number ==1){
			System.out.print("Choice: "+number+"\n"+"input your temp:");
			temp=input.nextInt();
			change=Celsius(temp);
			System.out.print(temp+" degrees F = "+change+" degrees C");			
		}
		else if (number==2){
			System.out.print("Choice: "+number+"\n"+"input your temp:");
			temp1=input.nextInt();
			change=Farenheit(temp1);
			System.out.print(temp1+" degrees c = "+change+" degrees f");
		}
		else if (number==3){
			System.out.print("Program over");
		}
		else{
			System.out.print("Invalid entry");
		}
	}
		public static double Celsius(double farenheit){
			double celsius;
			celsius = 5.0/9.0*(farenheit-32);
			return celsius;
		}
		public static double Farenheit(double celsius1){
			double farenheit; 
			farenheit=9.0/5.0*celsius1+32;
			return farenheit;
		}
	}


