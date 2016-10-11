package services;

import java.util.List;

import javax.ejb.Remote;

import entities.User;

@Remote
public interface UserManagementRemote {
	void addUser(User user);

	void updateUser(User user);

	void deleteUserById(Integer idUser);

	void deleteUser(User user);

	User findUserById(Integer idUser);

	List<User> findAllUsers();

}
