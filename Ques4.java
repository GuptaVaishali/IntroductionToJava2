public class Ques4 {
    public static void main(String[] args) {
        AppConfig obj1 = AppConfig.getInstance();
        AppConfig obj2 = AppConfig.getInstance();
        if(obj1 == obj2)
            System.out.println("Both objects are same");
    }
}

class AppConfig{
    private AppConfig(){}

    private static AppConfig obj = null;

    public static AppConfig getInstance(){
        if(obj == null){
            obj = new AppConfig();
        }
        return obj;
    }
}
