package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MindStormingApplication {

	public Integer calcFibo(int i) {

//		calcFibo();

		return 0;
	}

	public static void main(String[] args) {
		SpringApplication.run(MindStormingApplication.class, args);

		int i = 1;
		MindStormingApplication obj = new MindStormingApplication();
		obj.calcFibo(i);
		int prev_int_1 = 0;
		int prev_int_2 = 1;
		int sum = 1;
		for (int x = 1; x <= 7; x++) { // 1

			sum = prev_int_1 + prev_int_2;
			System.out.println(sum);
			prev_int_1 = prev_int_2;
			prev_int_2 = sum;
		}

//		StringBuilder builder = new StringBuilder("Hello");
//		StringBuffer buffer = new StringBuffer("Hello");
//		Double d = 0.0d;
//		System.out.println(d);

//		Predicate<String> predicate = (str) -> str != null ? true : false;
//		System.out.println(predicate.test("Hello"));

//		Supplier<String> supplier = () -> "Hello boys from supplier";
//		System.out.println(supplier.get());

//		Function<Integer, String> function = (i) -> {
//			if (i > 0)
//				return "Positive";
//			else if (i < 0)
//				return "Negative";
//			else
//				return "Zero";
//		};
//
//		System.out.println(function.apply(0));

	}

}
