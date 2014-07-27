package hello;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import formBeans.HelloBean;

public class Hello extends ActionSupport implements ModelDriven<HelloBean>
{
	HelloBean myBean = new HelloBean();

	// execute method
	public String execute()
	{
		return "success";
	}

	/*
	 * (non-Javadoc)retuns a new model object which is a formbean of HelloBean
	 */
	@Override
	public HelloBean getModel()
	{
		// TODO Auto-generated method stub
		return myBean;
	}

	/**
	 * @return the myBean
	 */
	public HelloBean getMyBean()
	{
		return myBean;
	}

	/**
	 * @param myBean
	 *            the myBean to set
	 */
	public void setMyBean(HelloBean myBean)
	{
		this.myBean = myBean;
	}

	/*
	 * (non-Javadoc) gets the object of model and validates the inputs before
	 * executing the execute method
	 */
	@Override
	public void validate()
	{
		if(this.getMyBean()== null)
		{
			addFieldError("guestName", "Name :Please Provide a Name and resubmit");
		}
		if(this.getMyBean().getGuestName().equals(""))
		{
			//addActionError("Name :Please Provide a Name and resubmit");
			addFieldError("guestName", "Name :Please Provide a Name and resubmit");
		}
	}

}
