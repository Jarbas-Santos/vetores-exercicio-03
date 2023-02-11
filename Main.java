import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        String[] vectName = new String[n];
        int[] vectAge = new int[n];
        double[] vectHeight = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            vectName[i] = sc.nextLine();
            System.out.print("Idade: ");
            vectAge[i] = sc.nextInt();
            System.out.print("Altura: ");
            vectHeight[i] = sc.nextDouble();
        }

        double sumHeight = 0.0;
        for (int i = 0; i < n; i++) {
            sumHeight += vectHeight[i];
        }
        double averageHeight = sumHeight / n;
        System.out.printf("\nAltura média: %.2f%n", averageHeight);

        int underSixTeen = 0;
        for (int i = 0; i < n; i++) {
            if (vectAge[i] < 16) {
                underSixTeen++;
            }
        }

        double underSixTeenPercentage = (double) underSixTeen / n * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", underSixTeenPercentage);

        for (int i = 0; i < n; i++) {
            if (vectAge[i] < 16) {
                System.out.println(vectName[i]);
            }
        }

        sc.close();
    }
}