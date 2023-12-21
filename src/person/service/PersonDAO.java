package person.service;

import person.entity.PersonEntity;

public interface PersonDAO {
	void add(PersonEntity personAdd);
	void delete(PersonEntity personDelete);
	void revise(PersonEntity personRevise);
	PersonEntity find();

}