package com.heima.article.service;

import com.heima.model.article.pojos.ApArticle;

public interface ArticleFreemarkService {

    /**
     * 生成静态文件上传到Minio
     * @param apArticle
     * @param content
     */
    public void buildArticleToMinIO(ApArticle apArticle,String content);
}
