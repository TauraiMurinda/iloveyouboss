package iloveyouboss;

import java.util.Date;

public class Loan1 {

	private TermROC strategy;
	private float notional;
	private float outstanding;
	private int rating;
	private Date expiry;
	private CapitalStrategy capitalStrategy;
	private Date maturity;

	public Loan1(float notional, float outstanding, int rating, Date expiry) {
		this(new TermROC(), notional, outstanding, rating, expiry, null);
	}

	public Loan1(float notional, float outstanding, int rating, Date expiry, Date maturity) {
		this(new RevolvingTermROC(), notional, outstanding, rating, expiry, maturity);
	}

	public Loan1(TermROC strategy, float notional, float outstanding, int rating, Date expiry, Date maturity) {
		this.strategy = strategy;
		this.notional = notional;
		this.outstanding = outstanding;
		this.rating = rating;
		this.expiry = expiry;
		this.maturity = maturity;
	}
}