package com.gm.dl.modal.dlresourcetab;

public class DLDataFactory {
	public final static AbsDLData createDLData(int gameType)
	{
		AbsDLData ret = null;
		switch(gameType){
		case 50:
			ret = OneDayDLData.getInstance();
			break;
		case 20:
			ret = new TTwentyDLData();
		default:
			ret = null;
		}
		return ret;
	}
}
