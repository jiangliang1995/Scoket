package Test;

import java.util.Comparator;

public class A implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		if(o1.getAge()>=o2.getAge()){
			return 1;
		}else{
			return 0;
		}
	}

}
