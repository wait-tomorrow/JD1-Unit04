package by.htp.Aggregation.Task05;

import java.util.ArrayList;
import java.util.List;

public class VoucherRegister {
    private List<Voucher> vouchers;

    public VoucherRegister() {
	vouchers = new ArrayList<Voucher>();
    }

    public List<Voucher> getVouchers() {
	return vouchers;
    }

    public void setVouchers(List<Voucher> vouchers) {
	this.vouchers = vouchers;
    }

    public void addVoucher(Voucher voucher) {
	vouchers.add(voucher);
    }

    @Override
    public String toString() {
	return "VoucherRegister [vouchers=" + vouchers + "]";
    }
}
