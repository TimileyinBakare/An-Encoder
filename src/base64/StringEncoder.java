
package base64;

import java.io.UnsupportedEncodingException;

import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringEncoder {
    public String basicEncoder(String userValue)
    {
        String base64Encoder = "";
        try {
             base64Encoder = Base64.getEncoder(). encodeToString(userValue.getBytes("utf-8"));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(StringEncoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return base64Encoder;
    }
    public String basicDecoder(String userValue) throws UnsupportedEncodingException
    {
        byte[] base64decodedBytes = Base64.getDecoder(). decode(userValue); 
        return  new String(base64decodedBytes, "utf-8"); 
    }
    
    
    
    
    public String urlEncoder(String userValue)
    {
        String urlEncoder = "";
        try {
            urlEncoder = Base64.getUrlEncoder(). encodeToString(userValue.getBytes("utf-8"));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(StringEncoder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return urlEncoder;
    }
    public String urlDecoder(String userValue)
    {
        return userValue;
    }
    
    
    
    
    public String mimeEncoder(String userValue)
    {
        return userValue;
    }
    public String mimeDecoder(String userValue)
    {
        return userValue;
    }
}
