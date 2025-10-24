import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int getDegrees(List<Integer> list) {
        int result = 0;

        for (int i : list) {
            result += i;
        }

        return result % 360;
    }

    public static void main(String[] args) {
        File file = new File("src/main/resources/hyperskill-dataset-117300755.txt");

        try (Scanner scanner = new Scanner(file)) {
            String input = "";

            while (scanner.hasNext()) {
                input = scanner.nextLine();
            }

            List<Integer> list = new ArrayList<>();

            for (String s : input.split(",")) {
                list.add(Integer.parseInt(s));
            }

            System.out.println(getDegrees(list));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
