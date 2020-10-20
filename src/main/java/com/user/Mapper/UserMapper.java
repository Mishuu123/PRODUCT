package com.user.Mapper;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.user.Entity.User;
import com.user.Model.UserModel;

@Mapper
public interface UserMapper{

	UserMapper INSTANCE= Mappers.getMapper(UserMapper.class);
	
	public abstract UserModel entityToUserModel(User user);
	public abstract User userModelToEntity(UserModel user);
	public abstract UserModel entityToUserModel(Optional<User> response);
	public abstract List<UserModel> entityToUserModel(List<User> response);
	
}
 