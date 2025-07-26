package com.jovemprogramador.cursojavatarde.oop.DispositivoEletronico;

public class Main {
    public static void main(String[] args) {
    	
        DispositivoEletronico tv = new Televisao("Smart TV samsung");
        DispositivoEletronico radio = new Radio("Rádio Philips");
        DispositivoEletronico notebook = new Notebook("Notebook Dell");

        tv.ligar();
        tv.exibirStatus();
        tv.resetar();
        tv.desligar();

        System.out.println();

        radio.exibirStatus();
        radio.ligar();
        radio.resetar();

        System.out.println();

        notebook.ligar();
        notebook.exibirStatus();
        notebook.desligar();
    }
}

