package com.cg.springbootjpa.exception;

public class ShowException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public ShowException(String mesg)
	{
		super(mesg);
	}
}
