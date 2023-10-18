package com.main.drawingcourse.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
	private int id;
	private String username;
	private String password;
	private String email;
	private Boolean status;
	private String phone;
	private int roleId;
	private RoleModelResponse roleModelResponse;
	private String avatar;
	private LocalDate dob;
	private boolean sex;
	private String description;
	private String fullname;
}
