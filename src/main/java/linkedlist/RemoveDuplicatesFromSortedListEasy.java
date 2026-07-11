package linkedlist;

/**Given the head of a sorted linked list,
 * delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well

 Example 1:
 Input: head = [1,1,2]
 Output: [1,2]

 Example 2:
 Input: head = [1,1,2,3,3]
 Output: [1,2,3]
 */

public class RemoveDuplicatesFromSortedListEasy {
    public ListNode deleteDuplicate(ListNode head) {

        ListNode res = head;                                // guarda a referencia do inicio para retornar no final

        while (head != null && head.next != null) {         // enquanto o atual e O PROXIMO existirem continua lupando
            if (head.val == head.next.val) {                // se o valor do head atual for igual ao valor do proximo head
                head.next = head.next.next;                 // o proximo head pula para a outra casa
            } else {                                        // se o head atual nao for igual ao proximo head
                head = head.next;                           // o head que avanca uma casa
            }
        }

        return res;                                         //aqui retorna a lista sem os iguais
    }
}
