package userManagementGui;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.User;
import services.UserManagementRemote;

public class AddUserGui {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			UserManagementRemote userManagementRemote = (UserManagementRemote) context
					.lookup("witnessbook-ear/witnessbook-ejb/UserManagement!services.UserManagementRemote");

			User user = new User("sabrine");

			userManagementRemote.addUser(user);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
