package userManagementGui;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.UserManagementRemote;

public class DeleteUserGui {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			UserManagementRemote userManagementRemote = (UserManagementRemote) context
					.lookup("witnessbook-ear/witnessbook-ejb/UserManagement!services.UserManagementRemote");

			userManagementRemote.deleteUserById(3);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
