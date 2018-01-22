/**
 * Narayana Tangudu
 */

package ex3;
import javax.xml.parsers.SAXParserFactory;

public class SAXParser{


	public static void main(String[] args) {
		try {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		javax.xml.parsers.SAXParser saxParser = factory.newSAXParser();
		
		MyHandler handler = new MyHandler() ;
		saxParser.parse("src/ex3/Tour.xml", handler);
		
		}catch (Exception e) {
		       e.printStackTrace();
	     }
	}

}
