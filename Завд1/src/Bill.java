
public class Bill extends Document { //Підклас 3: Рахунок (Bill) (спадкоємець від Документ)
    private String recipient; //отримувач (String)
    private String[] services; //деталі рахунку

    public Bill(String number, String date, double amount, String recipient, String[] services) {
        super(number, date, amount);
        this.recipient = recipient;
        this.services = services;
    }

    public void Show() {
        super.Show();
        System.out.println("Recipient: " + recipient);
        System.out.println("Services: ");
        for (String service : services) {
            System.out.println("- " + service);
        }
    }
}