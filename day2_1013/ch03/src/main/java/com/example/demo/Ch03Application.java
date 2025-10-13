package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;	
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@SpringBootApplication
@RestController
public class Ch03Application {

    private static final Logger log = LoggerFactory.getLogger(Ch03Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Ch03Application.class, args);
    }

    // =====================
    // 내부 인터페이스 & 클래스
    // =====================
    public interface Car {
        String getColor();
    }

    public class Sonata implements Car {
        public Sonata() {
            log.info("=== 출고 === Sonata");
        }
        @Override
        public String getColor() {
            return "=== 색상: RED === Sonata";
        }
    }

    public class K5 implements Car {
        public K5() {
            log.info("=== 출고 === K5");
        }
        @Override
        public String getColor() {
            return "=== 색상: YELLOW === K5";
        }
    }

    // =====================
    // 324 기능 (소나타 + K5 출고)
    // =====================
    @GetMapping("/ex324")
    public String ex324() {
        Car car1 = new Sonata();
        String re1 = car1.getColor();

        Car car2 = new K5();
        String re2 = car2.getColor();

        String result = re1 + "<br>" + re2 + "<br>" + "차 두 대를 출고하였습니다.";
        log.info("ex324() 실행 완료");
        return result;
    }
    @GetMapping("/ex325")
    public String ex325() {
    	List list = new ArrayList<Integer>();
    	
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	
    	System.out.println(list.get(1));
    	return "콘솔 출력";
    }
    @GetMapping("/ex326")
    public String ex326() {
    	List list = new ArrayList<String>();
    	
    	list.add("public");       
        list.add("static");     
        list.add("void");        

        
        for (int i = 0; i < list.size(); i++) { 
            System.out.println(list.get(i));   
        }

        list.remove(1);    
        int voidIndex = list.indexOf("void");  
        System.out.println("void의 index = " + voidIndex);
        return "콘솔 출력";
    }
    @GetMapping("/ex327")
    public String ex327() {
    	String str1 = new String("is same?");
    	String str2 = new String("is same?");
    	
    	System.out.println(str1 == str2);
    	return "콘솔 출력";
    }
    // =====================
    // 이후 확장할 기능 예시
    // =====================
    // @GetMapping("/ex325")
    // public String ex325() {
    //     // 여기에 다음 기능 작성
    //     return "ex325 페이지 준비 중...";
    // }
}
