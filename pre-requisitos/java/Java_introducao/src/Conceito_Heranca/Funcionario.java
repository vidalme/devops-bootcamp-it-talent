package Conceito_Heranca;

public abstract class Funcionario {

    public String nome;
    protected int idade;
    protected float salario;
    protected float bonus;
    public final int teste=20;
    protected float horaExtra(int h , int f){
        return (h*1.5f)+(f+2f);
    }
    public final void saudacao(){ // FINAL - o metodo não poed  ser overriden
        System.out.println("Ola, tudo bem?");
    }
}
