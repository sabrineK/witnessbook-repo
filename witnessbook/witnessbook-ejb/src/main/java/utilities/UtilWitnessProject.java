package utilities;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import entities.User;
import services.UserManagementLocal;

/**
 * Session Bean implementation class UtilWitnessProject
 */
@Singleton
@LocalBean
@Startup
public class UtilWitnessProject {
	@EJB
	private UserManagementLocal userManagementLocal;

	/**
	 * Default constructor.
	 */
	public UtilWitnessProject() {
	}

	@PostConstruct
	public void initDB() {
		/*User user = new User("user1");
		User user2 = new User("user2");
		User user3 = new User("user3");
		User user4 = new User("user4");

		userManagementLocal.addUser(user);
		userManagementLocal.addUser(user2);
		userManagementLocal.addUser(user3);
		userManagementLocal.addUser(user4);*/

	}

}
