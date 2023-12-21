package person.service.impl;

import person.entity.PersonEntity;
import person.service.PersonDAO;

public class PersonDAOImpl implements PersonDAO {
	private PersonEntity personEntity;
	@Override
	public void add(PersonEntity personAdd) {
		personEntity = personAdd;
		System.out.println("添加成功");
	}

	@Override
	public void delete(PersonEntity personDelete) {
		personEntity = null;
		System.out.println("删除成功");
	}

	@Override
	public void revise(PersonEntity personRevise) {
		personEntity = personRevise;
		System.out.println("编辑成功");
	}

	@Override
	public PersonEntity find() {
		return personEntity;
	}

}