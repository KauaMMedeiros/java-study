package dev.lpa;

public class Main {
    static void main(String[] args){

        String[] strs = {"dog","racecar","car"};
        String prefix = strs[0];

        for(int i = 0; i < strs.length; i++){
            //se "flow" começa com flower -> falso, então entra no while
            //se "flow" começa com "flow" -> true, pula o while
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) System.out.println("vazio");
            }
        }

        System.out.println(prefix);

    }
}
