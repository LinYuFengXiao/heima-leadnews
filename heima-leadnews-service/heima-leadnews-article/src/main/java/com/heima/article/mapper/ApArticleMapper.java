package com.heima.article.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heima.model.article.dtos.ArticleHomeDto;
import com.heima.model.article.pojos.ApArticle;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ApArticleMapper extends BaseMapper<ApArticle> {

    /**
     *
     * @param dto
     * @param type
     * @return
     */
    public List<ApArticle> loadArticleList(ArticleHomeDto dto,Short type);
}
