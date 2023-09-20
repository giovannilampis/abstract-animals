package org.pack.abs;

public class Cane extends Animale {


	   public Cane() {
	        super("Cane"); // Chiamiamo il costruttore della classe madre con un nome predefinito
	    }

	@Override
	    public void verso() {
	        System.out.println("Woof! Woof!");
	    }

	    @Override
	    public void mangia() {
	        System.out.println("Il cane mangia carne.");
	    }

}
