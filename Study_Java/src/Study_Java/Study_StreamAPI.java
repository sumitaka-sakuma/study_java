package Study_Java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Study_StreamAPI {

	public void streamApiStudy() {

		// 単純なStream操作
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> stream = list.stream();
		stream.forEach(System.out::println);
	}
}
