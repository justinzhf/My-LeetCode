import com.sun.org.apache.bcel.internal.classfile.Code;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Codec {

    private int i=0;
    private Map map;

    public Codec(){
        map=new HashMap();
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(i,longUrl);
        i++;
        return (i-1)+"";
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return (String)map.get(Integer.parseInt(shortUrl));
    }
}

public class Solution535 {
    public static void main(String[] args) {
        Codec codec=new Codec();


        System.out.println(codec.decode(codec.encode("aaasssdd")));


    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));