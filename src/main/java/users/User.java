package users;

public class User {
	private final String userName;

	private User (final String userName) {
		this.userName = userName;
	}

	static User from (final String userName) {
		return new User(userName);
	}

	@Override
	public boolean equals (final Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		final User user = (User) o;

		if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;

		return true;
	}

	@Override
	public int hashCode () {
		return userName != null ? userName.hashCode() : 0;
	}
}
