package com.jovemprogramador.cursojavatarde.oop.Transporte;

public abstract class MeioTransporteBase implements Transporte, Avaliavel {
    protected String nome;
    protected boolean viagemEmAndamento;

    public MeioTransporteBase(String nome) {
        this.nome = nome;
        this.viagemEmAndamento = false;
    }

    @Override
    public void iniciarViagem() {
        if (!viagemEmAndamento) {
            viagemEmAndamento = true;
            System.out.println(nome + ": Viagem iniciada.");
        } else {
            System.out.println(nome + ": Viagem já está em andamento.");
        }
    }

    @Override
    public void finalizarViagem() {
        if (viagemEmAndamento) {
            viagemEmAndamento = false;
            System.out.println(nome + ": Viagem finalizada.");
        } else {
            System.out.println(nome + ": Nenhuma viagem em andamento.");
        }
    }

    @Override
    public void avaliar(int nota) {
        System.out.println(nome + ": Avaliação recebida: " + nota + " estrelas.");
    }

    public void exibirStatus() {
        String status = viagemEmAndamento ? "em andamento" : "parada";
        System.out.println("Status de " + nome + ": " + status);
    }
}


