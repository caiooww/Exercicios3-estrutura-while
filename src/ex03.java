import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Os tipos de combustivel sao:");
        System.out.println("1. Alcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("Para sair, digite 4");
        System.out.println("Digite um codigo (1, 2, 3) ou 4 para parar: ");
        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool += 1;
            } else if (tipo == 2) {
                gasolina += 1;
            } else if (tipo == 3) {
                diesel += 1;
            }

            tipo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
