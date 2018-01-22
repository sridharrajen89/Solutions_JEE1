package ex2;
import java.io.File;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class PlacesXSLTMain {

	public PlacesXSLTMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			TransformerFactory tff = TransformerFactory.newInstance();
			Transformer tf = tff.newTransformer(new StreamSource(new File("src/ex2/places.xsl")));
			StreamSource ss = new StreamSource(new File("src/ex2/places.xml"));
			StreamResult sr = new StreamResult("src/ex2/places.html");
			tf.transform(ss, sr);
			System.out.println("Hurrayyyyy......!!!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
