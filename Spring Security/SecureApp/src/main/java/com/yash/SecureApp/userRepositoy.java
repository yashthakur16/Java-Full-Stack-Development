package com.yash.SecureApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepositoy extends JpaRepository<logindata2, Integer>
{
	logindata2 findByUsername(String user);
}
