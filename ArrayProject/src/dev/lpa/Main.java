package dev.lpa;
import java.util.Arrays;

public class Main {

    static void main(String[] args){

        //10 posicoes onde posso armazenar uma informação
        //começando em 0 e indo até 9.
        int[] intArray = new int[10];
        //não está na posição 5, e sim na 6 dentro do array.
        intArray[5] = 60;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        //ARRAY INITIALIZER
        int[] firstFivePositives = {1, 2, 3, 4, 5};
        //               position - 0  1  2  3  4
        System.out.println(firstFivePositives[2]);
        //vai printar 3 pois array começa em 0

        int[] newArray;
        //newArray = new int[] {5,4,3,2,1};
        newArray = new int[5];
        for(int i=0;i<newArray.length;i++){
            newArray[i] = newArray.length - i;
        }
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+ " ");
        }
        System.out.print("\n");

        //ENHANCED FOR LOOP
        for(int element : newArray){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.print(Arrays.toString(newArray));

        //possível ter arrays de vários tipos
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;


    }
}
