public class Primeira {
    // 1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
    // Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
    // Imprimir(SOMA);
    // Ao final do processamento, qual será o valor da variável SOMA?  RESPOSTA: 91

    public static void main(String[] args) throws Exception {
        
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k = k+1;
            soma = soma + k;
        }
        System.out.println(soma);
    }
}