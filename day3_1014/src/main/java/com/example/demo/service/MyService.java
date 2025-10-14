package com.example.demo.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

@Service
public class MyService {

    private static final Logger log = LoggerFactory.getLogger(MyService.class);
    
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
    
    public String ex324() {
        Car car1 = new Sonata();
        String re1 = car1.getColor();

        Car car2 = new K5();
        String re2 = car2.getColor();

        String result = re1 + "<br>" + re2 + "<br>" + "차 두 대를 출고하였습니다.";
        log.info("ex324() 실행 완료");
        return result;
    }
    public String ex325() {
    	List list = new ArrayList<Integer>();
    	
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	
    	System.out.println(list.get(1));
    	return "콘솔 출력";
    }
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
    public String ex327() {
    	String str1 = new String("is same?");
    	String str2 = new String("is same?");
    	
    	System.out.println(str1 == str2);
    	return "콘솔 출력";
    }
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
    public String ex332() {
    	List list = new ArrayList<String>();

        list.add("public");
        list.add("static");
        list.add("void");

        list.stream().forEach(str -> System.out.println(str));
        return "콘솔 출력";
    }
    public String ex334() {
    	 Integer[] integerArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         List<Integer> list = Arrays.asList(integerArray);

         List evenList = list.stream()
                 .filter(value -> value % 2 == 0).collect(Collectors.toList());

         evenList.stream().forEach(value -> System.out.println(value));
        return "콘솔 출력";
    }
    public String ex335() {
        Integer[] integerArray = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(integerArray);
        list.stream().forEach(value -> System.out.println(value));
        return "콘솔 출력";
    }
    public String ex336() {
    Integer[] integerArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    List<Integer> list = Arrays.asList(integerArray);
    List evenList = list.stream()
           .filter(value -> value % 2 == 0).collect(Collectors.toList());
    evenList.stream().forEach(value -> System.out.println(value));
    return "콘솔 출력";
    }
    public String ex337() {
    	Integer[] integerArray = new Integer[]{1, 1, 1, 1, 2, 2, 2, 3, 3, 4};
        List<Integer> list = Arrays.asList(integerArray);
        List<Integer> distinctList = list.stream().distinct().toList();
        distinctList.stream().forEach(value -> System.out.println(value));
        return "콘솔 출력";
    }
    public String ex338() {
    	String[] lowercaseArray = new String[]{"public", "static", "void"};
        List<String> lowercaseList = Arrays.asList(lowercaseArray);
        List<String> uppercaseList = lowercaseList.stream()
                .map(value -> value.toUpperCase()).toList();
        uppercaseList.stream().forEach(value -> System.out.println(value));
    return "콘솔 출력";
    }
    public String ex339() {
        String isThisNull = getSomeString();

        if (null != isThisNull) {
            System.out.println(isThisNull.toUpperCase());
        } else {
            System.out.println("값이 null입니다.");
        }

        return "콘솔 출력";
    }

    private String getSomeString() {
        return null;
    }
    public String ex3310() {
        String isThisNull = getSomeString2();

        if (isThisNull != null) {
            System.out.println(isThisNull.toUpperCase());
        } else {
            System.out.println("값이 null입니다.");
        }

        return "콘솔 출력";
    }

    private String getSomeString2() {
        return null;
    }
    }
