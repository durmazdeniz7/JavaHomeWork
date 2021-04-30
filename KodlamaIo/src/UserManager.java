
public class UserManager {
	public void Add(User user) {
		System.out.println("Kullan�c� Ba�ar�yla Eklendi " + user.name);

	}

	public void Delete(User user) {
		System.out.println("Kullan�c� Ba�ar�yla Silindi " + user.name);

	}

	public void Update(User user) {
		System.out.println("Kullan�c� Ba�ar�yla G�ncellendi " + user.name);

	}

	public void multipleAdd(User[] users) {
		for (User user : users) {
			Add(user);
		}
	}

	public void multipleDelete(User[] users) {
		for (User user : users) {
			Delete(user);
		}
	}

	public void multipleUptade(User[] users) {
		for (User user : users) {
			Update(user);
		}
	}

}
