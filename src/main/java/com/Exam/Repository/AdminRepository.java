package com.Exam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Exam.Model.AdminLogin;

public interface AdminRepository extends JpaRepository<AdminLogin,  Integer> {

}
