package org.generation.italy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		//ArrayList<String> prodottiLista=new ArrayList<>();
		//ArrayList<Float> prezziLista=new ArrayList<>();
		
		HashMap<Integer, String> listaProdotti = new HashMap<>();
		listaProdotti.put(001, "pane");
		listaProdotti.put(002, "pasta");
		listaProdotti.put(003, "biscotti");
		listaProdotti.put(004, "formaggio");
		listaProdotti.put(005, "mortadella");
		/*HashMap<String, String> listaProdotti=new HashMap<>() {
			{
		    put(001, "pane");
		    put(002, "pasta");
		    put(003, "biscotti");
		    put(004, "formaggio");
		    put(005, "mortadella");
		

			
				
			
				
			}};*/
		HashMap<Integer, Float> listaPrezzi = new HashMap<>();	
		listaPrezzi.put(001, 3.50f);
		listaPrezzi.put(002, 1.50f);
		listaPrezzi.put(003, 2f);
		listaPrezzi.put(004, 13f);
		listaPrezzi.put(005, 12f);
		
		String posizione,risposta,altroProdotto, prodottoAquisto,ripetere;
		float prezzo,quantità,costo,prezzoTot=0;
		int i,codiceProdotto,conta;
		
		do
		{
		System.out.println("inserisci il codice del prodotto");
		codiceProdotto=Integer.parseInt(sc.nextLine());
		
		if(listaProdotti.containsKey(codiceProdotto)) {
			System.out.println("stai aquistando " + listaProdotti.get(codiceProdotto));
			System.out.println("quanto ne vuoi comprare ?");
			quantità =Float.parseFloat(sc.nextLine());
			prezzo=quantità*listaPrezzi.get(codiceProdotto);
			System.out.println("il prezzo è: " + String.format("%.2f", prezzo));
		}
		else
			System.out.println("prodotto non disponibile");
		System.out.println("vuoi altro?");
		altroProdotto=sc.nextLine();
		altroProdotto=altroProdotto.toLowerCase();
		}while (altroProdotto.equals("si"));
		System.out.println("arrivederci e grazie");

sc.close();
	}
}
