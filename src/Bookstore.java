import java.io.IOException;
import java.util.ArrayList;

public class Bookstore {

    private String name;
    private String address;
    private String sqFt;
    private String hasUsedBooks;
    private String openingTime;
    private String closingTime;
    private String daysOpen;
    private ArrayList<String> titles;

    // default bookstore constructor
    public Bookstore() {
        titles = new ArrayList<String>();
        loadTitles();
    }

    public Bookstore(String name, String address) {
        this.name = name;
        this.address = address;

        // all other members set here

        // init the array and then load it.
        titles = new ArrayList<String>();
        loadTitles();
    }

    public Bookstore(String name, String address, String sqFt, String hasUsedBooks, String daysOpen) {
        this.name = name;
        this.address = address;
        this.sqFt = sqFt;
        this.hasUsedBooks = hasUsedBooks;
        this.daysOpen = daysOpen;

        titles = new ArrayList<String>();
        loadTitles();
    }

    public Bookstore(String name, String address, String sqFt, String hasUsedBooks, String openingTime,
            String closingTime, String daysOpen) {
        this.name = name;
        this.address = address;
        this.sqFt = sqFt;
        this.hasUsedBooks = hasUsedBooks;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.daysOpen = daysOpen;

        titles = new ArrayList<String>();
        loadTitles();
    }

    public int getTotalBooks() {
        return titles.size();
    }

    public String getStoreName1() {
        return "The name of the bookstore is " + name;
    }

    public String getAddress1() {
        return "The address is " + address;
    }

    public String getSquareFeet1() {
        return "The bookstore is " + sqFt + " sqft.";
    }

    public String getOpeningTime1() {
        return "The store opens at " + openingTime;
    }

    public String getClosingTime1() {
        return "The store closes at " + closingTime;
    }

    public String getDaysOpen1() {
        return "The bookstore is open " + daysOpen;
    }

    public String getHasUsedBooks1() {
        return "Has used books? : " + hasUsedBooks;
    }

    public void getStoreName() {
        System.out.println("The name of the bookstore is " + name);
    }

    public void getAddress() {
        System.out.println("The address of " + name + " is " + address);
    }

    public void getSquareFeet() {
        System.out.println(name + " is  " + sqFt + " sqft.");
    }

    public void getHoursOfOperation() {
        System.out.println("Our hours of operation are " + openingTime + " - " + closingTime);
    }

    public void getOpeningTime() {
        System.out.println("The store opens at " + openingTime);
    }

    public void getClosingTime() {
        System.out.println("The store closes at " + closingTime);
    }

    public void daysOpen() {
        System.out.println(name + " is open " + daysOpen);
    }

    public void hasUsedBooks() {
        System.out.println("We sell both " + hasUsedBooks);
    }

    private void loadTitles() {
        try {
            Utils.loadStringsToArray(this.titles);
        } catch (IOException e) {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }

}