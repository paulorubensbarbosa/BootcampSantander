import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExemploStreamAPI {
	public static void main(String[] args) {
		List<String> numerosAletorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");		 
		
		System.out.println("Imprima todos os elementos dessa lista de String: ");
		numerosAletorios.stream().forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				
				
			}
			
		});
	}
}
