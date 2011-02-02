package de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.exceptions;

public class ExmaraldaException extends java.lang.RuntimeException
{
	/**
	 * generated serialVersionUID
	 */
	private static final long serialVersionUID = 7152733137673679658L;

	public ExmaraldaException()
	{ super(); }
	
    public ExmaraldaException(String s)
    { super(s); }
    
	public ExmaraldaException(String s, Throwable ex)
	{super(s, ex); }
}
