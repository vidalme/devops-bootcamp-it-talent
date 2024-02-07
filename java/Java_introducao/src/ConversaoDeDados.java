public class ConversaoDeDados {
    public static void main(String[] args) {
        String msg = "ola todos, como estao?";
        System.out.println(msg.length());
        System.out.println(msg.charAt(2));
        System.out.println(msg.equals("oi"));
        System.out.println(msg.equals("ola todos, como estao?"));
        System.out.println(msg.startsWith("ola"));
        System.out.println(msg.endsWith("tao?"));
        System.out.println(msg.substring(9));
        System.out.println(msg.substring(4,9));
        System.out.println(msg.replace("o", "x" ));
        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());
        String outra = "                                    outra mensagem                          ";
        System.out.println(outra);
        System.out.println(outra.trim());
    }
}
