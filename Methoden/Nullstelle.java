public class Nullstelle {


    public static void main(String[] args) {
        String nullstellen = berechneNullstelle(4,4,3,15);
        System.out.println(nullstellen);
    }

    private static String berechneNullstelle(double a, double b, double c, double d) {

        ausgabe(a,b,c,d);

        //Nullform
        c = c-d;
        d = 0;
        ausgabe(a,b,c,d);

        //Normalform
        b=b/a;
        c=c/a;
        a=1;
        ausgabe(a,b,c,d);

        //Diskriminante bestimmen
        double dis = (b*b/4)-c;

        //Fallunterscheidung für dis=0, dis<0, dis>0
        String ergebnis="";
        if (dis<0) {
            ergebnis = "es gibt keine Lösung";
        } else if(dis==0){
            double x = -b/2;
            ergebnis="x = "+x;

        } else{
            double x1 = -b/2 + Math.sqrt(dis);
            double x2 = -b/2 - Math.sqrt(dis);
            ergebnis="x1="+x1+"x2="+x2;
        }


        return "Lösung:"+ergebnis;
    }

    private static void ausgabe(double a, double b, double c, double d) {
        System.out.println(a+"x^2 +"+b+"x"+"+"+c+ "="+d);
    }


}
