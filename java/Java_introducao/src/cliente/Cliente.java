package cliente;

public class Cliente {
    private String nome;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    protected float consumo = 1090f;

    private int anoNascimento=0;
    // Get e Set
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        if((anoNascimento < 1960) || (anoNascimento > 2005)) {
            System.out.println("erro");
        }
        this.anoNascimento = anoNascimento;
    }
}

// Public -> nao realiza restricao de acesso a variaveis e/ou metodos
// Private -> restringe o acesso a variaveis e metodos ao escopo da Classe
// Protected -> escopado no projeto