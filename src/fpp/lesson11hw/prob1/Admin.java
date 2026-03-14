package fpp.lesson11hw.prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		if (students == null) return  null;
		HashMap<Key, Student> studentHashMap = new HashMap<>();
		for(Student student: students) {
			if (student != null) {
				Key key = new Key(student.getFirstName(), student.getLastName());
				studentHashMap.put(key, student);
			}
		}

		return  studentHashMap;
	}
}
