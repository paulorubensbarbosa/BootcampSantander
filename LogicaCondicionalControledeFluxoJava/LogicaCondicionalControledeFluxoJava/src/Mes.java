
public class Mes {
	public static void main(String[] args) {
		//Numero do mês
		int opcaoMes = 12;
		
		//Dia da semana
		getDia("DOMINGO");
		
		

		String Mes = getMes(opcaoMes);
		System.out.println(Mes);

		if (opcaoMes == 1 || opcaoMes == 7 || opcaoMes == 12) {
			System.out.println("Férias");
		}

	}

	public static String getMes(int numeroMes) {
		if (numeroMes == 1) {
			return "Janeiro";
		} else if (numeroMes == 2) {
			return "Fevereiro";
		} else if (numeroMes == 3) {
			return "Março";
		} else if (numeroMes == 4) {
			return "Abril";
		} else if (numeroMes == 5) {
			return "Maio";
		} else if (numeroMes == 6) {
			return "Junho";
		} else if (numeroMes == 7) {
			return "Julho";
		} else if (numeroMes == 8) {
			return "Agosto";
		} else if (numeroMes == 9) {
			return "Setembro";
		} else if (numeroMes == 10) {
			return "Outubro";
		} else if (numeroMes == 11) {
			return "Novembro";
		} else if (numeroMes == 12) {
			return "Dezembro";
		} else {
			return "Digite um númedo de 1 a 12";
		}

	}

	public static void getDia(String nomeDia) {

		switch (nomeDia) {
		case "DOMINGO":
			System.out.println(1);
			break;
		case "SEGUNDA":
			System.out.println(2);
			break;
		case "TERCA":
			System.out.println(3);;
			break;
		case "QUARTA":
			System.out.println(4);;
			break;
		case "QUINTA":
			System.out.println(5);;
			break;
		case "SEXTA":
			System.out.println(6);;
			break;
		case "SABADO":
			System.out.println(7);;
			break;
		default:
			break;

		}
	}

}
