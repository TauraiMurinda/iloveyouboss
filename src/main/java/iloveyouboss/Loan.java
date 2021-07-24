package iloveyouboss;

import java.util.Date;

public class Loan {
	private TermROC strategy;
	private float notional;
	private float outstanding;
	private int rating;
	private Date expiry;
	private CapitalStrategy capitalStrategy;
	private Date maturity;
	

	public Loan(float notional, float outstanding, int rating, Date expiry) {
		this.strategy = new TermROC();
		this.notional = notional;
		this.outstanding = outstanding;
		this.rating = rating;
		this.expiry = expiry;
	}

	public Loan(float notional, float outstanding, int rating, Date expiry, Date maturity) {
		this.strategy = new RevolvingTermROC();
		this.notional = notional;
		this.outstanding = outstanding;
		this.rating = rating;
		this.expiry = expiry;
		this.maturity = maturity;
	}

	public Loan(CapitalStrategy capitalStrategy, float notional, float outstanding, int rating, Date expiry, Date maturity) {
		this.capitalStrategy = capitalStrategy;
		this.notional = notional;
		this.outstanding = outstanding;
		this.rating = rating;
		this.expiry = expiry;
		this.maturity = maturity;
	}
}


