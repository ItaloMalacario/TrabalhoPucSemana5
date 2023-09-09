package Main;

import java.util.ArrayList;
import java.util.Locale;

import Modelo.Apartamento;
import Modelo.Casa;
import Modelo.Financeamento;
import Modelo.Terreno;
import Util.InterfaceDeUsuario;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Financeamento> ListaDeFinanceamentos = new ArrayList<>(); // Listas de Array.

        Locale.setDefault(new Locale("pt", "BR"));

    
        InterfaceDeUsuario interfaceDeUsuario = new InterfaceDeUsuario();
        
        System.out.printf("\nPor favor, registre suas casas á seguir: ");

        for (int i = 1; i <= 2; i++) {

            System.out.printf("\n\nCasa "+ i + ":");
            
            double ValorDaPropriedade = interfaceDeUsuario.ScanValor();
            
            int Parcelas = interfaceDeUsuario.ScanParcelas();
            
            double Juros = interfaceDeUsuario.ScanTaxaDeJuros();
            
            ListaDeFinanceamentos.add(new Casa(ValorDaPropriedade, Parcelas, Juros));
        }

        System.out.printf("Por favor, registre seus apartamentos á seguir: ");
        
        for (int i = 1; i <= 2; i++) {

            System.out.printf("\n\nApartamento "+ i +":");
        
            double ValorDaPropriedade = interfaceDeUsuario.ScanValor();
            
            int Parcelas = interfaceDeUsuario.ScanParcelas();
            
            double Juros = interfaceDeUsuario.ScanTaxaDeJuros();

            ListaDeFinanceamentos.add(new Apartamento(ValorDaPropriedade, Parcelas, Juros));
        
        }
        System.out.printf("\nPor favor, registre seu terreno a seguir:");

        System.out.printf("\n\nTERRENO");
        
        double ValorDaPropriedade = interfaceDeUsuario.ScanValor();
        
        int Parcelas = interfaceDeUsuario.ScanParcelas();
        
        double Juros = interfaceDeUsuario.ScanTaxaDeJuros();

        ListaDeFinanceamentos.add(new Terreno(ValorDaPropriedade, Parcelas, Juros));
        
        int count = 0;

        for (Financeamento item : ListaDeFinanceamentos) {

            count++;

            System.out.printf("\n\nFinanceamento "+ count + ":");

            item.PrintGeral();
        }
    }
}
