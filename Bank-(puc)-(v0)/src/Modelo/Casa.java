package Modelo;

public class Casa extends Financeamento {
    public Casa(double ValorDaPropriedade, int Parcelamento, double Juros) {
        super(ValorDaPropriedade, Parcelamento, Juros);
    }

    @Override
    public double GetValorMensal() {
        if (GetValorDaPropriedade() >= 1000) {
            return super.GetValorMensal() - 100;
        } else {
            return super.GetValorMensal();
        }
    }

    @Override
    public double GetValorTotal() {
        return (GetValorMensal() * GetParcelamento());
    }

    @Override
    public void PrintGeral() {
        System.out.printf("\n\n CASA \n\nO valor das mensalidades são: R$ %,.2f ",GetValorMensal(),"\n"); 
        // Juros compostos com R$100,00 de desconto para todo mês.
        System.out.printf("\nValor total do pagamento:  R$ %,.2f",GetValorTotal());
    }
}
