package person;

import person.entity.PersonEntity;
import person.service.PersonDAO;
import person.service.impl.PersonDAOImpl;

public class PersonAPP {
	public static void main(String[] args) {
		PersonEntity personEntity = new PersonEntity();
		PersonDAO personDAO = new PersonDAOImpl();
		personEntity.setName("s");
		personDAO.add(personEntity);
		System.out.println(personDAO.find());
		personEntity.setAge(18);
		personDAO.revise(personEntity);
		personEntity.setGander("男");
		personDAO.add(personEntity);
		//personEntity.setBirthday();
		System.out.println(personDAO.find());
		personDAO.delete(personEntity);
	}
}