public class Invoice extends Document {
    private String supplier; //постачальник (String)
    private String[] goods; //товари (масив або список об'єктів класу Товар)

    public Invoice(String number, String date, double amount, String supplier, String[] goods) {
        super(number, date, amount);
        this.supplier = supplier;
        this.goods = goods;
    }

    public String getSupplier() {
        return supplier;
    }

    public String[] getGoods() {
        return goods;
    }

    public void Show() {
        super.Show();
        System.out.println("Supplier: " + supplier);
        System.out.println("Goods: ");
        for (String good : goods) {
            System.out.println("- " + good);
        }
    }
}


