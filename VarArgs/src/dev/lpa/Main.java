package dev.lpa;

public class Main {

    public static void main(String... args){

        System.out.println("Helo World!");

        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        printText("\nHello");

        printText("\nHello","Again");

        String[] sArray = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"};
        System.out.println(String.join(", ", sArray));
    }

    private static void printText(String... textList){
        for(String t : textList){
            System.out.println(t);
        }
    }
}
