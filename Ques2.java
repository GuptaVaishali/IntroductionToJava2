import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        char[] strarr = str.toCharArray();

        System.out.println("Before Sorting: " + str);

        for(int i=0;i<strarr.length;i++){
            for(int j=0;j<strarr.length-i-1;j++){
                if(strarr[j+1] < strarr[j]){
                    char temp = strarr[j];
                    strarr[j] = strarr[j+1];
                    strarr[j+1] = temp;
                }
            }
        }

        System.out.print("After Sorting: ");
        for (char c : strarr) {
            System.out.print(c);
        }
    }
}
