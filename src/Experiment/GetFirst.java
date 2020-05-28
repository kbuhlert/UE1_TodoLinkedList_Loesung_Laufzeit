package Experiment;

import UE1_TodoLinkedList_Loesung.Node;
import UE1_TodoLinkedList_Loesung.TestTodoLinkedList;
import UE1_TodoLinkedList_Loesung.TodoLinkedList;

public class GetFirst {
    public static void main(String[] args) {
        //Liste mit n Elementen anlegen
        TodoLinkedList liste = new TodoLinkedList();
        int n=1000;
        for(int i=0;i<n;i++){
        liste.appendTodoText(Integer.toString(i));
        }
        //Zum Testen kann man die Liste ausgeben
        // TestTodoLinkedList.printLinkedList(liste);

        //Experiment:
        long startzeit = System.currentTimeMillis();  //Liefert aktuelle Uhrzeit in ms retour, ist hier startwert des tests (--> Stoppuhr)
        for(int anzahl=0;anzahl<1000000; anzahl++){ //liste.getFirst wird getestet, im zweiten Schritt wird mit for-Schleife die Aktion mehrfach hintereinander ausgeführt
        Node start = liste.getFirst();      //Liste.getFirst hat O(1)-Notation, abhängig
        }
        long endezeit = System.currentTimeMillis();  //Liefert aktuelle Uhrzeit in ms retour, ist hier startwert des tests
        System.out.println("Zeitdauer: " + (endezeit-startzeit));   //lassen uns ausgeben wie lange die Aktion dauert

    }
}
