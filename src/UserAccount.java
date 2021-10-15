
public class UserAccount {

	public Person createPerson(String n, String e, String pno, String addr, String type) {
		Person p = null;

		if (type.equals("user")) {
			p = new User(n, e, pno,  addr);
		} else if (type.equals("sp")) {
			p = new ServiceProvider(n, e, pno,  addr);
		}
		return p;

}
}