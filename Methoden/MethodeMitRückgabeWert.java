/**
 * MethodeMitRückgabeWert
 */
public class MethodeMitRückgabeWert {

    public static void main(String[] args) {
        
        

        double diff = berechneDiff(4.8,3.2);
        System.out.println("Differenz:"+diff);

    }

    private static double berechneDiff(double a, double b) {
        return a-b;
    }

    
}