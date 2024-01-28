import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scan for the array size
        Scanner sizeOfArray = new Scanner(System.in);
        System.out.println("How many items do you expect to add to this list?");

        //Set the size of the array, pass it into the ItemHandler size
        int listSize = sizeOfArray.nextInt();
        ItemHandler itemHandler = new ItemHandler(listSize);

        int i = 0;
        while (i == 0) {
            //Scan for the selection
            Scanner userInput = new Scanner(System.in);
            //Prompt users for actions
            System.out.println("\nSelect an option from below:");
            System.out.println("1. Add an item to your list");
            System.out.println("2. Remove an item from your list");
            System.out.println("3. View the items in your list");
            System.out.println("4. Exit");
            int selection = userInput.nextInt();

            //Pass selection to the switch case
            switch (selection){
                case 1:
                    Scanner addItem = new Scanner(System.in);
                    System.out.println("\nEnter the item to be added, then hit enter.");
                    String itemAdd = addItem.nextLine();
                    itemHandler.addItem(itemAdd);
                    break;
                case 2:
                    Scanner removeItem = new Scanner(System.in);
                    System.out.println("\nEnter the item to be removed, then hit enter.");
                    String itemRem = removeItem.nextLine();
                    itemHandler.removeItem(itemRem);
                    break;
                case 3:
                    itemHandler.displayItems();
                    break;
                case 4:
                    i++;
                    break;
            }
        }
    }
}