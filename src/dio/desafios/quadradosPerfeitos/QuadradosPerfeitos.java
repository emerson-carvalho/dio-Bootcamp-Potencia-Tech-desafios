package dio.desafios.quadradosPerfeitos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuadradosPerfeitos {

    public static void main(String[] args) {

        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        List<Integer> quadradosPerfeitos = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                quadradosPerfeitos.add(i);
            }
        }

        int quantidade = 0;
        int total = n;

        for (int i = quadradosPerfeitos.size() - 1; i >= 0; i--) {
            int num = quadradosPerfeitos.get(i);

            if (num <= total && total > 0) {
                total -= num;
                if (quadradosPerfeitos.contains(total) || total == 0) quantidade++;
            }
        }

        if (total > 0) {
            for (int num : quadradosPerfeitos) {
                if (n % num == 0 && num > 1) {
                    quantidade = n / num;
                }
            }
        }

        System.out.println(quantidade);
    }
}
