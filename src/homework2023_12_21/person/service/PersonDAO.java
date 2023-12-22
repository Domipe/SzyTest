package homework2023_12_21.person.service;

import homework2023_12_21.person.entity.PersonEntity;

public interface PersonDAO {
	void add(PersonEntity personAdd);
	void delete(PersonEntity personDelete);
	void revise(PersonEntity personRevise);
	PersonEntity find(int personFind);
}