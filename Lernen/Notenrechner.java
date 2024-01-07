public class Notenrechner{
    public static void main (String[] args){
        
        //Eingabe
        double note = 0.0;
        double punkteErreicht = 25.0;
        double punkteMaximal = 50.0;
        
        //Verarbeitung
        double m = -5.0; // Steigung (kann je nach Bedarf angepasst werden)
        double b = 6.0; // y-Achsenabschnitt (kann je nach Bedarf angepasst werden)
        note = m * (punkteErreicht / punkteMaximal) + b;
        
        //Ausgabe
        System.out.println(note);


    }


}