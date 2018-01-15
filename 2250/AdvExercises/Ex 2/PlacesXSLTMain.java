package com.adv1.test;

import java.io.File;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class PlacesXSLTMain {

	public static void main(String[] args) {
		
	try {
		TransformerFactory tff = TransformerFactory.newInstance();
		Transformer tf = tff.newTransformer(new StreamSource(new File("src\\com\\adv1\\test\\Places.xsl")));
		StreamSource ss = new StreamSource(new File("src\\com\\adv1\\test\\Places.xml"));
		StreamResult sr = new StreamResult("src\\\\com\\\\adv1\\\\test\\\\Places.html");
		tf.transform(ss, sr);
		System.out.println("Done");
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}

}
