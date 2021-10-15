package com.example.demo.form;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SignupForm {

	private String employeeId;

	private String password;

	private String employeeName;
	
	private String deploy;

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date birthday;

	private Integer gender;
}