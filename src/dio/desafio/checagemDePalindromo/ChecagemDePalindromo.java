package dio.desafio.checagemDePalindromo;

import java.util.Scanner;

public class ChecagemDePalindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.
        System.out.println(verificarPalindromo(palavra));
    }

    public static String verificarPalindromo(String palavra) {
        StringBuilder stringBuilder = new StringBuilder(palavra);
        String novaPalavra = stringBuilder.reverse().toString();

        if (palavra.equalsIgnoreCase(novaPalavra)) {
            return "TRUE";
        } else {
            return "FALSE";
        }
    }
}