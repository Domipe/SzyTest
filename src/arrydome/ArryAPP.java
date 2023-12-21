package arrydome;

import arrydome.entity.ArryEntity;
import arrydome.service.ArryDAO;
import arrydome.service.impl.ArryDAOImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArryAPP {
	public static void main(String[] args) {
		ArryDAO arryDAO = new ArryDAOImpl();
		ArryEntity arryEntity = new ArryEntity();
		ArrayList<String> na = new ArrayList<>();
		na.add("1");
		na.add("2");
		arryEntity.setPlus(na);
		arryDAO.add(arryEntity);
		System.out.println(arryDAO.select());
		String insert = na.set(1, "3");
		arryEntity.setPlus();

	}
}