package arrydome.service;


import arrydome.entity.ArryEntity;


public interface ArryDAO {
	public void add(ArryEntity computerAdd);
	public void delete(ArryEntity computerDelete);
	public void edit(ArryEntity computerEdit);
	public ArryEntity select();
}