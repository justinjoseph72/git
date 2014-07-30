/**
 * 
 */
package com.justin.com;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.justin.businessLogic.interfaces.Calculate;
import com.justin.infrastructure.ConfigXmlReaderImpl;

/**
 * @author justin
 * 
 */
public class SpringBeanFactoryDemo
{

	static String myShape[] = { "circle", "triangle", "square" };

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		/*
		 * try { BeanFactory myFactory = new XmlBeanFactory(new
		 * FileSystemResource("spring.xml")); for (String myReturn : myShape) {
		 * Shape myShape = (Shape)myFactory.getBean(myReturn); myShape.draw(); }
		 * } catch (BeansException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

		try
		{
			ConfigXmlReaderImpl myObj = new ConfigXmlReaderImpl();
			List<String> myWorkList = myObj.getCalculators();
			//Beanfacorty needs a FileSystemResource to get the spring xml
			BeanFactory myfacFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
			for (String myCalculateString : myWorkList)
			{
				Calculate myCalculate = (Calculate) myfacFactory.getBean(myCalculateString);
				myCalculate.calculate();
			}
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
