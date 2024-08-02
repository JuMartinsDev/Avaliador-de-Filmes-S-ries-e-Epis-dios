package estudo;

import java.util.ArrayList;
import java.util.Collections;

import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

public class PrincipalComListas {
	
	public static void main(String[] args) {
		
		Filme meuFilme = new Filme("O poderoso chefão", 1970);
		meuFilme.avalia(9);
		Serie lost = new Serie("Lost", 2000);
		meuFilme.avalia(6);
		Filme outroFilme = new Filme("Avatar", 2023);
		meuFilme.avalia(10);
		var filmeDoPaulo = new Filme("Dogville", 2003);
		
		ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
     
	        for(Titulo item : lista ) {
	        	System.out.println(item.getNome());
	        	if(item instanceof Filme filme) {
	        		System.out.println("Classificação: "+filme.getClassificacao());
	        	} 		
	        }
	
	ArrayList<String>buscaPorArtista=new ArrayList<>();
	buscaPorArtista.add("Adam Sandler");
	buscaPorArtista.add("Paulo");
	buscaPorArtista.add("Jacqueline");
	
	System.out.println("Despois da ordenação");
	Collections.sort(buscaPorArtista);
	System.out.println(buscaPorArtista);
	
	System.out.println("Lista de títulos ordenados: ");
	//usamos o compareTo na classe filme
	Collections.sort(lista);
	System.out.println(lista);
        
		
	}
}


