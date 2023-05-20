package com.example.calendarspring.Repository;



import com.example.calendarspring.bean.ERole;
import com.example.calendarspring.bean.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Roles, Long> {
    Optional<Roles> findByName(ERole name);
}
