package arrydome.service.impl;

import arrydome.entity.ArryEntity;
import arrydome.service.ArryDAO;

public class ArryDAOImpl implements ArryDAO {
	private ArryEntity arryEntity;

	@Override
	public void add(ArryEntity computerAdd) {
		arryEntity = computerAdd;
		System.out.println("添加成功");
	}

	@Override
	public void delete(ArryEntity computerDelete) {
		arryEntity = computerDelete;
		System.out.println("删除成功");
	}

	@Override
	public void edit(ArryEntity computerEdit) {
		arryEntity = computerEdit;
		System.out.println("编辑成功");
	}

	@Override
	public ArryEntity select() {
		return arryEntity;
	}
}