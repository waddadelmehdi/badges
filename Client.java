public class Client {

    // Fields
    private String name;
    private String email;
    private String phoneNumber;

    // Constructor
    public Client(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Override toString method to display client information
    @Override
    public String toString() {
        return "Client[name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a client instance
        Client client = new Client("Alice Johnson", "alice@example.com", "+123556789");

        // Display client details
        System.out.println(client.toString());

        // Modify client's phone number
        client.setPhoneNumber("+987654321");

        // Display updated client details
        System.out.println("Updated client: " + client.toString());
    }
}
