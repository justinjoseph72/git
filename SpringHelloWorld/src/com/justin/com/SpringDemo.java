/**
 * 
 */
package com.justin.com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.justin.shapeImpl.Triangle;

/**
 * @author justin
 *
 */
public class SpringDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		BeanFactory myFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle myTriangle =(Triangle)myFactory.getBean("triangle");
		myTriangle.draw();

	}

}
