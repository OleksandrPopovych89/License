/*
There is a queue of 4 elements.
Put in it one more element - the number 5, and then get 2 items out of the queue.
Sample Input:
Sample Output:
[3, 4, 5]
Write a program, test using stdin → stdout

Є черга з чотирьох елементів.
Покладіть у неї ще один елемент - число "5", а потім візьміть 2 елементи з черги.
Приклад вводу:
Приклад виводу:
[3, 4, 5]
Написати програму, протестувати за допомогою стандартного вводу та стандартного виводу.
*/

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4));
        queue.add(5);
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue);
    }
}