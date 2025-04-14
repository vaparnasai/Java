package ListPrograms;

import java.io.Serializable;

public class Marker implements Serializable
{
	private String brand;
	private String colour;
	private int cost;
	public Marker() 
	{
		
	}
	public Marker(String brand, String colour, int cost) 
	{
		this.brand = brand;
		this.colour = colour;
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	public void display()
	{
		System.out.println("Brand :"+getBrand());
		System.out.println("Colour :"+getColour());
		System.out.println("Cost :"+getCost());
	}
	@Override
	public String toString() {
		return "Marker \n brand=" + brand + " \n colour=" + colour + " \n cost=" + cost + "\n-----------------------";
	}
	
}
