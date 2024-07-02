package com.ibsys.scs.repositories;

import com.ibsys.scs.entities.neu.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
    Optional<Article> findByNumber(final String number);
}
