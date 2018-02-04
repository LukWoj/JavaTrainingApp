public class Computer {
	private String producer;
	private int model;

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public Computer(String producer, int model) {
		this.producer = producer;
		this.model = model;
	}

	@Override
	public String toString() {
		return producer + " " + model;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (!(obj instanceof Computer))
			return false;

		Computer comp = (Computer) obj;

		if (producer != null) {
			if (this.producer.equals(comp.getProducer()) && this.model == comp.getModel()) {
				return true;
			}
		}
		return false;
	}
}
