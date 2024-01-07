/**
 * Dreieck
 */
public class Dreieck { 

    public static void main(String[] args) {

        //Eingabe
        double a = 3;
        double b = 4;
        double c = 5;

        double sinAlpha = b/c; //in Bogenmass
        double alpha = Math.toDegrees(Math.asin(sinAlpha));

        System.out.println("alpha:\t" + alpha);
        System.out.println("beta:\t"+(90-alpha));
        
    } 

    
}




