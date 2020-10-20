package com.user.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FeedbackMapper {

	FeedbackMapper INSTANCE=Mappers.getMapper(FeedbackMapper.class);
}
