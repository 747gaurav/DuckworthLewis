package com.gm.dl.modal.dlresourcetab;



public class OneDayDLData extends AbsDLData {

	private static OneDayDLData instance;
	
	public static OneDayDLData getInstance()
	{
		if(instance == null)
		{
			instance = new OneDayDLData();;
		}
		return instance;		
	}
	
	private OneDayDLData()
	{
		avrage = 225;
		resorceMatrix = new float[][]{
			/*50 over    */ {(float)100.0, (float)93.4, (float)85.1, (float)74.9, (float)62.7, (float)49.0, (float)34.9, (float)22.0, (float)11.9, (float)4.7},
			/*			{(float)99.1, (float)92.6, (float)84.5, (float)74.4, (float)62.5, (float)48.9, (float)34.9, (float)22.0, (float)11.9, (float)4.7},
			{(float)98.1, (float)91.7, (float)83.8, (float)74.0, (float)62.2, (float)48.8, (float)34.9, (float)22.0, (float)11.9, (float)4.7}
			 */ /*40 over*/ {(float)89.3, (float)84.2, (float)77.8, (float)69.6, (float)59.5, (float)47.6, (float)34.6, (float)22.0, (float)11.9, (float)4.7},
			 /*30 over   */ {(float)75.1, (float)71.8, (float)67.3, (float)61.6, (float)54.1, (float)44.7, (float)33.6, (float)21.8, (float)11.9, (float)4.7},
			 /*20 over   */ {(float)56.6, (float)54.8, (float)52.4, (float)49.1, (float)44.6, (float)38.6, (float)30.8, (float)21.2, (float)11.9, (float)4.7},
			 /*10 over   */ {(float)32.1, (float)31.6, (float)30.8, (float)29.8, (float)28.3, (float)26.1, (float)22.8, (float)17.9, (float)11.4, (float)4.7},
		};
	}
	@Override
	public float getResourcePerFor(float over, int wicket) {
		// TODO Auto-generated method stub
		return 0;
	}

}
