package com;

public class PaymentMode extends Thread
{
	public String mode;
	Flipkart f;
	public PaymentMode(String mode, Flipkart f) 
	{
		this.mode = mode;
		this.f = f;
	}
	@Override
	public void run() 
	{
		f.payment(mode);
	}
	
}
