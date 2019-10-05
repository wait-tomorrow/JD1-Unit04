package by.htp.Aggregation.Task05;

import java.util.List;

/*
 * 5. Туристические путевки. 
 * Сформировать набор предложений клиенту по выбору туристической путевки 
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) 
 * для оптимального выбора. Учитывать возможность выбора транспорта, 
 * питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Task05 {

    public static void main(String[] args) {
	VoucherRegister voucherRegister = new VoucherRegister();

	voucherRegister.addVoucher(new Voucher(Food.ALL_INCLUSIVE, Transport.AIRPLANE, TravelType.REST, "Egypt", 7));
	voucherRegister.addVoucher(new Voucher(Food.ALL_INCLUSIVE, Transport.AIRPLANE, TravelType.REST, "Turkey", 10));
	voucherRegister.addVoucher(new Voucher(Food.BREAKFAST, Transport.BUS, TravelType.EXCURSION, "Paris", 10));
	voucherRegister.addVoucher(new Voucher(Food.BREAKFAST, Transport.TRAIN, TravelType.REST, "Russia", 10));

	printVouchers(voucherRegister.getVouchers());
	
	System.out.println("\nПоиск путёвки (самолёт, от 8 до 12 дней):");
	printVouchers(VoucherLogic.filterVouchers(voucherRegister, null, Transport.AIRPLANE, 8, 12));
    }

    private static void printVouchers(List<Voucher> vouchers) {
	for (Voucher voucher : vouchers) {
	    System.out.println(voucher);
	}
    }
}
