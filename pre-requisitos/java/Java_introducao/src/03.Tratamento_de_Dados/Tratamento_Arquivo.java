import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tratamento_Arquivo {
    public static void main(String[] args) {

        String caminhoArquivo = "C:\\Users\\andri\\OneDrive\\Área de Trabalho\\Teste.txt";
        //String caminhoArquivo = "C:\\Users\\andri\\.___myspace\\ti\\it_talent\\java\\Java_introducao\\src\\Teste.txt";
        try {
            FileReader arquivoReader = new FileReader(caminhoArquivo); //Destaca o caminho do arquivo a ser lido.
            BufferedReader leitor = new BufferedReader(arquivoReader); //Realiza a otimização da leitura do arquivo

            String linha;
            while((linha = leitor.readLine() )!=null){
                System.out.println(linha);
            }
            leitor.close();
        }catch( IOException e ){
            System.err.println("Ocoreu um erro na leitura dos seu arquivo");
        }
    }
}
