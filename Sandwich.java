class Sandwich {
    private String bread;
    private String cheese;
    private String ham;
    private String lettuce;
    private String tomato;
    private String secretSauce;

    // Basic Sandwich: Bread and Cheese
    public Sandwich(String bread, String cheese) {
        this(bread, cheese, null, null, null, null); // Calls Deluxe Sandwich constructor with null for ham, lettuce, tomato, and secretSauce
        System.out.println("Making a Basic Sandwich");
    }

    // Deluxe Sandwich: Bread, Cheese, and Ham
    public Sandwich(String bread, String cheese, String ham) {
        this(bread, cheese, ham, null, null, null); // Calls Super Sandwich constructor with null for lettuce, tomato, and secretSauce
        System.out.println("Making a Deluxe Sandwich");
    }

    // Super Sandwich: Bread, Cheese, Ham, Lettuce, and Tomato
    public Sandwich(String bread, String cheese, String ham, String lettuce, String tomato) {
        this(bread, cheese, ham, lettuce, tomato, "Special Mayo"); // Calls the most complete constructor with secretSauce
        System.out.println("Making a Super Sandwich");
    }

    // Most Complete Constructor: All Ingredients
    public Sandwich(String bread, String cheese, String ham, String lettuce, String tomato, String secretSauce) {
        // Validation: Ensure at least bread and cheese are present
        if (bread == null || bread.isEmpty() || cheese == null || cheese.isEmpty()) {
            throw new IllegalArgumentException("A sandwich must have bread and cheese!");
        }

        this.bread = bread;
        this.cheese = cheese;
        this.ham = ham;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.secretSauce = secretSauce;
        System.out.println("Adding all ingredients");
    }

    // Getters (omitted for brevity)

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", cheese='" + cheese + '\'' +
                ", ham='" + ham + '\'' +
                ", lettuce='" + lettuce + '\'' +
                ", tomato='" + tomato + '\'' +
                ", secretSauce='" + secretSauce + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Sandwich basic = new Sandwich("Wheat", "Cheddar");
        System.out.println("Basic Sandwich: " + basic);

        Sandwich deluxe = new Sandwich("Rye", "Swiss", "Black Forest Ham");
        System.out.println("Deluxe Sandwich: " + deluxe);

        Sandwich superSandwich = new Sandwich("Sourdough", "Provolone", "Italian Ham", "Romaine", "Heirloom Tomato");
        System.out.println("Super Sandwich: " + superSandwich);

        // Example of validation
        try {
            Sandwich invalid = new Sandwich(null, null); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
