package br.com.projetoJava;

import java.util.Scanner;

public class Pacote1 {
	public static void main(String[] args) {

	    Scanner leia = new Scanner(System.in);

	    String pessoa, diario, CEP;
	    int controle = 0;

	    System.out.println(" Voc� possui HIV?");
	        pessoa = leia.nextLine();

	    if ("Sim".equals(pessoa) || "sim".equals(pessoa) || "SIM".equals(pessoa) || "N�o".equals(pessoa) || "n�o".equals(pessoa) || "N�O".equals(pessoa) || "nao".equals(pessoa) || "N�o sei".equals(pessoa) || "N�o Sei".equals(pessoa) || "n�o sei".equals(pessoa) || "N�O SEI".equals(pessoa)) { 

	        controle = 1;
	    }

	    else {

	        while (controle != 1) {

	            System.out.println("N�o entendi. Poss�veis respostas: Sim / N�o / N�o Sei");
	                pessoa = leia.nextLine();

	        if ("Sim".equals(pessoa) || "sim".equals(pessoa) || "SIM".equals(pessoa) || "N�o".equals(pessoa) || "n�o".equals(pessoa) || "N�O".equals(pessoa) || "nao".equals(pessoa) || "N�o sei".equals(pessoa) || "N�o Sei".equals(pessoa) || "n�o sei".equals(pessoa) || "N�O SEI".equals(pessoa)) {
	            controle = 1;
	            }

	        }

	    }

	    if ("Sim".equals(pessoa) || "sim".equals(pessoa) || "SIM".equals(pessoa)) {
	        System.out.println("Digite seu di�rio medicamentoso");
	            diario = leia.nextLine();
	        System.out.println("Procure um CTA");
	        System.out.println("Digite seu CEP: ");
	            CEP = leia.nextLine();
	        System.out.println("O local mais pr�ximo �: Rua xxxxxxxxxx" );


	    }
	    else if ("N�o".equals(pessoa) || "n�o".equals(pessoa) || "N�O".equals(pessoa) || "nao".equals(pessoa)) {
	        System.out.println("Voc� tem interesse em participar de uma pesquisa sobre vacina conta o HIV?");
	            pessoa = leia.nextLine();
	            if ("Sim".equals(pessoa) || "sim".equals(pessoa) || "SIM".equals(pessoa)) {
	                System.out.println("Crit�rios de Inclus�o");
	            }
	            else if ("N�o".equals(pessoa) || "n�o".equals(pessoa) || "N�O".equals(pessoa) || "nao".equals(pessoa)) {
	                System.out.println("Continue se prevenindo");
	            }

	    }
	    else if ("N�o sei".equals(pessoa) || "N�o Sei".equals(pessoa) || "n�o sei".equals(pessoa) || "N�O SEI".equals(pessoa)) {
	        System.out.println("Procure um CTA");
	        System.out.println("Informe o CEP: ");
	            CEP = leia.nextLine();
	        System.out.println("O local mais pr�ximo �: Rua xxxxx");
	        }
	    }

	}

