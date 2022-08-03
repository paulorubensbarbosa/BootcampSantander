import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {

	public static void main(String[] args) {
		/*
		 * Autor = Hawking, Stephen - Livro = nome : Uma Breve páginas: 256 Autor =
		 * Duhigg, Charles - Livro = nome : O poder do Habito, páginas : 408 Autor =
		 * Harari, yuval - Livro = nome 21 lições, páginas : 432
		 */

		System.out.println("----------Exibir na ordem aleatória----------");
		Map<String, Livro> meusLivros = new HashMap<>() {
			{
				put("Hawking, Stephen", new Livro("Uma Breve", 256));
				put("Duhigg, Charles", new Livro("O poder do habito", 408));
				put("Harari, yuyal", new Livro("21 Lições", 432));

			}
		};

		// System.out.println(meusLivros);

		for (Map.Entry<String, Livro> entry : meusLivros.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}

		
		System.out.println("-----------Exibir os livros na ordem de inserção----------");
		Map<String, Livro> livrosOrdemInsercao = new LinkedHashMap<>() {
			{
				put("Hawking, Stephen", new Livro("Uma Breve", 256));
				put("Duhigg, Charles", new Livro("O poder do habito", 408));
				put("Harari, yuyal", new Livro("21 Lições", 432));
			}
		};
		
		for (Map.Entry<String, Livro> entry : livrosOrdemInsercao.entrySet() ) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}

		
		System.out.println("----------Ordem alfabética autores----------");
		Map<String, Livro> livrosOrdemAlfabeticaAutores = new TreeMap<>(livrosOrdemInsercao);
		for (Map.Entry<String, Livro> entry : livrosOrdemAlfabeticaAutores.entrySet() ) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}
		
		System.out.println("----------Orgem alfabética nome dos livros----------");
		Set<Map.Entry<String, Livro>> livrosOrdemAlfabeticaTitulo = new TreeSet<>(new ComparatorNome());
		livrosOrdemAlfabeticaTitulo.addAll(meusLivros.entrySet());
		for (Map.Entry<String, Livro> entry : livrosOrdemAlfabeticaTitulo ) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}
		
		
	}

}

class Livro {
	private String nome;
	private Integer paginas;

	public Livro(String nome, Integer paginas) {
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(paginas, other.paginas);
	}

	@Override
	public String toString() {
		return "Livro [nome= " + nome + ", paginas= " + paginas + "]";
	}

}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
		
		return l1.getValue().getNome().compareTo(l2.getValue().getNome());
	}
	
}