/**
 * Narayana Tangudu
 */
package ex3;

import java.util.jar.Attributes;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

	public class MyHandler extends DefaultHandler{
		
		boolean name =false;
		boolean opntime =false;
		boolean clstime =false;
		boolean adult =false;
		boolean child =false;

		 public void startElement(String uri, String localName, String qName, Attributes attributes)
		            throws SAXException {
			 System.out.println("Start Element :" + qName);
			 if (qName.equalsIgnoreCase("place")) {
				 String code = attributes.getValue("Code");
		         System.out.println("Code : " + code);
				}
				if (qName.equalsIgnoreCase("name")) {
					name = true;
				}

				if (qName.equalsIgnoreCase("opening-time")) {
					opntime = true;
				}

				if (qName.equalsIgnoreCase("close-time")) {
					clstime = true;
				}

				if (qName.equalsIgnoreCase("adult")) {
					adult = true;
				}
				
				if (qName.equalsIgnoreCase("adult")) {
					child = true;
				}

			}
		

				public void characters(char ch[], int start, int length) throws SAXException {

					if (name) {
						System.out.println("Name : " + new String(ch, start, length));
						name = false;
					}

					if (opntime) {
						System.out.println("Opening Time: " + new String(ch, start, length));
						opntime = false;
					}

					if (clstime) {
						System.out.println("Closing time : " + new String(ch, start, length));
						clstime = false;
					}

					if (adult) {
						System.out.println("adult fee : " + new String(ch, start, length));
						adult = false;
					}
					
					if (child) {
						System.out.println("Child fee : " + new String(ch, start, length));
						child = false;
					}

				}
				
				 public void endElement(String uri, String localName,
							String qName) throws SAXException {

							System.out.println("End Element :" + qName);

						}
		 }



