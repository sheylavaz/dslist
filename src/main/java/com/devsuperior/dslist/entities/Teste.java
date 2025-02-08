package com.devsuperior.dslist.entities;

public class Teste {

	public static void main(String[] args) {
		try {
		    Class.forName("org.h2.Driver");
		    System.out.println("Driver H2 carregado com sucesso!");
		} catch (ClassNotFoundException e) {
		    System.out.println("Erro: Driver H2 não encontrado no classpath.");
		}

	}

}
