package userManagementGui;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.UserManagementRemote;

public class UpdateUserGui {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			UserManagementRemote userManagementRemote = (UserManagementRemote) context
					.lookup("witnessbook-ear/witnessbook-ejb/UserManagement!services.UserManagementRemote");

			// User userFound = userManagementRemote.findUserById(1);
			// userFound.setName("newLook");

			// userManagementRemote.updateUser(userFound);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
