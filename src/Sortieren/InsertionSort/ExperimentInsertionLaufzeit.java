package Sortieren.InsertionSort;


import java.util.Random;

public class ExperimentInsertionLaufzeit {

    public static void main(String[] args) {
        int[] daten = new int[100000];
        int[] daten2 = new int[100000];
        int[] daten3 = new int[50000];
        Random zufall = new Random();       //Random ist zufallsgenerator, der zufällige Zahlen generiert

        //Array befüllen Random Fall
        for (int i=0; i<daten.length;i++){
            daten[i] = zufall.nextInt();
        }

        //Array befüllen BestCase (sortiert)
        for (int i=0; i<daten2.length;i++){
            daten2[i] = i;
        }
        //Array befüllen WorstCase (falsch rum im Array)
        for (int i=0; i<daten3.length;i++){
            daten3[i] = 1000000 - i;
        }

        InsertionSort2 sorter = new InsertionSort2();

       // sorter.printMinMax(daten);
        long start = System.currentTimeMillis();
        sorter.sortieren(daten3);
        long stop = System.currentTimeMillis();
        System.out.println("Zeit (ms): " + (stop-start));

        sorter.printMinMax(daten);
    }
}
