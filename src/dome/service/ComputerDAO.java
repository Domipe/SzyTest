package dome.service;

import dome.entity.ComputerEntity;

import java.util.ArrayList;
import java.util.Scanner;

public interface ComputerDAO {

	public void add(ComputerEntity computerAdd);
	public void delete(ComputerEntity computerDelete);
	public void edit(ComputerEntity computerEdit);
	public ComputerEntity select();
}