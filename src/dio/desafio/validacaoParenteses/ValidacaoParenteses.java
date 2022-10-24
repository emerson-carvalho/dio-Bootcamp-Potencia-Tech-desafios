package dio.desafio.validacaoParenteses;

import java.util.Scanner;

public class ValidacaoParenteses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean caracter = ehValido(scanner.nextLine());
        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {

        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.
        if (s.isBlank()) {
            return true;
        }

        switch (s) {
            case "()":
            case "[]":
            case "{}":
                return true;
            default:
                return false;
        }
    }
}
