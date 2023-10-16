package bidding.House;



import java.util.List;
import java.util.Scanner;

/**
 * Manages the logic for the Real Estate Bidding App.
 */
class biddingLogic {
    private List<house> houses;
    private Scanner scanner;

    /**
     * Initializes the BiddingLogic with a list of houses.
     *
     * @param houses The list of houses available for bidding.
     */
    public biddingLogic(List<house> houses) {
        this.houses = houses;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Runs the Real Estate Bidding App, allowing users to place bids on houses.
     */
    public void runBiddingApp() {
        System.out.println("Welcome to the Real Estate Bidding App");

        while (true) {
            System.out.println("\nAvailable Houses:");
            for (int i = 0; i < houses.size(); i++) {
                house house = houses.get(i);
                System.out.println((i + 1) + ". " + house.getName() + " - Current Bid: $" + house.getCurrentBid() + " by " + house.getCurrentBidder());
            }

            System.out.print("Select a house to bid on (1-" + houses.size() + ") or enter 0 to exit: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            if (choice == 0) {
                System.out.println("Thank you for using the Bidding App. Goodbye!");
                break;
            } else if (choice >= 1 && choice <= houses.size()) {
                house selectedHouse = houses.get(choice - 1);
                System.out.print("Enter your name: ");
                String bidderName = scanner.nextLine();
                System.out.print("Enter your bid amount: $");
                double bidAmount = scanner.nextDouble();
                scanner.nextLine();  // Consume the newline character

                selectedHouse.placeBid(bidderName, bidAmount);
            } else {
                System.out.println("Invalid choice. Please select a valid house or enter 0 to exit.");
            }
        }

        scanner.close();
    }
}
