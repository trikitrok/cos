package users;


import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;


public class RegistryShould {
	@Rule
	public JUnitRuleMockery context = new JUnitRuleMockery();

	@Test
	public void register_a_user () {
		final RegisteredUsers registeredUsers = context.mock(RegisteredUsers.class);
		final Registry registry = new Registry(registeredUsers);

		context.checking(new Expectations() {{
			oneOf (registeredUsers).add(new User("user_name"));
		}});

		registry.register("user_name");
	}

}
