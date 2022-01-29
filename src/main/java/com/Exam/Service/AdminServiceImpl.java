package com.Exam.Service;

import java.util.Optional;

import com.Exam.Model.AdminLogin;

public interface AdminServiceImpl {
	public AdminLogin addAdmin(AdminLogin admin);

	public Optional<AdminLogin> findByAdminId(int admin_id);
}
