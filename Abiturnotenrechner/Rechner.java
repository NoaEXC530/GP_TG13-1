package Abiturnotenrechner;

class Rechner {

    




    public static void main(String[] args) {
    //Eingabe
        int pErr=113, pMax=120, abiNP=0;

    //Verarbeitung
        abiNP = berechneAbinote(pErr,pMax);

    //Ausgabe
        System.out.println(abiNP);

    }
        
    
    private static int berechneAbinote(int pErr, int pMax) {

            //Eingabe
            int berechneteNote = -99;

            //Verarbeitung
            if(pErr<0) return -1;
            if(pMax!=120) return -1;
            if(pErr>pMax) return -1;

            if(pErr<=23) berechneteNote = 0;
            else if(pErr<=31) berechneteNote = 1;
            else if(pErr<=40) berechneteNote = 2;
            else if(pErr<=48) berechneteNote = 3;
            else if(pErr<=54) berechneteNote = 4;
            else if(pErr<=60) berechneteNote = 5;
            else if(pErr<=66) berechneteNote = 6;
            else if(pErr<=72) berechneteNote = 7;
            else if(pErr<=78) berechneteNote = 8;
            else if(pErr<=84) berechneteNote = 9;
            else if(pErr<=90) berechneteNote = 10;
            else if(pErr<=96) berechneteNote = 11;
            else if(pErr<=102) berechneteNote = 12;
            else if(pErr<=108) berechneteNote = 13;
            else if(pErr<=114) berechneteNote = 14;
            else berechneteNote = 15;
            
            //Rückgabe
            return berechneteNote;


        }


}