import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {
        double faturamento_sp = 67836.43;
        double faturamento_rj = 36678.66;
        double faturamento_mg = 29229.88;
        double faturamento_es = 27165.48;
        double faturamento_outros = 19849.53;

        double faturamento_total = faturamento_sp + faturamento_rj + faturamento_mg + faturamento_es + faturamento_outros;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Percentual de representação de cada estado no faturamento mensal:");
        System.out.println("SP: " + df.format((faturamento_sp / faturamento_total) * 100) + "%");
        System.out.println("RJ: " + df.format((faturamento_rj / faturamento_total) * 100) + "%");
        System.out.println("MG: " + df.format((faturamento_mg / faturamento_total) * 100) + "%");
        System.out.println("ES: " + df.format((faturamento_es / faturamento_total) * 100) + "%");
        System.out.println("Outros: " + df.format((faturamento_outros / faturamento_total) * 100) + "%");
    }
}
