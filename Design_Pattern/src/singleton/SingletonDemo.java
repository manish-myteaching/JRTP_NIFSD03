package singleton;

public class SingletonDemo implements Cloneable {

	public static SingletonDemo NEW_INSTANCE = null;

	private SingletonDemo() {
	}

	public static synchronized SingletonDemo getInstance() {
		if (NEW_INSTANCE == null) {
			NEW_INSTANCE = new SingletonDemo();
			return NEW_INSTANCE;
		}
		return NEW_INSTANCE;
	}

	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cloning is not supported..!");
	}

}
