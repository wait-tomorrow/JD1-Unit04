package by.htp.Aggregation.Task05;

import java.util.ArrayList;
import java.util.List;

public class VoucherLogic {

    public static List<Voucher> filterVouchers(VoucherRegister vr, Food food, Transport transport, int daysMin,
	    int daysMax) {
	List<Voucher> result = new ArrayList<Voucher>();

	for (Voucher voucher : vr.getVouchers()) {
	    if (voucher.getDays() < daysMin || voucher.getDays() > daysMax) {
		continue;
	    }

	    if (food != null && voucher.getFood() != food) {
		continue;
	    }

	    if (transport != null && voucher.getTransport() != transport) {
		continue;
	    }
	    
	    result.add(voucher);
	}

	return result;
    }
}
