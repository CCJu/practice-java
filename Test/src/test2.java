import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class test2 {

	public static Document load(String filePath){
		SAXBuilder sb=new SAXBuilder(false);
		Document doc = null;
		try {
			doc=sb.build(new File(filePath));
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doc;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc=test2.load("lib/xinlang_yinger.xml");
		Element root=doc.getRootElement();
		//ArrayList al=root.getChild("item");
	}

}
