package org.pack.abs;

public abstract class Animale {

	private String name;
	
	public Animale(String name) {
		
		setName(name);

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void dormi() {
		
		System.out.println("Zzzzz");
	}
	
	public abstract void verso();
	
	public abstract void mangia();
	
}
