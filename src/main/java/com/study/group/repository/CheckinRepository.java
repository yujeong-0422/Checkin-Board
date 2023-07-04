package com.study.group.repository;

import com.study.group.entity.checkin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckinRepository extends JpaRepository<checkin, Integer> {
}