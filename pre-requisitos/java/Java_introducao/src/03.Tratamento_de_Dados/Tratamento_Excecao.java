
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratamento_Excecao {
    public static void main(String[] args) {
        String str = "ABC";
        String nome = null;
        Scanner scanner = new Scanner(System.in);

        try{
            int a = scanner.nextInt();
            int x = 10/0;
            System.out.println("Tamanho da string nome: "+nome.length());
            System.out.println(str.charAt(6));
        }
        catch( StringIndexOutOfBoundsException e ){
            System.out.println("Posição invalida");
        }
        catch( NullPointerException e){
            System.out.println("Nao existe nome digitado");
        }
        catch (InputMismatchException e){
            System.out.println("O Numero digfitado deve ser do tipo inteiro");
        }finally{
            System.out.println("Executando finally");
        }
    }
}
