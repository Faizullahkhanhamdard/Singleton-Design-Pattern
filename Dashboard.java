package SingletonDesignPatternExample;

public class Dashboard {
    
    public void boo(){
        
        Setting boo1 = Setting.createInstance();
        boo1.SetThems("Light Mode is available!");
        System.out.println(boo1.getThems()); 
        
    }
}
