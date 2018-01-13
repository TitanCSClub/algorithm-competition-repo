import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    private static HashMap<String, Item> items = new HashMap<>();
    private static TreeMap<String, Integer> rawIngredients = new TreeMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cases; i++) {
            String name = scanner.next();
            int ingredientsNumber = scanner.nextInt();
            Ingredient[] ingredientsArray = new Ingredient[ingredientsNumber];

            for (int y = 0; y < ingredientsArray.length; y++) {
                int count = scanner.nextInt();
                String ingredientName = scanner.next();
                Ingredient ingredient = new Ingredient(ingredientName, count);

                ingredientsArray[y] = ingredient;
            }
            items.put(name, new Item(name, ingredientsArray));
            scanner.nextLine();
        }

        for (String itemName : items.keySet()) {
            for (Ingredient ingredient : items.get(itemName).ingredients) {
                if (!items.containsKey(ingredient.name)) {
                    rawIngredients.put(ingredient.name, 0);
                }
            }
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.equals("GO")) {
                break;
            }

            System.out.println("[" + line + "]");
            TreeMap<String, Integer> totalIngredients = search(items.get(line), new TreeMap<>(rawIngredients));
            for (String itemName : totalIngredients.keySet()) {
                if (totalIngredients.get(itemName) != 0) {
                    System.out.println(itemName + " " + totalIngredients.get(itemName));
                }
            }
        }
    }

    private static TreeMap<String, Integer> search(Item item, TreeMap<String, Integer> ingredients) {
        for (Ingredient ingredient : item.ingredients) {
            if (ingredients.containsKey(ingredient.name)) {
                //System.out.println(item.name + " - " + ingredient.name + " - " + (ingredients.get(ingredient.name) + ingredient.count));
                ingredients.put(ingredient.name, ingredients.get(ingredient.name) + ingredient.count);
            } else {
                for (int i = 0; i < ingredient.count; i++) {
                    ingredients = search(items.get(ingredient.name), ingredients);
                }
            }
        }
        return ingredients;
    }

    private static class Item {
        String name;
        Ingredient[] ingredients;

        Item(String name, Ingredient[] ingredients) {
            this.name = name;
            this.ingredients = ingredients;
        }
    }

    private static class Ingredient {
        String name;
        int count;

        Ingredient(String name, int count) {
            this.name = name;
            this.count = count;
        }
    }
}
    