package org.zeppelin.p3.indexers;


public class TestXmlParsing {

	public static void main(String [] args){
		SaxParserNytHandler handler = new SaxParserNytHandler();
		handler.parseDocument("H:\\projects\\nyt.xml");
	}
}
