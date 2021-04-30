
public class UserManager {
	public void Add(User user) {
		System.out.println("Kullanýcý Baþarýyla Eklendi " + user.name);

	}

	public void Delete(User user) {
		System.out.println("Kullanýcý Baþarýyla Silindi " + user.name);

	}

	public void Update(User user) {
		System.out.println("Kullanýcý Baþarýyla Güncellendi " + user.name);

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
