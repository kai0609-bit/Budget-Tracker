public class Transaction {
    // Properties
    private String id;
    private String description;
    private double amount;
    private String category;

    // Constructors
    Transaction (String id, String description, double amount, String category) {
        if (amount == 0) {
            throw new IllegalArgumentException("Amount cannot be zero");
        }
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("ID is required");
        }
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description is required");
        }

        this.id = id;
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    // Getters
    public String getId() {return id; }
    public String getDescription() {return description; }
    public double getAmount() {return amount; }
    public String getCategory() {return category; }
}