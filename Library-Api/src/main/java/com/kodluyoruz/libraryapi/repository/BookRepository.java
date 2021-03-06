package com.kodluyoruz.libraryapi.repository;

import com.kodluyoruz.libraryapi.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    @Modifying(clearAutomatically = true)
    @Query("update #{#entityName} b set b.available= :available where b.id= :id")
    int setAvailability(@Param("id") Integer id, @Param("available") boolean available);
}
