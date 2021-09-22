public class Ques6 {
    public static void main(String[] args) {
        try{
            int[] a = new int[5];
            int val = a[5]/0;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurs");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Index Out Of Bound Exception occurs");
        }catch(Exception e){
            System.out.println("Exception occurs");
        }
        finally{
            System.out.println("This block is always executed whether the exception is caught or not.");
        }
        System.out.println("After all try catch finally block statements.");
    }
}
