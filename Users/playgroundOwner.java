package Users;

public class playgroundOwner extends user {

	public playgroundOwner(int aID, String aUsername, String aPassword) {
		super(aID,aUsername,aPassword);
		this.setAccountType(account.playgroundOwner);
	}

	public boolean addplayground(String aName, String aLocation, double aSize, double aPrice) {
		throw new UnsupportedOperationException();
	}

	public void displaypersonalplaygrounds() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void displayMenu() {
		System.out.println("this is a playgroundOwner");
	}
}