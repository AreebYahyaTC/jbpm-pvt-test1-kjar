package com.teleradtech.worklist;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class WorkItem implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String state;
	private java.lang.String nextState;

	public WorkItem() {
	}

	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	public java.lang.String getNextState() {
		return this.nextState;
	}

	public void setNextState(java.lang.String nextState) {
		this.nextState = nextState;
	}

	public WorkItem(java.lang.String state, java.lang.String nextState) {
		this.state = state;
		this.nextState = nextState;
	}

}