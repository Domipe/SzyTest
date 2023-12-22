package homework2023_12_21.person.service.singleton;


import homework2023_12_21.person.entity.PersonEntity;
import homework2023_12_21.person.service.PersonDAO;

import java.util.HashMap;

public class PersonSingleton implements PersonDAO {
	private static PersonSingleton personSingleton;
	private static HashMap<Integer, PersonEntity> map = new HashMap<>();

	public PersonSingleton() {
	}

	public synchronized static PersonSingleton getPersonSingleton() {
		if (personSingleton == null) {
			personSingleton = new PersonSingleton();
		}
		return personSingleton;
	}


	public void add(PersonEntity personAdd) {
		//判断key是否为空
		if (!map.containsKey(personAdd.getId())) {
			map.put(personAdd.getId(), personAdd);
			System.out.println("添加成功");
		} else {
			System.out.println("相同ID的人已存在，重新添加");
		}
	}

	@Override
	public void delete(PersonEntity personDelete) {
		//判断key是否为空
		if (map.containsKey(personDelete.getId())) {
			map.remove(personDelete.getId());
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}
	}

	@Override
	public void revise(PersonEntity personRevise) {
		//判断key是否为空
		if (map.containsKey(personRevise.getId())) {
			map.put(personRevise.getId(), personRevise);
			System.out.println("修改成功");
		} else {
			System.out.println("修改失败");
		}
	}


	@Override
	public PersonEntity find(int personFind) {
		//遍历hashmap
		for (PersonEntity person : map.values()) {
			//判断key是否为空
			if ( map.containsKey(personFind)) {
				return person; // 找到匹配的PersonEntity对象
			}
		}
		return null;


	}
}