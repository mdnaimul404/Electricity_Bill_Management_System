package Classes;
import java.lang.*;
public class person
{
	
	private String name;
	private String address;
	
	public person(){}
	public person(String name,String address)
	{
		this.name=name;
		this.address=address;
		
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	
	
	public void showDetails()
	{
		
		System.out.println("Name       : " + name);
		System.out.println("Address    : " + address);
		System.out.println();
	}
}