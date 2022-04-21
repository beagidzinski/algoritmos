package hacker_rank;

import java.util.*;

public class twoNumberSum {

    public static void main(String[] args) {
        int targetSum = 10;
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        System.out.println(Arrays.toString(getInts(targetSum, array)));
    }

    private static int[] getInts(int targetSum, int[] array) {
        Set<Integer> numbers= new HashSet<>();

        //itera no array e segura a primeira iteração
        for (int number : array) {
            int sub = targetSum - number;
            // se a soma do numero atual com o seguinte resulta no targetsum
            if (numbers.contains(sub)) {
                //retornar um map de inteiros com os dois numeros
                return new int[]{number, sub};
            }
            // se negativo vai pro próximo numero do array e incrementa o hashset
            numbers.add(number);
        }
        return new int[0];
    }
}