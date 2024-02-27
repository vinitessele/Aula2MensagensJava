package com.vnttecnologia.mensagem;

import javax.swing.JOptionPane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class MensagemApplication {

	public static void main(String[] args) {
		System.setProperty("java.awt.headless", "false");
		SpringApplication.run(MensagemApplication.class, args);
		//System.out.println("Olá mundo");
		//JOptionPane.showMessageDialog(null,"Olá Mundo");
		//create();
		//read();
		//update();
		//delete();
	}
	
	
	@PostConstruct
	public static void create() {
		System.out.println("Cria um registro");			
	}
	@PostConstruct
	public static void read() {
		System.out.println("lê um registro");
	}
	@PostConstruct
	public static void update() {
		System.out.println("Altera um registro");
	}
	@PostConstruct
	public static void delete() {
		System.out.println("delete um registro");
	}

}
