public class Document {
    private String number;
    private String date;
    private double amount;

    public Document(String number, String date, double amount) {
        this.number = number;
        this.date = date;
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void Show() {
        System.out.println("Number: " + number);
        System.out.println("Date: " + date);
        System.out.println("Amount: " + amount);
    }
}

