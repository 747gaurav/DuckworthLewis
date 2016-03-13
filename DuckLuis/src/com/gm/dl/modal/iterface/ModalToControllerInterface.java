package com.gm.dl.modal.iterface;

import com.gm.dl.common.InningData;
import com.gm.dl.common.TargetResult;

public interface ModalToControllerInterface {
	TargetResult getTarget(final InningData inning1, final InningData inning2);
}
