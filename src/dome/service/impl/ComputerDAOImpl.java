package dome.service.impl;

import dome.entity.ComputerEntity;
import dome.service.ComputerDAO;

public class ComputerDAOImpl implements ComputerDAO {
	private ComputerEntity computerEntity;

	@Override
	public void add(ComputerEntity computerAdd) {
		computerEntity = computerAdd;
		System.out.println("添加成功");

	}

	@Override
	public void delete(ComputerEntity computerDelete) {
		computerDelete = null;
		System.out.println("删除成功");

	}

	@Override
	public void edit(ComputerEntity computerEdit) {
		computerEntity = computerEdit;
		System.out.println("编辑成功");
	}

	@Override
	public ComputerEntity select() {
		return computerEntity;
	}
}