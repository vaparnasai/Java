package style3_programming_optimizing_topics_IOF;

class Contact
{
	public void ringtone()
	{
		System.out.println("Company ringtone...");
	}
}
class MotherContact extends Contact
{
	@Override
	public void ringtone()
	{
		System.out.println("Amma amma ne ...");
	}
}
class OtherContact extends Contact 
{
}
class FriendContact extends Contact
{
	@Override
	public void ringtone()
	{
		System.out.println("Telusaa manasaa ...");
	}
}
public class MainClass6 {
	public static void main(String[] args) {
		MotherContact mc = new MotherContact();
		OtherContact oc = new OtherContact();
		FriendContact fc = new FriendContact();
		mc.ringtone();
		oc.ringtone();
		fc.ringtone();
	}
}
