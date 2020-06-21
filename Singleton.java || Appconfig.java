package mainJava;

public class AppConfig {
    private AppConfig(){

    }
    private static AppConfig obj;

    /**
     * Java does not support multiple inheritence that is an object can't inherit from multiple
     * parents.Because it will get confused from where to inherit....thats why there is a special class called singleton
     * class.....in which we make the constructor private and a public method called getInstance()
     * which is a static method(i.e it is related to class not object) which returns the same object whenever it is
     * called
     * @return
     */
    public static AppConfig getInstance(){
        if(obj==null)
            obj= new AppConfig();
        return obj;

    }
}
