package com.gm.dl.modal;

import javax.management.modelmbean.ModelMBean;

import com.gm.dl.modal.iterface.ModalToControllerInterface;
import com.gm.dl.modal.oneday.OneDayModal;
import com.gm.dl.modal.ttwenty.TTwentyModal;

public class ModalLookupService {

	private static ModalLookupService instance;
	
	public static ModalLookupService getInstance()
	{
		if(instance == null)
		{
			instance = new ModalLookupService();
		}
		return instance;
	}
	private ModalLookupService()
	{
		
	}
	
	public ModalToControllerInterface getModal(int maxOvers){
		ModalToControllerInterface modal = null;
		switch(maxOvers)
		{
		case 50:
			modal = new OneDayModal();
			break;
		case 20:
			modal = new TTwentyModal();
		}
		
		return modal;
	}
}
