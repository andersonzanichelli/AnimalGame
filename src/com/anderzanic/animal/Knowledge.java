package com.anderzanic.animal;


public abstract class Knowledge implements Curiosity {
	
	protected Knowledge root;
	protected Knowledge right;
	protected Knowledge left;
	protected String info;
	
	public void learn(Animal animal, Feature feature){
		
		if(hasNewFeature())
			this.root.right = feature;
		else
			this.root.left = feature;
		
		memorize(animal, feature);
	}

	private void memorize(Animal animal, Feature feature) {
		this.root = feature;
		feature.left = this;
		feature.right = animal;
		animal.root = feature;
	}

	private boolean hasNewFeature() {
		return this.root.right == this;
	}
}
