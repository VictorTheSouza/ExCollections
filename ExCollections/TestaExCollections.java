package br.victor.ExCollections;

import java.util.ArrayList;

public class TestaExCollections {

	public static void main(String[] args) {
		
		Produto dolly = new Produto("Dolly" , 4);
		Produto fanta = new Produto("Fanta", 3);
		
		ArrayList<Produto>estoque = new ArrayList<>();
		estoque.add(dolly);
		estoque.add(fanta);
		
		System.out.println(estoque);
		
		
	}

}
