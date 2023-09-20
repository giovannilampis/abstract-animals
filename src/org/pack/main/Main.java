package org.pack.main;

import org.pack.abs.Aquila;
import org.pack.abs.Cane;
import org.pack.abs.Delfino;
import org.pack.abs.Passerotto;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("-----------------------\n");

		Cane animale1 = new Cane();
		
		System.out.println("Animale 1:");
		
		animale1.verso();
		
		animale1.mangia();
		
		animale1.dormi();
		
		System.out.println("-----------------------\n");

		Passerotto animale2 = new Passerotto();
		
		System.out.println("Animale 2:");
		
		animale2.verso();
		
		animale2.mangia();
		
		animale2.dormi();
		
		System.out.println("-----------------------\n");

		Aquila animale3 = new Aquila();
		
		System.out.println("Animale 3:");
		
		animale3.verso();
		
		animale3.mangia();
		
		animale3.dormi();
		
		System.out.println("-----------------------\n");

		Delfino animale4 = new Delfino();
		
		System.out.println("Animale 4:");
		
		animale4.verso();
		
		animale4.mangia();
		
		animale4.dormi();
	}
}
