package Sortieren.InsertionSort;

public class InsertionSort2 {

    //Herr Hollosi hat dann noch: der Klasse das Attribut int[] = daten zugefügt, alle Methoden nicht satatic gemacht, print-Methode zugefügt
    //Druck = for-Schleife aus der Main-Methode und ruft dann Methode mit einer Instanz von InsertionSort2 auf


    //Code Optimieren:
    public static void sortieren(int[] daten) {

        //äußere Schleife versetzt pointer, deshalb ist for-Schleife besser geeignet als while
        for (int pointer = 1; pointer<daten.length; pointer++) {
            karteAnKorektePosition(daten, pointer);
        }
    }

    //Methode heist eigentlich "insert" --> Name Insertion-Sort
    private static void karteAnKorektePosition(int[] daten, int aktuelleKarte) {
        //solange tauschen wie aktuelle Karte nicht erste Karte und die linke Karte größer, tasuche ich
        while (aktuelleKarte >= 1 && linksIstGroeszer(daten[aktuelleKarte], daten[aktuelleKarte - 1])) {
            if (daten[aktuelleKarte] < daten[aktuelleKarte - 1]) {
                //Tauschen wird raus genommen und als neue Methode gesetzt (Markieren + Refactor-->Extract Method)
                tauscheMitLinks(daten, aktuelleKarte);
                aktuelleKarte--;
            }
        }
    }

    private static boolean linksIstGroeszer(int i, int i2) {
        return i < i2;
    }

    private static void tauscheMitLinks(int[] daten, int aktuelleKarte) {
        int helferlein = daten[aktuelleKarte];
        //Setze Element von aktuellerKarte auf Eleemnt von LinkVonAktuell
        daten[aktuelleKarte] = daten[aktuelleKarte - 1];
        //Speichere den Inhalt von Helferlien auf LinksVomAktuell;
        daten[aktuelleKarte - 1] = helferlein;
        //Position LinksVonAktuell ist aktuelleKarte;
    }

    public void printMinMax(int[] daten){
        System.out.println("Min" + daten[0]);
        System.out.println("Min" + daten[daten.length-1]);
    }

    public static void main(String[] args) {
        int[] daten = {8, 11, 1, 235, 1, 4, 67, 7, 2, 67};

        sortieren(daten);
        for (Integer i : daten) {
            System.out.println(i);
        }
    }
}
