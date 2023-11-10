public class Quad2 {

    static double a,b,c,d;
    static String meldung;

    public static void main(String[] args) {

        // Formel eingeben 3x^2-5x+7=3
        // Form ax^2+bx+c=d
        a = 1;
        b = 8;
        c = -20;
        d = 0;
        ausgabe();

        // Nullform 3x^2-5x+4=0
        c = c - d;
        d = 0;
        ausgabe();

        // Normalenform x^2-5/3x+4/3=0
        b=b/a;
        c=c/a;
        a=1;
        ausgabe();

        // p-q Formel x_12 = -p/2+- Wurzel(p^2/4-q)
        // Diskriminante bestimmen dis = b^2/4-c
        double dis = b*b/4-c;


        // Fallunterscheidung
        if (dis<0) {
             // keine Lösung dis<0
            meldung = "es gibt keine Lösung";
        } else if (dis==0) {
             //eine Lösung dis = 0  -> x=-b/2
            meldung = "x1="+-b/2;
        } 
        else {
            //Für alle anderen Fälle
            //zwei Lösungen dis>0 -> x1=, x2=
            double x1 = -b/2 + Math.sqrt(dis);
            double x2 = -b/2 - Math.sqrt(dis);

            meldung ="x1="+x1+"\nx2="+x2;
        }       


       

        // eine Lösung dis = 0 -> x= -p/2

        // zwei Lösungen dis>0 -> x1=, x2=


        //Ausgabe
        System.out.println(meldung);
    }

    private static void ausgabe() {

        System.out.println(a + " x² +" + b + " x +" + c + "=" + d);

    }
}