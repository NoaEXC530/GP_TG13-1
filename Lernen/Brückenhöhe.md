# Brückenhöhe
Mit der Formel soll.....
## Formel
$h = \frac {1} {2}*a*(t*t)$
## Java-Programm
````
public class Probearbeit2ruben {
    public static void main(String[] args) {
        // Eingabe
            double a = 9.81;
            double t = 5.0;
            double h = 0;

        //Verarbeitung
            h = 0.5*a*(t*t);
        //Ausgabe
            System.out.println( " Gebrauchte Zeit " + t + "s. Dies entspricht der h von "  + h + "m");
    }
}
````
## Beispiel
Gebrauchte Zeit 2.3s. Dies entspricht der h von `25.947449999999996m`