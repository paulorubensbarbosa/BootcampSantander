import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.plaf.FontUIResource;

public class ExemploOrdenacaoSet {

	public static void main(String[] args) {

		Set<Serie> minhasSeries = new HashSet<>() {{			
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comédia", 25));
		}};
		
		System.out.println("<-- ORDEM ALEATÓRIA -->");
		for (Serie serie : minhasSeries) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
	
		Set<Serie> minhasSeries2 = new LinkedHashSet<>() {{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comédia", 25));
		}};
		
		System.out.println("<-- ORDEM DE INSERÇÃO  -->");
		for (Serie serie : minhasSeries2) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
		
		System.out.println("<-- ORDEM NATURAL PELA DURAÇÃO -->");
		Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);
		for (Serie serie : minhasSeries3) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
		
		System.out.println("<-- ORGEM NOME/GÊNERO/TEMPOEPISODIO -->");
		Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGenTempo());
			minhasSeries4.addAll(minhasSeries);
		for (Serie serie : minhasSeries4) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
	}
	
}

class Serie implements Comparable<Serie> {
	private String nome;
	private String genero;
	private Integer tempoEpisodio;

	public Serie(String nome, String genero, Integer tempoEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}

	public void setTempoEpisodio(Integer tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}

	@Override
	public String toString() {
		return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}

	@Override
	public int compareTo(Serie s) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), s.getTempoEpisodio());
		if (tempoEpisodio != 0 ) {
			return tempoEpisodio;
		}
		
		return this.getGenero().compareToIgnoreCase(s.getGenero());
		
	}

}

class ComparatorNomeGenTempo implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if(nome != 0) {
			return nome;
		}
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if(genero != 0) {
			return genero;
		}
		return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
	}
	
}



