package com.storeiheb.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.storeiheb.entities.UnbanRequest;

@Repository
public interface UnbanRequestRepository extends JpaRepository<UnbanRequest, Integer> {
	
	@Query(value = "select * from unban_requests", nativeQuery = true)
	public List<UnbanRequest> getAllRequest();

}
