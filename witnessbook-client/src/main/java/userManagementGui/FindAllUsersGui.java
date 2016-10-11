package userManagementGui;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.User;
import services.UserManagementRemote;

public class FindAllUsersGui {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			UserManagementRemote userManagementRemote = (UserManagementRemote) context
					.lookup("witnessbook-ear/witnessbook-ejb/UserManagement!services.UserManagementRemote");

		//	List<User> users = userManagementRemote.findAllUsers();
		//	for (User u : users) {
		//		System.out.println(u.getName());
		//	}

		} catch (NamingException e) {
			e.printStackTrace();
		}

	}
}
