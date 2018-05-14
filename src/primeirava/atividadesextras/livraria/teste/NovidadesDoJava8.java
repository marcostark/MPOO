package primeirava.atividadesextras.livraria.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import primeirava.atividadesextras.livraria.Autor;
import primeirava.atividadesextras.livraria.produtos.Livro;
import primeirava.atividadesextras.livraria.produtos.LivroFisico;

public class NovidadesDoJava8 {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro javaoo = new LivroFisico(autor);
		javaoo.setNome("Java O.O.");
		
		Livro java8 = new LivroFisico(autor);
		java8.setNome("Java 8 Prático");

		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Livro de Ruby");
		
		List<Livro> livros = Arrays.asList(javaoo, java8, ruby);
		
		livros.forEach(l -> System.out.println(l.getNome()));
		System.out.println(" ------------------------------ ");
		
		// Filtrando objetos - Codigo imperativo
//		List<Livro> filtrados = new ArrayList<>();
//		
//		for(Livro livro: livros) {
//			if(livro.getNome().contains("Java")) {
//				filtrados.add(livro);
//			}
//		}
		
		Stream<Livro> stream = livros.stream();		
		
		livros.stream()
		.filter(l -> l.getNome().contains("Java"))
		.forEach(l -> System.out.println(l.getNome()));
			
		}
	}