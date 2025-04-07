import java.text.DecimalFormat;

public class Payment {
    private String name;
    private double totalPrice;
    private String paymentMethod;
    private String paymentStatus;
    private double discountPrice = 0;
    private int discount;

    public Payment(String name, double totalPrice, String paymentMethod) {
        this.name = name;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
    }

//    Credit Card and Bank Transfer
    public void payMethod(String method) {
        this.paymentMethod = method;
        this.paymentStatus = "Pembayaran Berhasil dengan " + method;
    }

//    Voucher Diskon
    public double payMethod(int discount) {
        this.discount = discount;
        discountPrice = totalPrice - (100 / discount);
        this.paymentStatus = "Pembayaran Berhasil dengan " + this.paymentMethod;

        return discountPrice;
    }

    public void showTransaction() {
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Name : " + name);
        System.out.println("Total harga sebelum diskon : Rp" + df.format(totalPrice));

        if(discountPrice != 0) {
            System.out.println("Voucher diskon : " + discount + "%");
        }

        System.out.println("Metode pembayaran : " + paymentMethod);
        System.out.println("Status Pembayaran : " + paymentStatus);
    }
}
