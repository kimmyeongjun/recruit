
public class SingleTone {

	private static SingleTone instance;

	public SingleTone() {
	}

	public static synchronized SingleTone getInstance() {
		if (instance == null) {
			instance = new SingleTone();
		}
		return instance;
	}
}
