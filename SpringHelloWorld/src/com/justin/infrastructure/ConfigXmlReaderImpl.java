package com.justin.infrastructure;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.justin.infrastructure.iterfaces.ConfigXmlReader;

public class ConfigXmlReaderImpl implements ConfigXmlReader
{
	private String myConfigFileName = "businesss-logic-config.xml";
	private String myCalulateTag= "calculate";
	private String myCalculate_details_tag= "calcualte-details";

	@Override
	public List<String> getCalculators()
	{
		List myReturnClassList = new ArrayList();
		File myConfigFile = new File(myConfigFileName);
		DocumentBuilderFactory myDocBuilderFactory = DocumentBuilderFactory.newInstance();
		try
		{
			DocumentBuilder myDocBuilder = myDocBuilderFactory.newDocumentBuilder();
			if (myConfigFile.isFile())
			{
				Document myDoc = myDocBuilder.parse(myConfigFile);
				if(myDoc!=null)
				{
					NodeList myNodeList = myDoc.getElementsByTagName(myCalculate_details_tag);
					for(int i=0;i<myNodeList.getLength();i++)
					{
						Node myNode = myNodeList.item(i);
						NamedNodeMap myNodeMap =myNode.getAttributes();
						for(int j =0;j<myNodeMap.getLength();j++)
						{
							Node myCalcuateNode = myNodeMap.item(j);
							myReturnClassList.add(myCalcuateNode.getNodeValue());
						}
						
					}
				}
					
			}

		} catch (ParserConfigurationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myReturnClassList;
	}

}
