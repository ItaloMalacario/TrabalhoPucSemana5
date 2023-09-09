package Modelo;

public class Apartamento extends Financeamento {
    private double ValorTotal;

    public Apartamento(double ValorDaPropriedade, int Parcelamento, double Juros) {
        super(ValorDaPropriedade, Parcelamento, Juros);
    }

    @Override
    public double GetValorTotal() {
        return this.ValorTotal;
    }

    @Override
    public void PrintGeral() {
        System.out.printf("\n\nAPARTAMENTO\n\n");
        double Reducao = super.GetJuros(); // reduz a taxa de juros.
        int i = 1;

        System.out.printf("\nMês " + i + " Valor do aluguel: R$ %,.2f ",
                ((GetValorDaPropriedade() + (GetValorDaPropriedade() / (100 / Reducao)))
                        / GetParcelamento()));
        while (i <= GetParcelamento()) {
            i++;
            Reducao /= 2;
            System.out.printf("\nMês " + i + " Valor do aluguel: R$ %,.2f ",
                    ((GetValorDaPropriedade() + (super.GetValorDaPropriedade() / (100 / Reducao)))
                            / GetParcelamento()));
            ValorTotal += ((GetValorDaPropriedade() + (GetValorDaPropriedade() / (100 / Reducao)))
                    / GetParcelamento()); // não fiz dentro do Get pq quero que os Gets me deem apenas o valor, 
                                                //se eu fizer dentro do get ele precisaria de um System.out
        }
        System.out.printf("\n\nO valor Total do Pagamento é: R$ %,.2f ", GetValorTotal());

    }

}