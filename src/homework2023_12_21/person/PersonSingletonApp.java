package homework2023_12_21.person;

import homework2023_12_21.person.entity.PersonEntity;
import homework2023_12_21.person.service.singleton.PersonSingleton;

public class PersonSingletonApp {
	public static void main(String[] args) {
		//获取personSington单例实例
		PersonSingleton dao = PersonSingleton.getPersonSingleton();
		//创建PersonEntity对象
		 PersonEntity person = new PersonEntity(1, "John", 30, new java.util.Date(), "Male");

        // 添加 PersonEntity 对象
        dao.add(person);

        // 查找并输出结果
        PersonEntity person1 = dao.find(1);
        if (person1 != null) {
            System.out.println("查找成功：" + person1);
        } else {
            System.out.println("查找失败");
        }

        // 修改 PersonEntity 对象
        person.setAge(35);
        dao.revise(person);
        PersonEntity revisedPerson = dao.find(1);
        if (revisedPerson != null) {
            System.out.println("修改成功：" + revisedPerson);
        } else {
            System.out.println("修改失败");
        }

        // 删除 PersonEntity 对象
        dao.delete(person);
        PersonEntity deletedPerson = dao.find(1);
        if (deletedPerson == null) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }
	}