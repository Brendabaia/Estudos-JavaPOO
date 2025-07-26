package com.jovemprogramador.cursojavatarde.oop.DispositivoEletronico;

public abstract class DispositivoBase implements DispositivoEletronico {
    protected String nome;
    protected boolean ligado;

    public DispositivoBase(String nome) {
        this.nome = nome;
        this.ligado = false;
    }

    @Override
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println(nome + " ligado.");
        } else {
            System.out.println(nome + " já está ligado.");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println(nome + " desligado.");
        } else {
            System.out.println(nome + " já está desligado.");
        }
    }

    @Override
    public void exibirStatus() {
        String status = ligado ? "Ligado" : "Desligado";
        System.out.println(nome + " está " + status + ".");
    }

    @Override
    public void resetar() {
        System.out.println("Resetando " + nome + "...");
        desligar();
        ligar();
    }
}
