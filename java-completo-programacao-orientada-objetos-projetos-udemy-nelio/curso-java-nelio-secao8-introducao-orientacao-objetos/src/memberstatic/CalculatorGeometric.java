package memberstatic;

public class CalculatorGeometric {
	public static final double PI_VALUE = 3.14159;

	public static double calculeCircumference(double radius) {
		return 2.0 * PI_VALUE * radius;
	}

	public static double calculeVolumeSphere(double radius) {
		return 4.0 * PI_VALUE * Math.pow(radius, 3) / 3;
	}

}
