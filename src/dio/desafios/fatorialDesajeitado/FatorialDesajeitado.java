package dio.desafios.fatorialDesajeitado;

import java.util.Scanner;

public class FatorialDesajeitado {

    public static void main(String[] args) {

        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int resultado = 0;
        int tmp = n;
        int ciclo = 1;

        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;

        //Se o número for maior que 3, ele fará um ou mais ciclos. O tmp armazena inicialmente o valor de n;
        //Quando a variável temp for menor que 3, sairá do laço e fará o cálculo restante conforme o seu valor atual
        while (tmp >= 3) {
            if (ciclo == 1) {
                cont1 += tmp * (tmp - 1) / (tmp - 2); // cálculo da multiplicação dos 3 primeiros números
                resultado += (tmp - 3); // somando ao resultado o número que não foi utilizado na operação
                tmp -= 4; // Como foram usados 4 números, subtraímos o temporário em 4
                ciclo++;
            } else if (ciclo == 2) {  // Se após subtrair 4, o tmp estiver acima de 3, cairá nesse ciclo, só que desta vez, o sinal inicial de tmp é negativo
                cont2 += (-tmp * (tmp - 1)) / (tmp - 2);
                resultado += (tmp - 3); // somando ao resultado o número que não foi utilizado na operação
                tmp -= 4; // Como foram usados 4 números, subtraímos o temporário em 4 novamente
            }
        }

        //se o tmp zerar, não cairá nos if abaixo.
        //Se tmp for 1 ou 2, significa que ficou um ou dois números para executar o cálculo, e a depender do ciclo, o cálculo difere.

        if (tmp == 1) {
            if (ciclo == 1) // Se o ciclo for 1, significa que o número n recebido no console foi 1, então não há calculo
                resultado = 1;
            else // Se o ciclo for 2, significa que restou 1 número para calcular, e pela, ordem ele só pode ser negativo.
                cont3 = -tmp;
        }

        if (tmp == 2) {
            if (ciclo == 1) // Se o ciclo for 1, significa que o número n recebido no console foi 2, logo, o fatorial desajeitado seria: 2 * 1 = 2
                resultado = tmp;
            else // Se o ciclo for 2, significa que restou uma multiplicação para finalizar o fatorial desajeitado, e como está no segundo ciclo
                // o 2 se torna negativo: -2 * 1 = 2
                cont3 = (-tmp);
        }

        resultado = resultado + cont1 + cont2 + cont3;
        System.out.println(resultado);
    }
}