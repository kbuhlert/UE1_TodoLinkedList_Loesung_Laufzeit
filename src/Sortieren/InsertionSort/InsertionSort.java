package Sortieren.InsertionSort;

public class InsertionSort {
//Setze Pointer und aktuelleKarte auf 2.Element der Datenstruktur;

//Prüfe: (Ist die aktuelle Karte kleiner als ihre Linke?)
//
//                Ja:           speichere den Inhalt von aktuelleKarte auf einem Helferlein;
//
//                                Setze LinksVonAktuell auf die Position von aktuelleKarte;
//
//                                Speichere den Inhalt von Helferlein auf LinksVonAktuell;
//
//                                Position LinksVonAktuell ist jetzt aktuelleKarte;
//
//                                Beginne wieder bei Prüfe ();

//                Nein:     Erhöhe die Position von Pointer und aktuelleKarte um 1;
//
//                                Beginne wieder bei Prüfe();

//Wenn Pointer.getNext = NULL => Stop;

    public static void sortieren (int[] daten){
        //Setze Ponter und aktuelleKarte auf 2.Element der Datenstruktur
        int pointer = 1;
        int aktuelleKarte = 1;
        //Prüfe. (Ist die aktuelle Karte kleiner als ihre Linke?)

        while (aktuelleKarte>=1 && pointer < daten.length) {  //bleiben in der Schleife, bis die überprüfte Karte an erster Position steht
            //Überprüfung, ob linke Karte kleiner ist, solange weiter machen (if-bedingung)
            if (daten[aktuelleKarte] < daten[aktuelleKarte - 1]) {
                //speichere den Inhalt von aktuellerKarte auf einem Helferlein
                int helferlein = daten[aktuelleKarte];
                //Setze Element von aktuellerKarte auf Eleemnt von LinkVonAktuell
                daten[aktuelleKarte] = daten[aktuelleKarte - 1];
                //Speichere den Inhalt von Helferlien auf LinksVomAktuell;
                daten[aktuelleKarte - 1] = helferlein;
                //Position LinksVonAktuell ist aktuelleKarte;
                aktuelleKarte--;
                //Beginne wieder bei Prüfe();
                //Überpfüfen ob aktuelle Karte an Position 0 ist, dann trotzdem nochmal weiter und Pointer versetzen
                if(aktuelleKarte==0){
                    pointer++;
                    aktuelleKarte = pointer;
                }
            }else {
                //Erhöhe die Position von Pointer um 1 und setze aktuelleKarte auf Pointer;
                pointer++;
                aktuelleKarte = pointer;
            }
        }
    }

    public static void main(String[] args) {
        int[] daten = {8,11,1,235,1,4,67,7,2,67};

        sortieren(daten);
        for(Integer i:daten){
            System.out.println(i);
        }

    }




}
