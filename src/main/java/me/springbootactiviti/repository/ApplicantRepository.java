package me.springbootactiviti.repository;

import me.springbootactiviti.entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant, Long> {
	// ..
}