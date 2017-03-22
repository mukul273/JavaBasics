package com.java.basics;

interface ExecutableReturnType {
	int execute();
}

class Runner {
	public void run(ExecutableReturnType e) {
		System.out.println("Runner.run");
		int value = e.execute();
		System.out.println("Value:"+value);
	}
}
public class LambdaDemoWithReturnType {

	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.run(new ExecutableReturnType() {
			
			@Override
			public int execute() {
				return 273;
			}
		});
		
		runner.run(() -> {
			System.out.println("Lambda expression with return type");
			return 2726;
		});
	}
}