package groupEleven.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import groupEleven.beans.User;

/**
 * @author alexh - aheinrichs
 * CIS175 - Fall 2022
 * Nov 14, 2022
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
