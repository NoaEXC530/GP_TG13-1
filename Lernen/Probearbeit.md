# Brückenhöhe

## Funktion
Mit dem Programm lässt sich die Brückenhöhe errechnen, anhand der Zeit und der Beschleunigung. 

## Formel
$s=\frac{1}{2}*a*t^2$

## Java-Programm
````
public class ProbearbeitRuben {


    public static void main(String[] args) {
        //Eingabe
            double a = 9.81; 
            double t = 1.5;
            double s = 0;
        //Verabreitung
            s=1/2*a*(t*t);
        //Ausgabe
            System.out.println("Die gebrauchte Zeit bertägt" + t + "Sekunden"."Dies entspricht einer Höhe von" + s + "Metern.");

    }
}
````
## Beispiel
Die Brückenhöhe beträgt bei einer Zeit von 2.3s eien Höhe von ... Metern.