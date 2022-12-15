import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class task2 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            var list = new ArrayList<Integer>();
            int x;
            try {
                System.out.print("Число к удалению: ");
                x = in.nextInt();
                in.nextLine();
                System.out.println("Массив: ");
                while (true) {
                    String nextLine = in.nextLine();
                    if (Objects.equals(nextLine, "quit")) break;
                    int elem = Integer.parseInt(nextLine);
                    list.add(elem);
                }
            }
            catch (Exception e) {
                System.out.print("Ошибка: массив и число к удалению должны быть целыми");
                return;
            }
            System.out.print("Исходный массив: ");
            for (int i = 0; i < list.size(); i++) {
                int elem = list.get(i);
                System.out.print(elem + " ");
            }
            System.out.print("\nМассив после обработки: ");
            for (int elem1 : list) {
                if (elem1 != x)
                    System.out.print(elem1 + " ");
            }
            in.close();
        }
}
