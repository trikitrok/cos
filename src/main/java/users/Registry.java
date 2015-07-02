package users;


public class Registry {
	private final RegisteredUsers registeredUsers;

	public Registry (final RegisteredUsers registeredUsers) {
		this.registeredUsers = registeredUsers;
	}

	public void register (final String userName) {
		registeredUsers.add(new User(userName));
	}
}
