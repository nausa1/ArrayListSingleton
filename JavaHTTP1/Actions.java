/*
 * LoadRunner Java script. (Build: 3020)
 * 
 * Script Description: 
 *                     
 */
 
//package one; 
import one.*;
import lrapi.lr;


public class Actions
{

	public int init() throws Throwable {
		return 0;
	}//end of init


	public int action() throws Throwable {
		lr.start_transaction("Change test "+lr.eval_string("{param}"));
		ChangeTest cht = new ChangeTest();
		cht.init();
		cht.changeTest("{param}");
		lr.end_transaction("Change test "+lr.eval_string("{param}"), lr.AUTO);
		
		lr.start_transaction("Get test ");
		GetTest gt = new GetTest();
		gt.init();
		boolean status = true;
		try	{
			gt.getTest();
		}
		catch (AssertionError e) {
			status = false;
		}
		lr.end_transaction("Get test ", status ? lr.PASS : lr.FAIL);
		return 0;
	}//end of action


	public int end() throws Throwable {
		return 0;
	}//end of end
}
