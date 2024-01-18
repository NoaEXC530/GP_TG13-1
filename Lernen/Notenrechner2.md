# Notenrechner
### Beschreibung der Funktion 
Das Programm Notenrechner dient zur Berechnung der Noten aus der erreichtenPunktzahl und der maximalenPunktzahl. 

## Formel
$ note = m * \frac {punkteErreicht} {punkteMaximal} + b $
## Java-Programm
````
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
        System.out.println("Sie haben" + punkteErreicht + "von" + punkteMaximal + "Punkten erreicht. Dies entspricht der Note:" + note);


    }


}
````
## Beispiel
Sie haben 53.0 von 80.0 Punkten erreicht. Dies entspricht der Note: `2.6875`


hallo 