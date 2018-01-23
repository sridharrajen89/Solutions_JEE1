package com.htc.JEE;

import java.io.File;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class PlacesXSLT {

	public static void main(String args[])throws Exception
	{
		try {
			TransformerFactory tff = TransformerFactory.newInstance();
			Transformer tf = tff.newTransformer(new StreamSource(new File("Places.xsl")));
			StreamSource ss = new StreamSource(new File("Places.xml"));
			StreamResult sr = new StreamResult("D:\\java\\Places.html");
			tf.transform(ss, sr);
			System.out.println("Done");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}

	}