import java.util.*;

public class Main {
    static ArrayList<String> fruits = new ArrayList<>();
    static ArrayList<Double> prices = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        addRandomFruitsAndPrices(fruits, prices);

        while (true) {
            System.out.println(
                    line()+
                            "FRUITS MENU" +
                            line()+
                            "0 - EXIT\n" +
                            "1 - ADD FRUIT\n" +
                            "2 - LIST FRUITS\n" +
                            "3 - SHOW MOST EXPENSIVE FRUIT\n" +
                            "4 - CALCULATE AND LOG PRICES AVERAGE\n" +
                            "5 - LIST FRUITS WITH ABOVE AVERAGE PRICE\n" +
                            "6 - REMOVE FRUIT\n" +
                            "7 - CALCULATE AND LOG SUM OF PRICES\n" +
                            "8 - EDIT PRICE" +
                            line());
            String menu = scan.next();
            scan.nextLine();

            if (menu.equals("0")) {
                System.out.println("SEE YOU SOON!");
                break;
            }

            switch (menu) {
                case "1": addFruits();
                    break;
                case "2":
                    logFruits();
                    waitInput();
                    break;
                case "3": logMostExpensive();
                    break;
                case "4": logAveragePrice();
                    break;
                case "5": logPricesAboveAverage();
                    break;
                case "6": removeBlock();
                    break;
                case "7":
                    System.out.println("$ " + String.format("%.2f", sumPrices()));
                    waitInput();
                    break;
                case "8":
                    editPrice();
                    break;
                default:
                    System.out.println("---------INVALID ENTRY----------");
                    break;
            }
        }
    }

    private static void editPrice(){
        int indexToBeUpdated;
        logFruits();
        while (true) {
            System.out.println("CHOOSE THE FRUIT (INDEX):");
            try {
                indexToBeUpdated = scan.nextInt();
                scan.nextLine();

                if (indexToBeUpdated < 0 || indexToBeUpdated >= prices.size()) {
                    System.out.println("INVALID INDEX, TRY AGAIN");
                    continue;
                }

                while(true) {
                    System.out.println("ENTER NEW PRICE:");
                    try {
                        double newPrice = scan.nextDouble();
                        scan.nextLine();
                        if (newPrice <= 0){
                            System.out.println("INVALID PRICE");
                        } else {
                            prices.set(indexToBeUpdated, newPrice);
                            System.out.println("PRICE UPDATED SUCCESSFULLY!");
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("INVALID INPUT - PLEASE ENTER A NUMBER");
                    }
                }
                break;

            } catch (NumberFormatException e) {
                System.out.println("INVALID INDEX FORMAT, ENTER A NUMBER");
            }
        }
        waitInput();
    }

    private static double sumPrices() {
        double sum = 0;
        for (Double price : prices) {
            sum += price;
        }
        return sum;
    }

    private static void removeBlock() {
        String fruitToBeRemoved;
        logFruits();
        while (true) {
            System.out.println("TYPE THE NAME OF FRUIT TO BE REMOVED:");
            fruitToBeRemoved = scan.nextLine();

            int indexToRemove = getFruitIndexIgnoreCase(fruitToBeRemoved);

            if (indexToRemove == -1) {
                System.out.println("FRUIT NOT FOUND, TRY ANOTHER");
            } else {
                fruits.remove(indexToRemove);
                prices.remove(indexToRemove);
                System.out.println("FRUIT REMOVED SUCCESSFULLY!");
                break;
            }
        }
        waitInput();
    }

    private static int getFruitIndexIgnoreCase(String fruitName) {
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equalsIgnoreCase(fruitName)) {
                return i;
            }
        }
        return -1;
    }

    private static void logPricesAboveAverage() {
        double average = calculateAverage();
        logAveragePrice();
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) > average) {
                System.out.println(i + " - " + fruits.get(i) + " - $ " + String.format("%.2f", prices.get(i)));
            }
        }
        waitInput();
    }

    private static double calculateAverage() {
        double sum = 0;
        for (Double price : prices) {
            sum += price;
        }
        return sum/prices.size();
    }

    private static void logAveragePrice() {
        System.out.println("PRICES AVERAGE: $ " + String.format("%.2f", calculateAverage()));
        waitInput();
    }

    private static void waitInput() {
        System.out.println("Press ENTER to continue...");
        scan.nextLine();
    }

    private static void logMostExpensive() {
        Double mostExpensive = Collections.max(prices);
        int index = prices.indexOf(mostExpensive);
        System.out.println(index + " - " + fruits.get(index) + " - $ " + String.format("%.2f", mostExpensive));
        waitInput();
    }

    private static void logFruits() {
        System.out.println("----------FRUITS LIST-----------");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(i + " - " + fruits.get(i) + " - $ " + String.format("%.2f", prices.get(i)));
        }
    }

    private static void addFruits() {
        String fruitName;
        double fruitPrice;

        while (true) {
            System.out.println(line()+"FRUIT NAME: ");
            fruitName = scan.next();
            scan.nextLine();

            if (isNameDuplicate(fruitName)) {
                System.out.println("FRUIT ALREADY ADDED, TRY ANOTHER");
            } else if (fruitName.isEmpty()) {
                System.out.println("FRUIT NAME CANNOT BE EMPTY");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("---------------------------------\nFRUIT PRICE: $");
            try {
                fruitPrice = scan.nextDouble();
                scan.nextLine();

                if (fruitPrice <= 0) {
                    System.out.println("INVALID PRICE - THE PRICE SHOULD BE POSITIVE");
                } else {
                    break;
                }

            } catch (InputMismatchException e){
                System.out.println("INVALID PRICE FORMAT, ENTER A NUMBER");
            }
        }

        fruits.add(fruitName);
        prices.add(fruitPrice);
        System.out.println("FRUIT ADDED SUCCESSFULLY!");
    }

    private static void addRandomFruitsAndPrices(List<String> fruits, List<Double> prices) {
        String[] possibleFruits = {
                "Apple", "Banana", "Grapes", "Orange", "Pear",
                "Mango", "Peach", "Strawberry", "Pineapple", "Watermelon",
                "Cherry", "Kiwi", "Lemon", "Coconut", "Avocado"
        };

        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            String fruit = possibleFruits[i];
            double price = 1.0 + (9.0 * random.nextDouble()); // Random double between 1.0 and 10.0

            fruits.add(fruit);
            prices.add(price);
        }
    }

    private static boolean isNameDuplicate(String fruitName) {
        for (String fruit : fruits) {
            if (fruit.equalsIgnoreCase(fruitName)) {
                return true;
            }
        }
        return false;
    }

    public static String line(){
        String line = "\n-------------------------------";
        return line;
    }
}