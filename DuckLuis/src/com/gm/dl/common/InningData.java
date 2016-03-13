package com.gm.dl.common;

public class InningData {

	private int runs;
	private byte fallenwickets;
	private float oversPlayed;
	public InningData(int runs, byte fallenwickets, float oversPlayed) {
		super();
		this.runs = runs;
		this.fallenwickets = fallenwickets;
		this.oversPlayed = oversPlayed;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public byte getFallenwickets() {
		return fallenwickets;
	}
	public void setFallenwickets(byte fallenwickets) {
		this.fallenwickets = fallenwickets;
	}
	public float getOversPlayed() {
		return oversPlayed;
	}
	public void setOversPlayed(float oversPlayed) {
		this.oversPlayed = oversPlayed;
	}
	
	
}
