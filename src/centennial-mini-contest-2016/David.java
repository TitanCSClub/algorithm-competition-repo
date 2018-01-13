import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        int cases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cases; i++) {
            String item = scanner.nextLine();
            items.add(new Item(item));
        }
        Collections.sort(items);
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).fullName);
        }
    }

    static class Item implements Comparable<Item> {
        String fullName;
        String fileName;
        String fileExtension;

        public Item(String fullName) {
            this.fullName = fullName;
            this.fileName = fullName.replaceFirst("the", "").substring(0, fullName.indexOf("."));
            this.fileExtension = fullName.substring(fullName.indexOf("."));
        }

        public int compareTo(Item item) {
            if (fileExtension.compareTo(item.fileExtension) == 0) {
                if (fileName.compareTo(item.fileName) > 0) {
                    return -1;
                } else if (fileName.compareTo(item.fileName) < 0) {
                    return 1;
                }
            }
            return fileExtension.compareTo(item.fileExtension);
        }
    }
}
    