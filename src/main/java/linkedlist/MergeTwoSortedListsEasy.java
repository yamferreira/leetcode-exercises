package linkedlist;

import java.util.LinkedList;

/**You are given the heads of two sorted linked lists list1 and list2.

 Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

 Return the head of the merged linked list.

 Example 1:


 Input: list1 = [1,2,4], list2 = [1,3,4]
 Output: [1,1,2,3,4,4]
 Example 2:

 Input: list1 = [], list2 = []
 Output: []
 Example 3:

 Input: list1 = [], list2 = [0]
 Output: [0]


 Constraints:

 The number of nodes in both lists is in the range [0, 50].
 -100 <= Node.val <= 100
 Both list1 and list2 are sorted in non-decreasing order.
 */


public class MergeTwoSortedListsEasy {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode();        //nó auxiliar
        ListNode current = dummy;               // aponta para o dummy

        while(list1 != null && list2 != null) { //enquanto as duas listas ainda tiverem elementos
            if(list1.val > list2.val) {         //se o valor da lista 1 for maior que o valor da lista 2:
                current.next = list2;           //liga o próximo nó da lista resultante ao nó atual da lista 2
                list2 = list2.next;             //ai a lista 2 avanca casa
            } else {                            //se nao
                current.next = list1;           //o proximo nó vai ser o valor da lista 1
                list1 = list1.next;             //e a lista 1 avanca uma casa
            }

            current = current.next;             //depois das condicionais o current vai passar a valer o proximo seja da lista 1 ou 2
        }

        current.next = (list1 != null) ? list1 : list2; //se a lista 1 for diferente de null current.next é igual a lista 1
                                                        // se nao ela é igual a lista dois

        return dummy.next;                              //retorna o dummy.next para pular o nó falso e mostrar a lista completa

    }
}
