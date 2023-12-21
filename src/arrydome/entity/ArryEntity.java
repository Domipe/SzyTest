package arrydome.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ArryEntity {
		private ArrayList<String> plus;

	public ArryEntity() {
	}

	public ArryEntity(ArrayList plus) {
		this.plus = plus;
	}

	public List getPlus() {
		return plus;
	}

	public void setPlus(ArrayList plus) {
		this.plus = plus;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", ArryEntity.class.getSimpleName() + "[", "]")
				.add("plus=" + plus)
				.toString();
	}

	public void setPlus() {
	}
}