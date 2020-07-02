package ch03;

public class Exercise3_6 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		// float celcius = (Math.round(((float)5/9 * (fahrenheit-32))*100))/(float)100;
		float celcius = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;
		
		// 'C = 5/9 X (F -32)
		
		System.out.println("Fahrenheit: "+fahrenheit);
		System.out.println("Celcius:"+celcius);
	}
}
