package Homework.module6;
class TexturePoolTest {
    public static void main(String[] args) {
        //Get texture MainHero
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
    }
}
class TexturePool{
    private static TexturePool instance = new TexturePool();
    public static TexturePool getInstance(){
        return instance;
    }
    private TexturePool(){}
    public String getTexture(String textureName){
        return "Get texture " + textureName;
    }
}
