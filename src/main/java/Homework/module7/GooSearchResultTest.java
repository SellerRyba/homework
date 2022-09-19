package Homework.module7;

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}
class GooSearchResult{
    private final String url;

    public String getUrl() {
        return url;
    }
    public GooSearchResult(String url){
        this.url = url;
    }
    public String parseDomain(){
        String first = "";
        if (url.contains("http://")){
            first += url.replace("http://", "");
        } else if (url.contains("https://")) {
            first += url.replace("https://", "");
        }
        String [] result = first.split("/");
        return result[0];
    }
}
