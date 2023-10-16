package bidding.House;

/**
 * Represents a house available for bidding in the Real Estate Bidding App.
 */
class house {
    private String name;
    private double price;
    private String currentBidder;
    private double currentBid;

    /**
     * Initializes a new house with the given name and price.
     *
     * @param name  The name of the house.
     * @param price The initial price of the house.
     */
    public house(String name, double price) {
        this.name = name;
        this.price = price;
        this.currentBidder = "No bids yet";
        this.currentBid = price;
    }

    /**
     * Gets the name of the house.
     *
     * @return The name of the house.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the price of the house.
     *
     * @return The price of the house.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets the name of the current bidder for the house.
     *
     * @return The name of the current bidder.
     */
    public String getCurrentBidder() {
        return currentBidder;
    }

    /**
     * Gets the current bid amount for the house.
     *
     * @return The current bid amount.
     */
    public double getCurrentBid() {
        return currentBid;
    }


    /**
     * Places a bid on the house.
     *
     * @param bidderName The name of the bidder.
     * @param bidAmount The amount of the bid.
     *
     */
    public void placeBid(String bidderName, double bidAmount) {
        if (bidAmount > currentBid) {
            currentBidder = bidderName;
            currentBid = bidAmount;
            System.out.println(bidderName + " placed a bid of $" + bidAmount + " on " + name);
        } else {
            System.out.println("Bid of $" + bidAmount + " is too low for " + name + ". Current bid is $" + currentBid);
        }
    }
}