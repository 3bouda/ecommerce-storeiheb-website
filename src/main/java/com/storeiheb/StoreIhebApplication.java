package com.storeiheb;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.storeiheb.daos.UserRepository;
import com.storeiheb.entities.User;


@SpringBootApplication
@ComponentScan(basePackages = "com.storeiheb.*")
public class StoreIhebApplication implements CommandLineRunner {
	
	@Autowired
	public BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(StoreIhebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User user = new User();
			
		user.setId(1);
		user.setEmail("abdelaliiheb@gmai.com");
		user.setEnable(true);
		user.setName("iheb abdelali");
		user.setPhone("53685309");
		user.setRole("ROLE_ADMIN");
		user.setPassword(passwordEncoder.encode("admin"));
		user.setProfile("admin.png");
		user.setDate(new Date());
		
		this.userRepo.save(user);
		
		
		
	}

}
