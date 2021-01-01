package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.w3c.dom.ls.LSInput;

import com.bean.Student;

public class aaaaaaaaaaaa {

	
	
	public static void main(String[] args) {
		
		List<Student>  list =   new ArrayList<>() ;
		Student student = new Student("1","1","1",100);
		Student student3 = new Student("3","3","3",80);
		Student student2 = new Student("2","2","2",90);
		Student student4 = new Student("4","4","4",60);
		Student student5 = new Student("5","5","5",60);
		list.add(student);
		list.add(student3);
		list.add(student2);
		list.add(student4);
		list.add(student5);
		System.out.println();
		
		
		/*for (Student student1 : list) {
			student1.setGrade(100);
			System.out.println(student1);
		}*/
		
		String  s1 = "123" ;
		String  s2 = s1 ;
		String  s3 = "123" ;
		String  s4 = new String("123") ;
		String  s5 = new String("123");
		
		System.out.println("s1==s3"+(s1==s3));
		System.out.println("s1==s2"+(s1==s2));
		System.out.println("s1==s2"+(s1.equals(s2)));
		System.out.println("s4==s5"+(s4==s5));
		System.out.println("s4==s5"+(s4.equals(s5)));
		

		Map map = new HashMap<>() ;
		
		map.put("ss", 11) ;
		map.put("sss", 111) ;
	Collection values = map.values();
	Set keySet = map.keySet();
	System.out.println(keySet);
	System.out.println(values);
	
	
	//cong list中取出所有的name依逗号分隔开. 
	 String contain_str = list.stream().map(a -> a.getName()).collect(Collectors.joining("-"));
	 System.out.println(contain_str);
	 //
	 int sum = list.stream().mapToInt(Student :: getGrade).sum();
	 System.out.println(sum);
	 OptionalDouble average = list.stream().mapToInt(Student :: getGrade).average();
	 System.out.println(average);
	 OptionalInt sumss = list.stream().mapToInt(Student :: getGrade).max();
	 System.out.println(sumss);
	 
	 
	 List<Student> collect_80 = list.stream().filter(a -> a.getGrade() >80).collect(Collectors.toList());
	 System.out.println(collect_80);
	 
	 Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Student :: getGrade,Collectors.counting()));
	 System.out.println(collect);
	 Map<Integer, List<Student>> collect2 = list.stream().collect(Collectors.groupingBy(Student :: getGrade,Collectors.toList()));
	 System.out.println(collect2);
	 
	 Map<Integer, Long> collect3 = list.stream().collect(Collectors.groupingBy(Student :: getGrade,Collectors.counting()));
	 System.out.println(collect3);
	 Map<Integer, Integer> collect4 = list.stream().collect(Collectors.groupingBy(Student :: getGrade,Collectors.summingInt(Student::getGrade)));
	 	 System.out.println(collect4);
	 
	 	 Map<Integer, Student> collect5 = list.stream().collect(Collectors.toMap(Student:: getGrade, (m)->(m), (a,b)-> (a)));
	 	 Map<Integer, String> collect6 = list.stream().collect(Collectors.toMap(Student::getGrade, Student::getId, (a,b)->(a)));
	 	 
	
	/*List<String> collect = list.stream().map(Student :: getId).collect(Collectors.toList());
	
	 List<Student> collect2 = list.stream().sorted(Comparator.comparing(Student :: getGrade).thenComparing(Student:: getId)).collect(Collectors.toList()) ;
	 
	 System.out.println(collect2);
	 
	 List<Student> collect21 = list.stream().sorted(Comparator.comparing(Student :: getGrade).reversed()).collect(Collectors.toList());
		collect21.forEach(System.out::println);	
		
		collect21.forEach( e -> System.out.print(e));
		
		List<Student> collect3 = list.stream().filter(a -> a.getGrade() >= 70).collect(Collectors.toList()) ;
		
		double sum = list.stream().mapToDouble(Student :: getGrade).sum() ;
		 int sum2 = list.stream().mapToInt(a -> a.getGrade()).skip(2).sum() ;
		
		 System.out.println(sum2);
		
		System.out.println(sum);
		
		Map<Integer, String> map2 = list.stream().collect(Collectors.toMap(Student::getGrade,Student :: getId  ,(a,b) -> (a)));
		
		Map<Integer, Object> map3 = list.stream().collect(Collectors.toMap(Student::getGrade, (m)->(m) ,(a,b) -> (a)));
		System.out.println(map2);
		System.out.println(map3);      
		
		Map<String, String> moo = new HashMap<>() ;
		 moo.get("11");
		 
		 moo.put("11", "22");
		// Liu的获取方式
		 
		 Stream<Student> stream = list.stream();
		 String[] arr = {} ;
		 Stream<String> stream2 = Arrays.stream(arr);
		  Stream<String> of = Stream.of("sss","ss") ;
		  stream.filter(a -> a.getGrade() >= 80).collect(Collectors.toList());
		  List<Student> collect4 = stream.distinct().collect(Collectors.toList());
		
		  int age = list.stream().reduce(0, Integer::sum);
		  IntStream mapToInt = list.stream().mapToInt(Student :: getGrade);*/
		  
		  
	}

	
}
