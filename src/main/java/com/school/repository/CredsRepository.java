package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// import com.school.dto.CredsDto;
import com.school.entity.Creds;

@Repository
public interface CredsRepository extends JpaRepository<Creds,Long> {

    Creds findByEmail(String email);

}
