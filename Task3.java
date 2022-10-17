package uk.ac.mmu.advprog.lab2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int characters; 
		int words; 
		
		System.out.println("Enter your text: ");
		
		Scanner input = new Scanner(System.in);
		String Text = input.nextLine();
		
		characters = Text.length();
		String[] Array = Text.trim().split("\\s+");
		int wordCount = Array.length;
		words = wordCount;
		int sentences = Text.split("[!?.:]+").length;
		
		
		
		
		System.out.println("characters: " + characters);
		System.out.println("Words: " + words);
		System.out.println("Sentences: " + sentences);
		
		double ari;
		
		ari = (4.71 *(characters/words)) + (0.5*(words/sentences))-21.43;
		
		System.out.println(ari);

	}

}
