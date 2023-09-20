package org.pack.abs;

public class Cane extends Animale implements AnimaleNuota {


	   public Cane() {
	        super("Cane"); // Chiamiamo il costruttore della classe madre con un nome predefinito
	    }
	   
	   @Override
		public void nuota() {
		   System.out.println("Nuota nuota nuota");
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
