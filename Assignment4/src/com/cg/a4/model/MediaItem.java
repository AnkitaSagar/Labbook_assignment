package com.cg.a4.model;

public abstract class MediaItem extends Item {

	private Integer runtime;
	
	public MediaItem(String number, String title, int numberOfCopies, Integer runtime) {
		super(number, title, numberOfCopies);
		this.runtime = runtime;
	}

	public Integer getRuntime() {
		return runtime;
	}

	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}

	@Override
	public String toString() {
		return super.toString()+" runtime=" + runtime + " ";
	}
	
}