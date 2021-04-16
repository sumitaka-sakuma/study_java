package Study_Java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Study_StreamAPI {

	public void streamApiStudy() {

		// 単純なStream操作
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream()
			.sorted(Comparator.reverseOrder())
			.filter(i -> i % 2 == 0)
			.forEach(i -> System.out.println(i));
	}
}
