public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";
        String fixedUrl = url.replace("bots", "odds");
        String finalUrl = fixedUrl.substring(0,5) + ":" + fixedUrl.substring(5);
        System.out.println(finalUrl);
    }
}
