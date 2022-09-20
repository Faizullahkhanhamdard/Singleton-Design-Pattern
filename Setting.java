package SingletonDesignPatternExample;

public class Setting {
    static Setting obj = null;
    String thems = "Darker Mode";

    // creation of Private Constractor
    private Setting(){

    }

    //Have access by private method
    public static Setting createInstance(){
        if( obj == null) {
            obj = new Setting();
            return obj;
        }
        return obj;
    }

    public void SetThems(String tems){
        this.thems = tems;
    }

    public String getThems(){
        return this.thems;
    }
}
