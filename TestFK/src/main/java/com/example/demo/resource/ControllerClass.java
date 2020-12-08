package com.example.demo.resource;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.FeeLog;
import com.example.demo.model.Student;
import com.example.demo.repository.FeeLogRepo;
import com.example.demo.repository.StudentRepo;

@Controller
public class ControllerClass {

	@Autowired
	StudentRepo s;
	
	@Autowired
	FeeLogRepo f;
	
	@RequestMapping("/home")
	public String home() {
		return "AddStudent.jsp";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Student stud) {
		s.save(stud);
		return "save.jsp";
	}
	
	@RequestMapping("/addFee")
	public String add() {
		return "Fee.jsp";
	}
	
	@RequestMapping("/Fee")
	public String addFee(FeeLog fee) {
		fee.setDateTime(new Timestamp(System.currentTimeMillis()));
		//fee.getDateTime();
		f.save(fee);
		return "save.jsp";
	}
}
