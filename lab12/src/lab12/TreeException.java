package lab12;

import java.io.IOException;

public class TreeException extends Throwable
{
	private static final long serialVersionUID = 1L;

	public TreeException(String s) throws IOException
	{
		// Pass s into a superclass ctor.
		super(s);
	}
}
