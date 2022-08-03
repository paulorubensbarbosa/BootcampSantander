import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
	public static void main(String[] args) {
		System.out.println("Criar um dicionario de carros poulares: ");
		Map <String, Double> carrosPopulares = new HashMap<>() {{
			put ("gol", 14.4);
			put ("uno", 15.6);
			put ("mobi", 16.1 );
			put ("hb20", 14.5);
			put ("kwid", 15.6);
		}};
		
		System.out.println(carrosPopulares.toString());
		
		
		System.out.println("Substitua o consumo do gol por 15,2 km/l");
		carrosPopulares.put("gol", 15.2);
		
		System.out.println(carrosPopulares.toString());
		
		System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
		
		System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno") );
		
		System.out.println("Exiba os modelos: ");
		Set <String> modelos = carrosPopulares.keySet();
		System.out.println(modelos);
		
		System.out.println("Exiba os consumos dos carros: ");
		Collection<Double> consumos =  carrosPopulares.values();
		System.out.println(consumos);
		
		System.out.println("Exiba o modelo mais econômico e seu consumo: ");
		
		Double consumoMaisEconomico = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMaisEconomico = "";
		
		for (Map.Entry<String, Double> entry : entries) {
			if(entry.getValue().equals(consumoMaisEconomico)) {
				modeloMaisEconomico = entry.getKey();
				System.out.println("Modelo mais economico: " + modeloMaisEconomico + " - " + consumoMaisEconomico);
			}
		}
		
		System.out.println("Exiba o modelo menos econômico: ");
		Double consumoMenosEconomico = Collections.min(carrosPopulares.values());
		
		String modeloMenosEconomico = "";
		
		for (Map.Entry<String, Double> entry : entries) {
			if(entry.getValue().equals(consumoMenosEconomico)) {
				modeloMenosEconomico = entry.getKey();
				System.out.println("Modelo menos economico: " + modeloMenosEconomico + " - " + consumoMenosEconomico);
			}
		}
		
		System.out.println("Exiba a soma dos Consumos: ");
		Double somaConsumo = 0d;
		for (Map.Entry<String, Double> entry : entries) {
			somaConsumo += entry.getValue();
		}
		System.out.println(somaConsumo);
		
		System.out.println("Exiba a média dos consumos: " + somaConsumo / carrosPopulares.size());
		
		
		
		System.out.println("Remova os modelos com o sonsumo igual a 15,6 km/l: ");
		
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		while(iterator.hasNext()) {
			if(iterator.next().equals(15.6)) {
				iterator.remove();
			}
		}
		System.out.println(carrosPopulares);
		
		System.out.println("Exibir na ordem em que foram adicionados: ");
		Map <String, Double> carrosPopularesOrdenados = new LinkedHashMap<>() {{
			put ("gol", 14.4);
			put ("uno", 15.6);
			put ("mobi", 16.1 );
			put ("hb20", 14.5);
			put ("kwid", 15.6);
		}};
		
		System.out.println(carrosPopularesOrdenados.toString());
		
		System.out.println("Exiba na ordem das chaves: ");
		Map <String, Double> carrosPopularesOrdemModelo = new TreeMap<>(carrosPopulares);
		
		System.out.println(carrosPopularesOrdemModelo.toString());
		
		System.out.println("Apague o dicionario de carros: ");
		carrosPopulares.clear();
		System.out.println(carrosPopulares);
		
		System.out.println("Verificar se a lista está vazia: " + carrosPopulares.isEmpty());
		
	}
}
