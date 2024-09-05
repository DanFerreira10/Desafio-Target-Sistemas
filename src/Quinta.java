public class Quinta {
    // 5) Escreva um programa que inverta os caracteres de um string.

    public static void main(String[] args) {
        String original = "Olá, é uma grande satisfação em te conhecer";
        String reverso = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverso += original.charAt(i);
        }

        System.out.println("String invertida: " + reverso);
    }
    
}
