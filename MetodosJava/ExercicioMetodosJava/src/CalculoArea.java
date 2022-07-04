
public class CalculoArea {
	public static int CalcularArea(int a) {
		int resultado = a*a;
		return resultado;
	}
	
	public static double CalcularArea(double a, double b) {
		double resultado = (a * b)/2;
		return resultado;
	}

	public static double CalcularArea(double baseMenor, double baseMaior, double altura) {
		double resultado = (baseMenor*baseMaior)/altura;
		return resultado;
	}
	
	

}
