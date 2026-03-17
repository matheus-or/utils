package utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import entidades.Autor;
import entidades.Livro;

public class Streams {

	public static void main(String[] args) {

		Autor autor = new Autor("Pedro Lucas");
		Livro javaoo = new Livro("Java O.O.");
		Livro java8 = new Livro("Java 8 Prático");
		Livro ruby = new Livro("Livro de Ruby");

		List<Livro> livros = Arrays.asList(javaoo, java8, ruby);

		livros.forEach(livro -> System.out.println(livro.getNome()));
		System.out.println();

		Stream<Livro> stream = livros.stream();

		stream.filter(l -> l.getNome().contains("Java"));

		livros.stream()
				.filter(l -> l.getNome().contains("Java"))
				.forEach(l -> System.out.println(l.getNome()));
	}

}
