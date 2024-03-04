package com.abin;

/**
 * 具体的 Builder
 * <p>
 * 实现构建的各种方法
 */
public class ArticleBuilder extends Builder{
    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        stringBuilder.append(title + "\n");
        stringBuilder.append("=================================\n");
    }

    @Override
    public void makeContent(String content) {
        stringBuilder.append(content + "\n");
    }

    @Override
    public void close() {
        stringBuilder.append("=================================\n");
    }

    public String getArticle() {
        //  返回结果
        return stringBuilder.toString();
    }
}
