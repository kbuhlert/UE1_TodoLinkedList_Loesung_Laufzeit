
package Experiment;

import UE1_TodoLinkedList_Loesung.Node;
import UE1_TodoLinkedList_Loesung.TestTodoLinkedList;
import UE1_TodoLinkedList_Loesung.TodoLinkedList;

    public class GetMiddle {
        public static void main(String[] args) {
            //Liste mit n Elementen anlegen
            TodoLinkedList liste = new TodoLinkedList();
            int n=20000;      //Anzahl Elemente in Liste;
            for(int i=0;i<n;i++){
                liste.appendTodoText(Integer.toString(i));
            }
            //Zum Testen kann man die Liste ausgeben
            // TestTodoLinkedList.printLinkedList(liste);

            //Experiment:
            int middle = n/2;       //das ist die Position des Elements, das wir holen wollen

            long startzeit = System.currentTimeMillis();  //Liefert aktuelle Uhrzeit in ms retour, ist hier startwert des tests (--> Stoppuhr)
            for(int anzahl=0;anzahl<100000; anzahl++){ //liste.getFirst wird getestet, im zweiten Schritt wird mit for-Schleife die Aktion mehrfach hintereinander ausgeführt
                String txt = liste.getTodoTextAtIndex(middle);      //Liste.getTodoTextAt hat Laufzeit O(n) (verdoppelt sich bei doppelt so vielen Elementen
            }
            long endezeit = System.currentTimeMillis();  //Liefert aktuelle Uhrzeit in ms retour, ist hier startwert des tests
            System.out.println("Zeitdauer: " + (endezeit-startzeit) +"ms");   //lassen uns ausgeben wie lange die Aktion dauert

    }


}
