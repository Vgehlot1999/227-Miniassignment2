package mini2;

import api.Selector;

/**
 * Selector whose <code>select</code> method returns false for strings whose first non-whitespace
 * text is "//", and true for all other strings.
 */
public class NonLineCommentSelector implements Selector
{

	@Override
	public boolean select(String s) {
		
		s = s.trim();
		if(s.length() == 0)
		{
			return true;
		}
		if(s.charAt(0) == '/' && s.charAt(1) == '/')
		{
			return false;
		}
		
		return true;
	}
  // TODO
}