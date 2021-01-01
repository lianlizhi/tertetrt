package com.test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


import com.bean.Student;
import com.bean.User;
import com.untils.BigDecimalUtils;

public class TestLambda  {


	public static void main(String[] args) {

		// 1 查询出学生名字为张三的学生.
		List<Student> studentList = getStudentList();
		//List<Student> list = studentList.stream().filter(a -> a.getName().equals("张三")).collect(Collectors.toList());
		//System.out.println(list);
		// 2 查询出成绩大于80分的学生.
		///List<Student> collect = studentList.stream().filter(a -> a.getGrade() > 80).collect(Collectors.toList()) ;
		//System.out.println(collect);
		//  查询出不是男的学生性别
		//List<Student> list2 = studentList.stream().filter(a -> a.getSex() != "男").collect(Collectors.toList());
		//System.out.println(list2);
		
		//userList.sort((user1, user2) -> user2.getAge().compareTo(user1.getAge()));//
		// 按照学生成绩排序,从小到大顺序.
		 studentList.sort((student1,student2) -> student1.getGrade().compareTo(student2.getGrade()));
		   System.out.println(studentList);
		  // Map<String, MonitorReason> map = MonitorReasons.stream().collect(Collectors.toMap(MonitorReason::getMonitorCode, (m) -> m, (existsValue, newValue) -> newValue));
	//Map<String, Student> collect = studentList.stream().collect(Collectors.toMap((key->key.getId()),(value->value) ));
   // Map<String, Student> collect1 = studentList.stream().collect(Collectors.toMap(Student::getId, (m) -> m, (existsValue, newValue) -> newValue ));
	    //    System.out.println(collect);
	     //   System.out.println(collect1);
		   
		   //获取list对象的某个字段组装成新list
	        //List<String> userIdList = studentList.stream().map(a -> a.getId()).collect(Collectors.toList());
	       // System.out.println(userIdList);
		   //基本类型
	        int sumAge = studentList.stream().mapToInt(Student :: getGrade).sum() ;
	        System.out.println(sumAge);
	         OptionalDouble average = studentList.stream().mapToInt(Student :: getGrade).average();
	         System.out.println(average);
	         OptionalInt max = studentList.stream().mapToInt(Student :: getGrade).min();
	         Integer integer = studentList.stream().map(Student :: getGrade).min(Integer::compareTo).get();
	         System.out.println(max.getAsInt());
	         System.out.println(integer);
	         System.out.println("........................");
	         //分组
	         Map<String, List<Student>> groupBySex = studentList.stream().collect(Collectors.groupingBy(Student::getSex));
	         System.out.println(groupBySex);
	         //遍历分组
	         for (Map.Entry<String, List<Student>> entryUser : groupBySex.entrySet()) {
	             String key = entryUser.getKey();
	             List<Student> entryUserList = entryUser.getValue();
	             System.out.println(key);
	             System.out.println(entryUserList);
	         }
	         List<User> userList = new LinkedList<>() ;
	         userList.add(new User("1","张三",new BigDecimal("3"))) ;
	         userList.add(new User("2","李四",new BigDecimal("4"))) ;
	         userList.add(new User("3","王五",new BigDecimal("5"))) ;
	         BigDecimal totalQuantity = userList.stream().map(User::getFamilyMemberQuantity).reduce(BigDecimal.ZERO, BigDecimal::add);
	         BigDecimal totalQuantity2 = userList.stream().map(User::getFamilyMemberQuantity).reduce(BigDecimal.ZERO, BigDecimalUtils::sum);      
	System.out.println(totalQuantity);
	System.out.println(totalQuantity2);
	         
	         
	         
	         /* --------------------- 
	 作者：gsls200808 
	 来源：CSDN 
	 原文：https://blog.csdn.net/gsls200808/article/details/86501905 
	 版权声明：本文为博主原创文章，转载请附上博文链接！*/
	         
	}

	private static List<Student> getStudentList() {
		List<Student> list = new ArrayList<>() ;
		list.add(new Student("1","张三","男",100));
		list.add(new Student("2","张三","男",80));
		list.add(new Student("3","张三","男",60));
		list.add(new Student("4","张三","女",70));
		list.add(new Student("5","张三","女",10));
		list.add(new Student("6","李四","男",90));
		list.add(new Student("7","王五","男",20));
		list.add(new Student("8","赵六","男",90));
		list.add(new Student("8","赵六","男",50));
		
		List<String> list2 = list.stream().map(Student :: getId).collect(Collectors.toList());
		System.out.println(list2);
		
		
		
		return list ;
		
		
		
	}
	
	

}
