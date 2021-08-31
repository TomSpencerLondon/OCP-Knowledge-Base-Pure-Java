package com.codurance.ocppracticeexam.exam1;

import com.codurance.ocppracticeexam.exam1.api.BloggerService;

import java.util.ServiceLoader;

public class ServiceLoaderPractice {
    public static void main(String[] args) {
        Iterable<BloggerService> bsLoader = ServiceLoader.load(BloggerService.class);
    }
}
