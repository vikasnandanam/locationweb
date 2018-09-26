package com.vikas.location.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.vikas.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {
	
	@Query("select type,count(type) from Location group by type")
	public List<Object[]> findTypeAndTypeCount();

}
