package cliente;

public class Base {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.setNome("Andre");
        System.out.println(c.getNome());

        System.out.println("Seu consumo foi de: "+c.consumo);

        c.setAnoNascimento(1992);
        int an = c.getAnoNascimento();
        System.out.println("O ano de nascimento é:"+an);

        Cliente c2 = new Cliente();
        c2.setNome("Matilda");
        System.out.println(c2.getNome());

    }
}
