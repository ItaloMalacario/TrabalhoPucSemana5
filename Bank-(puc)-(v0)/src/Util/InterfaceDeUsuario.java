package Util;

import java.util.Scanner; // colocar todos os scanners dentro de InterfaceDeUsuario

public class InterfaceDeUsuario {

    private Scanner scan;

    public InterfaceDeUsuario() {
        this.scan = new Scanner(System.in); // abre o scanner da classe.
    }

    public int UserInput() {
        int input = scan.nextInt(); // abre um scanner.
        return input;
    }

    public double ScanValor() { // peda valor da propriedade e checa se e < ou = a 0
        System.out.print("\nQual o valor da propriedade? ");
        while (true) {

            double ValorDoImovel = scan.nextDouble();

            if (ValorDoImovel <= 0) {
                System.out
                        .println("\nValor inválido, Sua propriedade não pode valer 0 ou menos que 0. \nTente novamente.");

            } else {
                return ValorDoImovel;
            }
        }
    }

    public int ScanParcelas() { // pede a quantidade do parcelamento e se e < ou = a 0
        System.out.println("\nQuantas parcelas? ");
        while (true) {
            int Parcelamento = scan.nextInt();
            if (Parcelamento <= 0) {
                System.out.println("\nValor inválido. Você não pode parcelar em 0 vezes ou menos. \nTente novamente.");
            } else {
                return Parcelamento;
            }
        }
    }

    public double ScanTaxaDeJuros() { // pede o valor do juros da Propriedade e se < 0
        System.out.println("\nQual a taxa de Juros anual em %? ");
        while (true) {
            double TaxaDeJuros = scan.nextDouble();

            if (TaxaDeJuros < 0 | TaxaDeJuros > 30) {
                System.out.println(
                        "\nValor inválido. Você não pode cobrar menos que 0% ou mais que 30% em juros. \nTente novamente.");
            } else {
                return TaxaDeJuros;
            }
        }
    }
}