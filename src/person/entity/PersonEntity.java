package person.entity;

import java.util.Date;
import java.util.StringJoiner;

public class PersonEntity {
	private String name;
	private int age;
	private Date birthday;
	private String gander;

	public PersonEntity() {
	}

	public PersonEntity(String name, int age, Date birthday, String gander) {
		this.name = name;
		this.age = age;
		this.birthday = birthday;
		this.gander = gander;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGander() {
		return gander;
	}

	public void setGander(String gander) {
		this.gander = gander;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", PersonEntity.class.getSimpleName() + "[", "]")
				.add("name='" + name + "'")
				.add("age=" + age)
				.add("birthday=" + birthday)
				.add("gander='" + gander + "'")
				.toString();
	}
}