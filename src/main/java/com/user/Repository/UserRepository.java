package com.user.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	public User save(User user);
	public Optional<User> findById(Integer id);
	public List<User> findAll();
	public void deleteById(Integer id);
}
