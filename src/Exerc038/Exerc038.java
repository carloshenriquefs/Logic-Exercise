package Exerc039;

import java.util.Locale;
import java.util.Scanner;

public class Exerc039 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        var opcoes = """
                     +--------------------------------------------------+
                     |         RENDA             |    IMPOSTO DE RENDA  |
                     |--------------------------------------------------|
                     | R$ 0.00 a R$ 2000.00      |        Isento        |
                     | R$ 2000.01 ate R$ 3000.00 |          8%          |
                     | R$ 3000.01 ate R$ 4500.00 |          18%         |
                     | acima de R$ 4500.00       |          28%         |
                     +--------------------------------------------------+
                """;

        var personSalary = sc.nextDouble();

        sc.close();
    }
}
