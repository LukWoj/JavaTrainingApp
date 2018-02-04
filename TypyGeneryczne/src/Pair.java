
public class Pair<T, V> {
	private T t;
	private V v;

	public T getT() {
		return t;
	}

	private void setT(T t) {
		this.t = t;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}

	public Pair(T t, V v) {
		super();
		this.t = t;
		this.v = v;
	}

}
