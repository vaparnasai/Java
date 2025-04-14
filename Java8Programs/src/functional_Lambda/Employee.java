package functional_Lambda;

public interface Employee
{
	void login();
	void work();
	void sal();
	void logout();
	default void bonus()
	{
		
	}
}
