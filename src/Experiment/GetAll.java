
package Experiment;

import UE1_TodoLinkedList_Loesung.Node;
import UE1_TodoLinkedList_Loesung.TestTodoLinkedList;
import UE1_TodoLinkedList_Loesung.TodoLinkedList;

public class GetAll {
    public static void main(String[] args) {
        //Liste mit n Elementen anlegen
        TodoLinkedList liste = new TodoLinkedList();
        int n=400;      //Anzahl Elemente in Liste;
        for(int i=0;i<n;i++){
            liste.appendTodoText(Integer.toString(i));
        }
        //Zum Testen kann man die Liste ausgeben
        // TestTodoLinkedList.printLinkedList(liste);

        //Experiment:
        int middle = n/2;       //das ist die Position des Elements, das wir holen wollen

        long startzeit = System.currentTimeMillis();  //Liefert aktuelle Uhrzeit in ms retour, ist hier startwert des tests (--> Stoppuhr)
        for(int anzahl=0;anzahl<100000; anzahl++){ //liste.getFirst wird getestet, im zweiten Schritt wird mit for-Schleife die Aktion mehrfach hintereinander ausgeführt
            //Algoritmus Anfang (wir wollen einen mit Laufzeit o(n2)
            for(int idx=0; idx<n; idx++){
                String txt = liste.getTodoTextAtIndex(middle);      // durch for-Schleife bekommt es o(n2)
            }
            //Algorithmusende

        }
        long endezeit = System.currentTimeMillis();  //Liefert aktuelle Uhrzeit in ms retour, ist hier startwert des tests
        System.out.println("Zeitdauer: " + (endezeit-startzeit) +"ms");   //lassen uns ausgeben wie lange die Aktion dauert

    }


}

