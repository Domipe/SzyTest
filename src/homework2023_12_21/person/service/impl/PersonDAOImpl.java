package homework2023_12_21.person.service.impl;

import homework2023_12_21.person.entity.PersonEntity;
import homework2023_12_21.person.service.PersonDAO;

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
	public PersonEntity find(int personFind) {
		return null;
	}


}