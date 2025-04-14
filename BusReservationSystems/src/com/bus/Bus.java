package com.bus;

import java.io.Serializable;

import toStringMethodPrograms.EmployeeValidation;

public class Bus implements Serializable
{
	private String busId;
	private String busName;
	private String route;
	private int seatCapacity;
	private int availableSeat;
	public Bus(){}
	public Bus(String busId, String route, int seatCapacity, int availableSeat) 
	{
		boolean busNameValidationStatus= BusValidation.busNameValidation(busName);
		if(busNameValidationStatus)
		{
			this.busName=busName;
		}
		else
		{
			System.err.println("invalid bus name.....");
		}
		this.busId = busId;
		this.route = route;
		this.seatCapacity = seatCapacity;
		this.availableSeat = availableSeat;
	}
	public String getBusId() {
		return busId;
	}
	public void setBusId(String busId) {
		this.busId = busId;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	public int getAvailableSeat() {
		return availableSeat;
	}
	public void setAvailableSeat(int availableSeat) {
		this.availableSeat = availableSeat;
	}
	public void bookSeat()
	{
		int bookSeat;
		boolean isAvailable=true;
		if(isAvailable=true)
		{
			bookSeat = availableSeat-1;
		}
		else
		{
			System.out.println("No available seats");
		}
	}
	public void cancelSeat()
	{
		int cancelSeat = availableSeat+1;
		System.out.println("Your seat is cancelled successfully");
	}
	public void getBusDetails()
	{
		System.out.println("Bus ID :"+getBusId());
		System.out.println("Bus Name :"+getBusName());
		System.out.println("Route :"+getRoute());
		System.out.println("Seat Capacity :"+getSeatCapacity());
		System.out.println("Available Seats :"+getAvailableSeat());
	}
	@Override
	public String toString() {
		return "Bus \nbusId=" + busId + "\n busName=" + busName + "\n route=" + route + "\n seatCapacity=" + seatCapacity
				+ "\n availableSeat=" + availableSeat + "";
	}
	
}
