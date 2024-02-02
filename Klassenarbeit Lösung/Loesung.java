public class Loesung {

    public static void main(String[] args) {
    //Eingabe
    int a; //Deklaration einer Variablen
    a=4; //Initialisieren -> einen Standardwert zuweisen

     double b=2.1; //Deklaration und Initialisierung
     double c=0, flaecheA=0;

    //Verarbeitung
    c=Math.sqrt(a*a+b*b);
    flaecheA = a*b/2;

    //Ausgabe
    System.out.println("---Berechnung Dreieick------");
    System.out.println("a:\t"+a+"cm");
    System.out.println("b:\t"+b+"cm");
    System.out.println("c:\t"+c+"cm");
    System.out.println();
    System.out.println("Flaeche:\t"+flaecheA);


}

}