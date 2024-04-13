package com.ibsys.scs.controllers;

import com.ibsys.scs.dto.ArticleDto;
import com.ibsys.scs.entities.Article;
import com.ibsys.scs.services.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(ApiRoutes.ARTICLES)
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping
    public List<Article> findAllArticles() {
        return articleService.findAllArticles();
    }

    @GetMapping("/{id}")
    public Article findArticleById(@PathVariable final Integer id) {
        return articleService.findArticleById(id);
    }

    @PostMapping
    public void createArticle(@RequestBody final ArticleDto articleDto) {
        articleService.createArticle(articleDto);
    }

    @PostMapping("/many")
    public void createMultipleArticles(@RequestBody final List<ArticleDto> articleDtoList) {
        articleService.createMultipleArticles(articleDtoList);
    }

}
