import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Quarta {
    
    //4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
    //• SP – R$67.836,43
    //• RJ – R$36.678,66
    //• MG – R$29.229,88
    //• ES – R$27.165,48
    //• Outros – R$19.849,53
    //Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.  

    public static void main(String[] args) {
        Map<String, Double> data = new HashMap<>();
        data.put("SP", 67836.43);
        data.put("RJ", 36678.66);
        data.put("MG", 29229.88);
        data.put("ES", 27165.48);
        data.put("OUTROS", 19849.53);

        double sum = data.values().stream().mapToDouble(Double::doubleValue).sum();

        Map<String, Double> percentages = new LinkedHashMap<>();
        for (Map.Entry<String, Double> entry : data.entrySet()) {
            String state = entry.getKey();
            double value = entry.getValue();
            percentages.put(state, (value / sum) * 100);
        }

        // Exibindo os estados em ordem
        System.out.println("Porcentagens por estado:");
        percentages.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.printf("%s: %.2f%%\n", entry.getKey(), entry.getValue()));
    }
}
