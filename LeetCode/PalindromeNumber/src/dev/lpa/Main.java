package dev.lpa;

public class Main {

    static void main(String[] args){

        int x = 121, reverseX = 0;
        int len = String.valueOf(Math.abs(x)).length();

        System.out.println(x + " " + len + " " + reverseX);

        int temp = x;
        while(x != 0){
            int digit = x % 10;
            reverseX = reverseX * 10 + digit;
            x /= 10;
        }

        x = temp;
        System.out.println(x + " " + len + " " + reverseX);

        if(x == reverseX){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
