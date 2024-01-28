import java.util.Arrays;

public class ItemHandler {
    private Item[] items;

    //Initialize the array with a given size
    public ItemHandler(int size) {
        items = new Item[size];
    }

    //Add an item to the array
    public void addItem(String itemName) {
        int index = findAvailableIndex();
        if (index != -1) {
            items[index] = new Item(itemName);
            System.out.println("Item added!");
        } else {
            System.out.println("The list is full. Cannot add item.");
        }
    }

    //Remove an item from the array by name
    public void removeItem(String itemName) {
        int index = findItemIndex(itemName);
        if (index != -1) {
            items[index] = null;
            System.out.println("Item removed!");
        } else {
            System.out.println("Item not found. Cannot remove item.");
        }
    }

    //Display all items in the array
    public void displayItems() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("Items in the list:");
            for (Item item : items) {
                if (item != null) {
                    System.out.println(item.getItemName());
                }
            }
        }
    }

    //Find the first available index in the array
    private int findAvailableIndex() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                return i;
            }
        }
        return -1; //No available index found
    }

    //Find the index of an item by name
    private int findItemIndex(String itemName) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getItemName().equals(itemName)) {
                return i;
            }
        }
        return -1; //Item not found
    }

    //Check if the list is empty
    private boolean isEmpty() {
        for (Item item : items) {
            if (item != null) {
                return false;
            }
        }
        return true;
    }

    //Simple class representing an item
    private static class Item {
        private String itemName;

        public Item(String itemName) {
            this.itemName = itemName;
        }

        public String getItemName() {
            return itemName;
        }
    }
}