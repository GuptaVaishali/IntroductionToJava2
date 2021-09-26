public class Ques13 {
    public static void main(String[] args) {
        try{
            throw new MyException("This is my custom exception");
        }catch(MyException e){
            e.printStackTrace();
        }
    }
}

class MyException extends Exception{
    private String message;

    public MyException(String message){
        super(message,null,false,false);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "message='" + message + '\'' +
                '}';
    }
}
