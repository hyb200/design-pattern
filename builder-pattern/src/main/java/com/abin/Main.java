package com.abin;

public class Main {
    public static void main(String[] args) {
        ArticleBuilder articleBuilder = new ArticleBuilder();
        //  创建指挥者，负责使用builder生成实例
        Director director = new Director(articleBuilder);
        director.build();

        String article = articleBuilder.getArticle();
        System.out.println(article);
    }
}