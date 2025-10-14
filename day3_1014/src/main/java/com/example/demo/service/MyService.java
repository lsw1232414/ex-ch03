package com.example.demo.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private static final Logger log = LoggerFactory.getLogger(MyService.class);
    
    public String ex328() {
        String str1 = new String("is same?");
        String str2 = new String("is same?");
        System.out.println(str1.equals(str2));
        return "콘솔 출력";
    }

    public String ex331() {
        List<String> list = new ArrayList<>();
        list.add("public");
        list.add("static");
        list.add("void");

        list.sort((str1, str2) -> str1.compareTo(str2));
        return list.toString();
    }
}
