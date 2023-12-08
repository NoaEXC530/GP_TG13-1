# Mathe 2

## Konstanten
Die Konstante Eulerzahl $e$ und die Konstante $\pi$ sind in der Klasse `Math` hinterlegt.

Um die Klasse `Math` zu verwenden muss sie mit
````java
import java.util.Scanner;
````
zuerst importiert werden.


Die Konstante werden statisch über den Klassennamen aufgerufen.
````java
System.out.println("Euelerzahl: "+Math.E);
System.out.println("Pi :"+Math.PI);
````

## Potenzieren
In der Klasse `Math` erlaubt die Methode `Math.pow(a,b)` die Operation $a^b$.
````java
 System.out.println("--------------------");
 System.out.println("e^2 soll berechnet werden");
 double ex = Math.pow(Math.E, 2); 
 System.out.println("e^2 ="+ex);
````

## Exponentialschreibweise von Zahlen
In java können Zahlen in Exponential-Schreibweise erfasst werden.

````java
double qe = 1.6E-19;
System.out.println("Ladung eines Elektrons "+qe);
````

## Winkelfunktionen
Winkelfunktionen sind in der Klasse `Math` enthalten. Allerdings rechnen diese in Java mit dem Bogenmass.

````java
//65 Grad im Bogenmass
double d = Math.toRadians(65);

//Berrechnet den sin,cos tan im Bogenmass
double sin = Math.sin(d);
double cos = Math.cos(d);
double tan = Math.tan(d);

//Berechnet den Winkel aus einem Bogenmass
System.out.println(Math.toDegrees(Math.asin(sin)));
System.out.println(Math.toDegrees(Math.acos(cos)));
System.out.println(Math.toDegrees(Math.atan(tan)));
````

### Beispiel
Wir haben ein rechtwinkliges Dreieck mit den Seitenlängen $a=3cm$, $b=4cm$ und $c=5cm$. Berechne den Winkel $\alpha$ mit Sinus, Kosinus und Tangens. Berechne im Anschluss die Winkelgröße von $\beta$.

![Bild Dreieck](winkelfunktionen-beispiel-1.png)

#### Lösung:
````java
 //Eingabe
 double a = 3;
 double b = 4;
 double c = 5;

 double sinAlpha = b/c; //im Bogenmass
 double alpha = Math.toDegrees(Math.asin(sinAlpha));
      
 System.out.println("alpha:\t"+alpha);
 System.out.println("beta:\t"+(90-alpha));
````