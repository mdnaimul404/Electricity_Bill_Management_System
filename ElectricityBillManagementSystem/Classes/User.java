package Classes;
import java.lang.*;
import Interfaces.*;
public class User extends person{
public class User implements IUserOperation
{
	private int userId;
	
	
	public User()
	{
		
	}
	public User(int userId);
	public void setUser(int userId)
	{
		this.userId=userId;
	}
	
	
	public int getUserId()
	{
		return userId;
	}
	
	
	public void showDetails()
	{	super.showDetails();
		System.out.println("User userId: " + userId);
		System.out.println();
	}
	private Meter meters[]=new Meter[100];
	public boolean insertMeter(Meter a)
	{
		boolean flag = false;
		for(int i=0; i<meters.length; i++)
		{
			if(meters[i] == null)
			{
				meters[i] = a;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeMeter(Meter a)
	{
		boolean flag = false;
		for(int i=0; i<meters.length; i++)
		{
			if(meters[i] == a)
			{ 
				meters[i] = null;
				flag = true;
				break;
			}
		}
		return flag;	
	}
	public void showAllMeter()
	{
		System.out.println("-_-_-_-_-_-_-_-_-_-_-");
		for(int i=0; i<meters.length; i++)
		{
			if(meters[i] != null)
			{
				meters[i].showDetails();
				System.out.println();
			}
		}
	}
	public Meter searchMeter(int MeterNumber)
	{
		Meter a = null;
		for(int i = 0; i<meters.length; i++)
		{
			if(meters[i] != null)
			{
				if(meters[i].getMeterNumber() == MeterNumber)
				{
					//System.out.println("Search id is working");
					a = meters[i];
					break;
				}
			}
		}
		return a;
	}
}

}

