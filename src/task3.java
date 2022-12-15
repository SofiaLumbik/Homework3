import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var list = new ArrayList<Double>();
        while (true) {
            var nextLine = in.nextLine();
            if (Objects.equals(nextLine, "quit")) break;
            list.add(Double.parseDouble(nextLine));
        }
        System.out.print("Исходный массив: ");
        for (var elem: list) System.out.print(elem + " ");
        System.out.print("\nМассив после обработки: ");
        var newlist = new ArrayList<Double>();
        newlist.add(list.get(0));
        for (int i = 1; i < list.size(); i++)
            if (list.get(i) > newlist.get(newlist.size() - 1))
                newlist.add(list.get(i));
        for (var elem: newlist) {
            System.out.print(elem + " ");
        }
        in.close();
    }
}