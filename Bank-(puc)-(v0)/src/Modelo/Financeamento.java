package Modelo;

public class Financeamento {
    private double ValorDaPropriedade;
    private int Parcelamento;
    private double Juros;

    public Financeamento(double ValorDaPropriedade, int Parcelamento, double Juros) {
        this.ValorDaPropriedade = ValorDaPropriedade;
        this.Parcelamento = Parcelamento;
        this.Juros = Juros;
    }

    public double GetValorDaPropriedade() {
        return this.ValorDaPropriedade;
    }

    public int GetParcelamento() {
        return this.Parcelamento;
    }

    public double GetJuros() {
        return this.Juros;
    }

    public double GetValorMensal() {
        return (this.ValorDaPropriedade / this.Parcelamento) * (1 + (this.Juros / 12));
    }

    public double GetValorTotal() {
        return ((this.ValorDaPropriedade / this.Parcelamento) * (1 + (this.Juros / 12)) * this.Parcelamento);
    }

    public void PrintGeral() {
        System.out.printf("\n\nFINANCEAMENTO\n\n");
        System.out.printf("\nSerão " + Parcelamento + " parcelas de: R$ %,.2f ",
                GetValorMensal()); // total com juros composto
        System.out.printf("\nValor total do pagamento: R$ %,.2f ",
                GetValorTotal()); // Total do pagamento.
    }

}
