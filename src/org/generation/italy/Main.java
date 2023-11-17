package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String[] prodotti= {"pane","pasta","biscotti","mortadella","latte"};
		float[] prezzi= {4.0F,1.60F,3.75F,12.50F,1.20F};
		String nomeProdotto;
		int posizione=-1,i;
		float quantità,prezzo,prezzoTot=0;
		String risposta;
		do
		{
		System.out.println("inserisci il nome del prodotto");
		nomeProdotto=sc.nextLine();
		
		for(i=0;i<=4;i++) 
			if(nomeProdotto.equals(prodotti[i])) {
				posizione=i;
		System.out.println("inserisci la quantità");
	quantità=Float.parseFloat(sc.nextLine());
	prezzo=quantità*prezzi[i];
prezzoTot=prezzoTot+prezzo;
	System.out.println("il prezzo è: " + prezzo + " € ");
	System.out.println("il prezzo totale è: " + prezzoTot + " € ");
			}
		if(posizione==-1)  
			System.out.println("prodotto non disponibile");
		
		
		System.out.println("vuoi tornare indietro");
		risposta=sc.nextLine();
		}
	while(risposta.equals("si"));
		{
			System.out.println("il prezzo finale è: " + prezzoTot + " € ");
		}
		
	}

}
