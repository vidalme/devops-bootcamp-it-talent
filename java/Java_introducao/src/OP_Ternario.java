public class OP_Ternario {


    String maiorIdade(int idade){
        if(idade >= 18){
            return "maior de idade";
        }else{
            return "menor de idade";
        }
    }

    String coroa(int idade){
        return (idade>=50) ? "coroa" : "jovem";

    }

    public static void main(String[] args) {
        int ida_filha = 12;
        int ida_pai = 46;

        String w = new OP_Ternario().maiorIdade(ida_filha);
        System.out.println(w);

        String z = new OP_Ternario().coroa(ida_pai);
        System.out.println(z);

    }
}
