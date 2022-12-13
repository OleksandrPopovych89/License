/*
The average value
Given the sequence of integers, ending with number 0. Find the average value of all elements in this sequence.
The number 0 itself is not included into the sequence and serves just as a sign of cessation.
Sample Input:
1
7
9
0
Sample Output:
5.66666666667
Write a program, test using stdin → stdout


Середнє значення
Дано послідовність цілих чисел, що закінчується числом "0".
Знайти середнє значення всіх елементів цієї послідовності.
Сама цифра 0 не входить в ряд і служить лише знаком припинення.

Приклад вводу:
1
7
9
0
Приклад виводу:
5.66666666667
Написати програму, протестувати за допомогою стандартного вводу та стандартного виводу.

 */

import java.util.*;

public class Main4 {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int temp = scanner.nextInt();
            if (temp != 0) {
                list.add(temp);
            } else {
                System.out.println(list.stream().mapToInt(i -> i).average().orElse(0));
                break;
            }
        }
    }
}
