public class Notenrechner{
    public static void main (String[] args){
        
        //Eingabe
        double note = 0.0;
        double punkteErreicht = 53.0;
        double punkteMaximal = 80.0;
        
        //Verarbeitung
        double m = -5.0; 
        double b = 6.0; 
        note = m * (punkteErreicht / punkteMaximal) + b;
        
        //Ausgabe
        System.out.println("Sie haben" + punkteErreicht + "von" + punkteMaximal + "Punkten erreicht. Dies entspricht der Note:" + note);


    }


}