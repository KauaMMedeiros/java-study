package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        //Arrays.toString vai printar [0, 1, 2...]
        int[] firstArray = getRandomArray(10);
        System.out.print(Arrays.toString(firstArray) + "\n");

        //Arrays.sort organiza do menor para o maior
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray) + "\n");

        int[] secondArray = new int[10];
        System.out.print(Arrays.toString(secondArray)+"\n");
        //Arrays.fill preenche o array com o número desejado, exemplo seguinte, preenchido com 5
        Arrays.fill(secondArray,5);
        System.out.print(Arrays.toString(secondArray)+"\n\n");

        int[] thirdArray = getRandomArray(10);
        System.out.print(Arrays.toString(thirdArray)+"\n");
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.print(Arrays.toString(fourthArray)+"\n\n");

        String[] sArray = {"Kauã", "Gio", "Luan", "Cauê", "Samurai"};
        Arrays.sort(sArray);
        System.out.print(Arrays.toString(sArray)+"\n");
        if(Arrays.binarySearch(sArray, "Kauã") >= 0){
            System.out.println("Found Kauã in the list!\n");
        }

        int[] s1={1,2,3,4,5};
        int[] s2={1,2,3,4,5};

        if(Arrays.equals(s1,s2)){
            System.out.println("Arrays are equals");
        }else{
            System.out.println("Arrays are not equals\n");
        }

    }


    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];

        for(int i=0;i<len;i++){
            newInt[i] = random.nextInt(100); //retorna um numero entre 0 e 99
        }

        return newInt;
    }
}
