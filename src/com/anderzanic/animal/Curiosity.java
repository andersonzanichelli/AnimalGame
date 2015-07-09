package com.anderzanic.animal;

import javax.swing.JOptionPane;

public interface Curiosity {
	
	int YES = 0;

	boolean question();

	boolean unknown();

	default boolean win(){
		JOptionPane.showMessageDialog(null, "Acertei de novo!", "Jogo dos Animais", JOptionPane.DEFAULT_OPTION);
		return true;
	};
}
