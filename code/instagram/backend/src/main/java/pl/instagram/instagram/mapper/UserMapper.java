package pl.instagram.instagram.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.instagram.instagram.model.api.response.BasicUserData;
import pl.instagram.instagram.model.entity.UserEntity;

import java.util.List;

@Mapper(uses = {ByteArrayMapper.class})
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "avatar", target = "avatar", qualifiedByName = "byteArrayToBase64")
    BasicUserData userEntityToBasicUserData(UserEntity userEntity);

    List<BasicUserData> userEntityListToBasicUserDataList(List<UserEntity> userEntityList);
}
