package com.teste.LembreteDeContas;

public class Contas {
    private String conta;
    private double valor;
    private String vencimento;

    public Contas() {
    }

    public Contas(String conta, double valor, String vencimento) {
        this.conta = conta;
        this.valor = valor;
        this.vencimento = vencimento;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    @Override
    public String toString() {
        return "Conta: " + conta + " / Valor: $" + String.format("%.2f", valor) + " / Vencimento: " + vencimento;
    }
}
