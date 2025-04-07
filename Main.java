public class Main {
    public static void main(String[] args) {
        Payment Siti = new Payment("Siti", 3500000, "Kartu kredit");
        Siti.payMethod("Kartu kredit");
        Siti.showTransaction();

        System.out.println("\n");

        Payment Ciciripi = new Payment("Ciciripi", 10000000, "Voucher Diskon");
        Ciciripi.payMethod(15);
        Ciciripi.showTransaction();

        System.out.println("\n");

        Payment Asnawi = new Payment("Asnawi", 1200000, "Transfer bank");
        Asnawi.payMethod("Transfer bank");
        Asnawi.showTransaction();

    }
}