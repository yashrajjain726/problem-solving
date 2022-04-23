public class Codec {
    Map<String ,String> url;
    public Codec(){
        url = new HashMap();
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String encodedString=Long.toString(longUrl.hashCode(),16);
        url.put(encodedString,longUrl);
        return encodedString;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return url.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));