import java.util.Arrays;
import java.text.NumberFormat;
import java.util.Locale;

public class Terceiro {

    //Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
    //O menor valor de faturamento ocorrido em um dia do mês;
    //O maior valor de faturamento ocorrido em um dia do mês;
    //Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
    
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        double[] faturamentoDiario = {22174.1664, 24537.6698, 26139.6134, 26742.6612,
            42889.2258, 46251.174, 11191.4722, 3847.4823, 373.7838, 2659.7563, 
            48924.2448, 18419.2614, 35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025,
            25681.8318, 1718.1221, 13220.495, 8414.61,0,0,0,0,0,0,0,0,}; 

        double[] faturamentoComFaturamento = Arrays.stream(faturamentoDiario)
                .filter(valor -> valor > 0.0)
                .toArray();

        double valorTotal = Arrays.stream(faturamentoComFaturamento).sum();
        double menorValor = Arrays.stream(faturamentoComFaturamento).min().orElse(0.0);
        double maiorValor = Arrays.stream(faturamentoComFaturamento).max().orElse(0.0);

        double somaFaturamento = Arrays.stream(faturamentoComFaturamento).sum();
        double mediaMensal = somaFaturamento / faturamentoComFaturamento.length;

        int diasAcimaMedia = 0;
        for (double valor : faturamentoComFaturamento) {
            if (valor > mediaMensal) {
                diasAcimaMedia++;
            }
        }

        String valorFormatadoTotal = formatoMoeda.format(valorTotal);
        String valorFormatadoMaior = formatoMoeda.format(maiorValor);
        String valorFormatadoMenor = formatoMoeda.format(menorValor);

        System.out.println("Valor total do faturamento: " + valorFormatadoTotal);
        System.out.println("Maior valor de faturamento: " + valorFormatadoMaior);
        System.out.println("Menor valor de faturamento: " + valorFormatadoMenor);
        System.out.println("Dias acima da média mensal: " + diasAcimaMedia);
    }
}
