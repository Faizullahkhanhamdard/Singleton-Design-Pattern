package SingletonDesignPatternExample;

public class Login {

    public void start(){
        
        Setting ob = Setting.createInstance();
        System.out.println(ob.getThems());
        
        
    }
}
