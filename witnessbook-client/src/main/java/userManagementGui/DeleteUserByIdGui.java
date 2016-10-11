package userManagementGui;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.User;
import services.UserManagementRemote;

public class DeleteUserByIdGui {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			UserManagementRemote userManagementRemote = (UserManagementRemote) context
					.lookup("witnessbook-ear/witnessbook-ejb/UserManagement!services.UserManagementRemote");

			User userFound = userManagementRemote.findUserById(1);
			userManagementRemote.deleteUser(userFound);
		} catch (NamingException e) {
			e.printStackTrace();
		}

	}
}
