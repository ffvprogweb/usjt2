package com.usjt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * Objetivo - carregar o contexto
 */
@SpringBootApplication
public class ScelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScelApplication.class, args);
		System.out.println("teste de carga do contexto");
	}

}
