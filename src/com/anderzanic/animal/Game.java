package com.anderzanic.animal;

import javax.swing.JOptionPane;

public class Game {

	private Knowledge waterAnimal = new Feature("vive na agua");
	
	public Game() {
		Knowledge shark = new Animal("Tubarão");
		Knowledge monkey = new Animal("Macaco");

		waterAnimal.right = shark;
		waterAnimal.left = monkey;
		
		shark.root = waterAnimal;
		monkey.root = waterAnimal;
	}
	
	public void start(){
		
		while(true) {
			JOptionPane.showMessageDialog(null, "Pense em um animal", "Jogo dos animais", 3);
			waterAnimal.question();
		}
	}
}
