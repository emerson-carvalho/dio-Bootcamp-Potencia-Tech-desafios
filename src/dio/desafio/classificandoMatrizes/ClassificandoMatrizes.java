package dio.desafio.classificandoMatrizes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassificandoMatrizes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i;
        int N = input.nextInt();
        int[] nums = new int[N];
        for (i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }
        //TODO: mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares

        int index = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int varAuxiliar = nums[index];
                nums[index] = nums[i];
                nums[i] = varAuxiliar;
                index++;
            }
        }

        List<Integer> novoArray = new ArrayList<>();
        for (i = 0; i < nums.length; i++) {
            int numero = nums[i];
            if (novoArray.contains(numero)) {
                novoArray.remove((Integer) numero);
            }
            novoArray.add(numero);
        }

        if (novoArray.size() == 2) {
            System.out.println(novoArray.get(0));
        } else {
            for (int num : novoArray) {
                System.out.println(num);
            }
        }
    }
}