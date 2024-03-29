public class Throw {

    float notas_f(float[] notas) throws IllegalArgumentException{
        float media=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>10 || notas[i]<0){
                throw new IllegalArgumentException();
            }
            media +=notas[i];
        }
        return media/notas.length;
    }
    public static void main(String[] args) {
        float notas[] = {10f,7f,5.3f,2.1f};
        try {
            float s = new Throw().notas_f(notas);
            System.out.println("A sua media é: " + s);
        }catch (IllegalArgumentException e){
            System.out.println("Nota invalida");
        }
    }
}
