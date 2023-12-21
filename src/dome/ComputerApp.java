package dome;

import com.sun.org.apache.bcel.internal.generic.CPInstruction;
import dome.entity.ComputerEntity;
import dome.service.ComputerDAO;
import dome.service.impl.ComputerDAOImpl;

import java.util.ArrayList;

public class ComputerApp {
	public static void main(String[] args) {
		ComputerDAO computerDAO = new ComputerDAOImpl();
		ComputerEntity computerEntity = new ComputerEntity();
		computerEntity.setModel("123");
		computerDAO.add(computerEntity);
		System.out.println(computerDAO.select());
		computerEntity.setInfo("456");
		computerDAO.edit(computerEntity);
		System.out.println(computerDAO.select());
		computerDAO.delete(computerEntity);
	}
}