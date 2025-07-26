package com.jovemprogramador.cursojavatarde.oop.Transporte;

public class Main {
    public static void main(String[] args) {
        MeioTransporteBase carro = new Carro("Carro Uber");
        MeioTransporteBase bicicleta = new Bicicleta("Bicicleta Alugada");
        MeioTransporteBase patinete = new Patinete("Patinete Elétrico");

        carro.iniciarViagem();
        carro.exibirStatus();
        carro.finalizarViagem();
        carro.avaliar(5);

        System.out.println();

        bicicleta.exibirStatus();
        bicicleta.iniciarViagem();
        bicicleta.finalizarViagem();
        bicicleta.avaliar(4);

        System.out.println();

        patinete.iniciarViagem();
        patinete.finalizarViagem();
        patinete.avaliar(3);
    }
}

