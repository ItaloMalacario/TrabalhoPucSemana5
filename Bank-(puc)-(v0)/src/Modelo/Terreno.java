package Modelo;

public class Terreno extends Financeamento {

    public Terreno(double ValorDaPropriedade, int Parcelamento, double Juros) {
        super(ValorDaPropriedade, Parcelamento, Juros);
    }

    @Override
    public double GetValorMensal() {
        return (GetValorDaPropriedade() / GetParcelamento()) * (1 + ((GetJuros() + 2) / 12));
    }

    @Override
    public double GetValorTotal() {
        return GetValorMensal();
    }

    @Override
    public void PrintGeral() {
        System.out.printf("\n\nTERRENO\n\n");
        for (int i = 0; i < super.GetParcelamento(); i++) {

        }
        System.out.printf("\nAs Parcelas são de: R$ %,.2f ",
        (GetValorDaPropriedade() / GetParcelamento()) * (1 + ((GetJuros() + 2) / 12))); // Valor das parcelas
        System.out.printf("\nTotal do financeamento é de: R$ %,.2f", GetValorTotal()); // Valor Final do financeamento
    }
}
