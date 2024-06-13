package NoasZeug;

public class KAVor {

    final int MAX_TANKVOL = 80;
    double durchschnittsverbrauch = 9.3;
    double reichweite = 70;

    public static void main(String[] args) {

        final int MAX_TANKVOL = 80;
        double durchschnittsverbrauch = 9.3;
        double reichweite = 70;

        double literImtank = gibLiterImTank(durchschnittsverbrauch, reichweite);
        double d = round(literImtank);

        System.out.println("Liter im Tank über: "+d + " Liter");

    }

    public static double gibLiterImTank(double durchschnittsverbrauch, double reichweite) {

        double literImtank = (durchschnittsverbrauch * reichweite) / 100;
        return literImtank;
    }

    private static double round(double d) {
        d = d * 100;
        d = Math.round(d);
        d = d / 100;
        return d;
    }
