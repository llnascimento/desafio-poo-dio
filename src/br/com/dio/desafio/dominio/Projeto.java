package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Projeto extends Conteudo {

    private int dificuldade;
    private LocalDate prazoEntrega;

    public Projeto(){}

    @Override
    public double calcularXp(){
        return XP_PADRAO * dificuldade + 15d;
    }


    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        if (dificuldade < 1 || dificuldade > 5) {
            throw new IllegalArgumentException("A dificuldade deve estar entre 1 e 5");
        }
        this.dificuldade = dificuldade;
    }

    public LocalDate getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(LocalDate prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dificuldade=" + dificuldade +
                ", prazoEntrega=" + prazoEntrega +
                '}';
    }
}
