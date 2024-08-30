package com.cltech.qa.repository;

import com.cltech.qa.entity.data.JenkinsJob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JenkinsJobRepository extends JpaRepository<JenkinsJob, Integer> {
}
