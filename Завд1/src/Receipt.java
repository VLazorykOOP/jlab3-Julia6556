public class Receipt extends Document {
    private String recipient; //отримувач (String)
    private String payer; //платник (String)

    public Receipt(String number, String date, double amount, String recipient, String payer) {
        super(number, date, amount);
        this.recipient = recipient;
        this.payer = payer;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getPayer() {
        return payer;
    }

    public void Show() {
        super.Show();
        System.out.println("Recipient: " + recipient);
        System.out.println("Payer: " + payer);
    }
}

