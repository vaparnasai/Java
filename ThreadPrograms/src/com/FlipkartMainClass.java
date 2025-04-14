package com;

public class FlipkartMainClass 
{
	public static void main(String[] args) {
		Flipkart f = new Flipkart();
		PaymentMode p = new PaymentMode("GooglePay", f);
		PaymentMode p1 = new PaymentMode("PhonePay", f);
		PaymentMode p2 = new PaymentMode("PayTm", f);
		p.start();
		p1.start();
		p2.start();
	}
}
