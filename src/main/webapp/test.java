package main.webapp;

import net.javaguides.usermanagement.dao.UserDAO;

public class test {

	public static void main(String[] args) {
		UserDAO userdao = new UserDAO();
		System.out.println(userdao.getConnection()); 

	}

}
