
package xmlread;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

public class XmlRead {
    //String   path =  getClass().getResource("xmlDocument.xml").getPath();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        File  file = new File("D:\\amin\\advance_java\\XmlRead\\xmlLDocument.xml");
        SAXParserFactory  sp = SAXParserFactory.newInstance();
        sp.setNamespaceAware(true);
        sp.setValidating(true);
        
        SAXParser parser =null;
        try {
             parser = sp.newSAXParser();
             MyXHandler handler = new MyXHandler();
             parser.parse(file, handler);
            
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XmlRead.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(XmlRead.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XmlRead.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
