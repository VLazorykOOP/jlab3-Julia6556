public class Main {
    public static void main(String[] args) {
        // Create objects of Receipt, Invoice, and Bill
        Receipt receipt = new Receipt("R12345", "2023-04-17", 1000.0, "Andriy", "Maria");
        Invoice invoice = new Invoice("I56789", "2023-04-18", 2000.0, "Supplier A", new String[]{"Item 1", "Item 2", "Item 3"});
        Bill bill = new Bill("B98765", "2023-04-19", 1500.0, "Alice", new String[]{"Service 1", "Service 2", "Service 3"});

        // Create an array of Document objects
        Document[] documents = new Document[]{receipt, invoice, bill};

        // Print information about each document using the Show() method
        for (Document document : documents) {
            document.Show();
            System.out.println("-------------");
        }
    }
}
