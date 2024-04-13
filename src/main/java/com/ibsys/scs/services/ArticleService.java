package com.ibsys.scs.services;

import com.ibsys.scs.dto.ArticleDto;
import com.ibsys.scs.entities.Article;
import com.ibsys.scs.repositories.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public List<Article> findAllArticles() {
        return articleRepository.findAll();
    }

    public Article findArticleById(final Integer id) {
        return articleRepository.findById(id).orElse(null);
    }

    public void createArticle(final ArticleDto articleDto) {
        var article = articleDto.toArticle();
        articleRepository.save(article);
    }

    public void createMultipleArticles(final List<ArticleDto> articleDtoList) {
        var articles = articleDtoList.stream().map(ArticleDto::toArticle).toList();
        articleRepository.saveAll(articles);
    }
}
