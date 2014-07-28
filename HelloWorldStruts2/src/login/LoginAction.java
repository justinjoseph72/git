/*------------------------------------------------------
File Name-----LoginAction.java
Author------justin
Date created--------27-Jul-2014 -7:32:35 pm
-------------------------------------------------------*/

/**
 * 
 */
package login;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import formBeans.LoginForm;

/**
 * @author justin
 *
 */
public class LoginAction extends ActionSupport implements ModelDriven<LoginForm>
{

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#validate()
	 */
	@Override
	public void validate()
	{
		
		if(this.myLoginForm!=null && this.myLoginForm.getUserName().equals(""))
		{
			addFieldError("userName", "Please enter a valid user name");
		}
		if(this.myLoginForm!=null && this.myLoginForm.getPassWord().equals("") && !this.myLoginForm.getUserName().equals(""))
		{
			addFieldError("passWord", "Please provide a password");
		}
	}

	private LoginForm myLoginForm;
	/**
	 * @return the myLoginForm
	 */
	public LoginForm getMyLoginForm()
	{
		return myLoginForm;
	}
	/**
	 * @param myLoginForm the myLoginForm to set
	 */
	public void setMyLoginForm(LoginForm myLoginForm)
	{
		this.myLoginForm = myLoginForm;
	}
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public LoginForm getModel()
	{
		// TODO Auto-generated method stub
		return myLoginForm;
	}
	
	public String loginUser()
	{
		String myReturn ="error";
		if(this.myLoginForm!=null && this.myLoginForm.getUserName().equals("Robin")
				&& this.myLoginForm.getPassWord().equals("bhai"))
		{
			myReturn="success";
		}
		return myReturn;
	}

}
