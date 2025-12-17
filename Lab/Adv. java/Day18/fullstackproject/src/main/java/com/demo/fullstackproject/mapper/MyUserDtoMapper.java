package com.demo.fullstackproject.mapper;

import com.demo.fullstackproject.beans.MyUser;
import com.demo.fullstackproject.dto.MyUserDto;

public class MyUserDtoMapper {
	
	public static MyUser mapToMyUser(MyUserDto l) {
		
		
		return  new MyUser(l.getUsername(),l.getRole());
		
	}
	
		   // Entity → DTO
	    public static MyUserDto mapToUserDto(MyUser user) {
	        MyUserDto dto = new MyUserDto();
	        dto.setUsername(user.getUsername());
	        dto.setRole(user.getRole());
	        return dto;
	   
	}

}
