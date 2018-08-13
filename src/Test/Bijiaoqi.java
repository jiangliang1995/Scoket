package Test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bijiaoqi {
public static void main(String[] args) {
	
	List<User> list = new ArrayList<User>();
	list.add(new User("a",12));
	list.add(new User("b",18));
	list.add(new User("c",11));
	list.add(new User("d",15));
	list.add(new User("e",16));
	Collections.sort(list/*,new A()*/);

	for (User user : list) {
		System.out.println(user.getAge());
	}
}
}
