package com.gm.dl.modal.dlresourcetab;

public abstract class AbsDLData {

	protected int avrage;
	protected float resorceMatrix[][];
	public int getAvrage() {
		return avrage;
	}
	public void setAvrage(int avrage) {
		this.avrage = avrage;
	}
	public float[][] getResorceMatrix() {
		return resorceMatrix;
	}
	public void setResorceMatrix(float[][] resorceMatrix) {
		this.resorceMatrix = resorceMatrix;
	}
	
	public abstract float getResourcePerFor(float over, int wicket);
}
