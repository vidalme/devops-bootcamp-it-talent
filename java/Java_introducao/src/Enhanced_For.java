public class Enhanced_For {
    public static void main(String[] args) {
        int numeros[] = { 9 , 8 , 7 , 6 };
        System.out.println("normal");
        for ( int i=0 ; i<numeros.length ; i++ ){
            System.out.println(numeros[i]);
        }
        System.out.println();
        System.out.println("enhanced");
        for (int j:numeros){
            System.out.println(j);
        }

        char vogais[] = {'a','e','i','o','u'};
        for(char l: vogais){
            System.out.println(l);
        }

    }
}
