package com.example.backendupdated.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;
import com.example.backendupdated.entities.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long>{
    Optional<Books> findByTitle(String title);
}
