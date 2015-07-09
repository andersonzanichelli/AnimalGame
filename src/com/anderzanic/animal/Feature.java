package com.anderzanic.animal;

import javax.swing.JOptionPane;


public class Feature extends Knowledge {

	public Feature(String info) {
		this.info = info;
	}

	public boolean question(){
		int answer = JOptionPane.showConfirmDialog(null, "O animal que você pensou "+ this.info + "?", "", JOptionPane.YES_NO_OPTION);

		return answer == YES ? this.right.question() : this.left.question();
	}

	@Override
	public boolean unknown() {
		return false;
	}
}
