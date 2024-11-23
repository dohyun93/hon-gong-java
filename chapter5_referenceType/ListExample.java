package chapter5_referenceType;

import chapter5_referenceType.model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        list = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        list.forEach(str -> System.out.println(str));

        List<Student.Info> studentList = new ArrayList<>();
        studentList.add(new Student.Info(22, "ADaeding"));
        studentList.add(new Student.Info(11, "Choding"));
        studentList.add(new Student.Info(32, "DohyunKwon"));

        // 응용.

        // filter 와 DTO 를 사용해 리스트로 만든다.
        // 나이가 짝수인 요소만 필터링한다.
//        studentList = studentList.stream()
//                .filter(studentInfo -> studentInfo.age() % 2 == 0) // 짝수 나이만 뽑는다.
//                .toList();

        // 이름 역순으로 리스트 가공.
        studentList = studentList.stream()
                .sorted(Comparator.comparing(Student.Info::name).reversed())
                .toList();

        studentList.forEach(studentInfo -> System.out.printf("학생 정보 출력. 나이: %d, 이름: %s\n", studentInfo.age(), studentInfo.name()));
    }
}
