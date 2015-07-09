package com.anderzanic.animal;

import javax.swing.JOptionPane;

public class Animal extends Knowledge {

	private static final int YES = 0;
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public boolean unknown() {
		String name = JOptionPane.showInputDialog(null, "Qual animal que vc pensou?", "Desisto", JOptionPane.OK_CANCEL_OPTION);
		String newInfo = JOptionPane.showInputDialog(null, "Um(a) " + name + " ______ mas um(a) " + this.name + " não." , "Desisto", JOptionPane.OK_CANCEL_OPTION);
		
		Animal animal = new Animal(name);
		Feature feature = new Feature(newInfo);
		
		learn(animal, feature);
		
		return true;
	}
	
	public boolean question(){
		int answer = JOptionPane.showConfirmDialog(null, "O animal que você pensou é "+ this.name + "?", "", JOptionPane.YES_NO_OPTION);
		
		return answer == YES ? win() : unknown();
	}
}
