
    import javax.swing.plaf.synth.SynthTextAreaUI;

    public class Funcao {

        void olamundo() {
            System.out.println("ola mundo");
        }

        void olamundo(String nome) {
            System.out.println("ola " + nome);
        }

        String bomdia(){
            return "Bom dia";
        }

        String bom(String horadodia){
            return "Bom "+ horadodia;
        }

        Integer soma (int a, int b){
            return a+b;
        }

        public static void main(String[] args) {
            new Funcao().olamundo();
            new Funcao().olamundo("Andre");

            String bd = new Funcao().bomdia();
            System.out.println(bd);

            String bm = new Funcao().bom("tarde");
            System.out.println(bm);

            Integer sm = new Funcao().soma(2,2);
            System.out.println(sm);
        }
    }
