package com.Exam.Service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Exam.Model.AdminLogin;
import com.Exam.Repository.AdminRepository;


@Service
public class AdminService implements AdminServiceImpl  {
	
	@Autowired
	AdminRepository dao;
	
	public AdminLogin addAdmin(AdminLogin admin)
	{	
		AdminLogin login=dao.save(admin);
		return login;
	}
	
	@Override
	public Optional<AdminLogin> findByAdminId(int admin_id) {
		return dao.findById(admin_id);
	}
}
