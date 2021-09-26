package Ques8;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Word");
        String word = sc.next();
        while(!word.equals("done")){
            if(word.charAt(0) == word.charAt(word.length()-1))
                System.out.println("First Character is equal to its Last Character");
            else
                System.out.println("First character is not equal to its last character");

            System.out.println("Enter Next Word");
            word = sc.next();
        }
    }
}
