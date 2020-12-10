package pl.wsb.students.course.view;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private final HashMap<String, MenuItem> menuItems = new HashMap<>();

    public void addMenuItem(String keyToPress, String name, Runnable action) {
        menuItems.put(
                keyToPress,
                new MenuItem(
                        keyToPress,
                        name,
                        action
                )
        );
    }
    public void handleAction(String keyPressed) {
        if (keyPressed == null) {
            System.err.println("Please, select one of the menu options...");
            return;
        }
        if (!menuItems.containsKey(keyPressed)) {
            System.err.println("Please, select one of the menu options...");
            return;
        }
        menuItems.get(keyPressed).execute();
    }
    public void printMenu() {
        if (menuItems.size() == 0) {
            System.err.println("No menu items provided...");
            return;
        }

        System.out.printf("%s%n", "---- Main menu ----");
        for (Map.Entry<String, MenuItem> set : menuItems.entrySet()) {
            System.out.printf("%s%n", set.getValue().generateText());
        }
    }
}
