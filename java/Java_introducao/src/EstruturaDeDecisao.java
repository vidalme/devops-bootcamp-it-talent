public class EstruturaDeDecisao {

    void media(int nota){
        if (nota >= 7){
            System.out.println("Alunoe aprovado");
        }else{
            System.out.println("Aluno esta reprovado");
        }
    }
    public static void main(String[] args) {

        new EstruturaDeDecisao().media(6);
        new EstruturaDeDecisao().media(9);
    }
}
