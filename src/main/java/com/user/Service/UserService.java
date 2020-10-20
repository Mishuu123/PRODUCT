package com.user.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Entity.User;
import com.user.Mapper.UserMapper;
import com.user.Model.UserModel;
import com.user.Repository.UserRepository;



@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	public UserModel addUser(UserModel model) {
		User user = UserMapper.INSTANCE.userModelToEntity(model);
		User response = userRepo.save(user);
		return UserMapper.INSTANCE.entityToUserModel(response);
		
	}
	
	public UserModel getUser(Integer id){
		Optional<User> response=userRepo.findById(id);
		return UserMapper.INSTANCE.entityToUserModel(response);
		
	}
	
	public  List<UserModel> getAll(){
		List<User> response=userRepo.findAll();
		return UserMapper.INSTANCE.entityToUserModel(response);
		
	}

	public void deleteUser(Integer id){
		userRepo.deleteById(id);
	
	
		
	}
	
}
