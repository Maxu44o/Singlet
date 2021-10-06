import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int listSize;
        int maxValue;
        int filtelValue;
        String sizeRequest = "Введите размер списка";
        String maxValueRequest = "Введите максимальное значение списка";
        String filterValueRequest = "Введите значение для фильтра";

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<Integer> startList = new ArrayList<>();

        System.out.println(sizeRequest);
        listSize = Integer.parseInt(scanner.nextLine());

        System.out.println(maxValueRequest);
        maxValue = Integer.parseInt(scanner.nextLine());

        System.out.println(filterValueRequest);
        filtelValue = Integer.parseInt(scanner.nextLine());

        Filter filter = new Filter(filtelValue);

        for (int i = 0; i < listSize; i++) {
            startList.add(i, random.nextInt(maxValue));
        }
        System.out.println("Случайный список");
        startList.stream().map(value -> value + " ").forEach(System.out::print);
        System.out.println();

        List<Integer> finalList = filter.filterOut(startList);
        System.out.println("Финальный список");
        finalList.stream().map(value -> value + " ").forEach(System.out::print);
        System.out.println();
        logger.log("Завершаем программу");
    }
}