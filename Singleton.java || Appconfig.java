package mainJava;

public class AppConfig {
    private AppConfig(){

    }
    private static AppConfig obj; //here we are not initialising the object...when needed it will be created else not

    /**
     * Java does not support multiple inheritence that is an object can't inherit from multiple
     * parents.Because it will get confused from where to inherit....thats why there is a special class called singleton
     * class.....in which we make the constructor private and a public method called getInstance()
     * which is a static method(i.e it is related to class not object) which returns the same object whenever it is
     * called
     * @return
     */
    public static AppConfig getInstance(){
        if(obj==null)    //Here we are checking whether the object is created or not...if not then we are initialising it
            obj= new AppConfig();
        return obj; //Here we are returning it....remember once the object is created it will not be created again and will
        //return the same object

    }
}
