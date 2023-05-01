package Exerc036;

import java.util.Locale;
import java.util.Scanner;

import static Exerc036.CodigoConstants.*;
import static Exerc036.PrecoConstants.*;

public class Exerc036 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        var precoTotal = 0.0;

        var tabelaOpcoes = """
                +-----------------------------------------------+
                |   CODIGO   |     ESPECIFICACAO    |   PRECO   |
                |-----------------------------------------------|
                |     1      |    CACHORRO QUENTE   |  R$ 4.00  |
                |     2      |       X-SALADA       |  R$ 4.50  |
                |     3      |       X-BACON        |  R$ 5.00  |
                |     4      |    TORRADA SIMPLES   |  R$ 2.00  |
                |     5      |     REFRIGERANTE     |  R$ 1.50  |
                +-----------------------------------------------+
                """;

        System.out.println(tabelaOpcoes);

        var codigo = sc.nextInt();
        var quantidadeItem = sc.nextInt();

        if (codigo == CODIGO_PRIMEIRO_ITEM) {
            precoTotal = quantidadeItem * PRECO_PRIMEIRO_ITEM;
        } else if (codigo == CODIGO_SEGUNDO_ITEM) {
            precoTotal = quantidadeItem * PRECO_SEGUNDO_ITEM;
        } else if (codigo == CODIGO_TERCEIRO_ITEM) {
            precoTotal = quantidadeItem * PRECO_TERCEIRO_ITEM;
        } else if (codigo == CODIGO_QUARTO_ITEM) {
            precoTotal = quantidadeItem * PRECO_QUARTO_ITEM;
        } else {
            precoTotal = quantidadeItem * PRECO_QUINTO_ITEM;
        }

        System.out.printf("Total: R$ %.2f", precoTotal);

        sc.close();
    }
}
