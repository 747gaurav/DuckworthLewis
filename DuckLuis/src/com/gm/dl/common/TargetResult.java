package com.gm.dl.common;

public class TargetResult {

	private int toTie;
	private float overs;
	
	public TargetResult(int runs, float overs)
	{
		this.toTie = runs;
		this.overs = overs;
	}
	public int getToTie() {
		return toTie;
	}
	
	public float getOvers() {
		return overs;
	}
}
