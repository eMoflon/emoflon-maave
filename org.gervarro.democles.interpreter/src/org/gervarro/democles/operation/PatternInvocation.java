package org.gervarro.democles.operation;

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.runtime.InternalDataFrameProvider;
import org.gervarro.democles.runtime.AdornedOperation;
import org.gervarro.democles.runtime.RemappedDataFrame;

public class PatternInvocation extends AdornedOperation {

	public PatternInvocation() {
		super(AdornedOperation.BOUND_BOUND, AdornedOperation.BOUND_BOUND);
	}
	
	@Override
	public final InternalDataFrameProvider getDataFrame(RemappedDataFrame frame,
			Adornment adornment) {
		// TODO Auto-generated method stub
		return null;
	}
}
