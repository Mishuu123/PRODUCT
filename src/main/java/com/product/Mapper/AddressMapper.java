package com.product.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {

	AddressMapper INSTANCE=Mappers.getMapper(AddressMapper.class);
	
	
}
