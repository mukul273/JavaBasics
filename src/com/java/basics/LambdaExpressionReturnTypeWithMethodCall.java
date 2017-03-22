package com.java.basics;

interface ExecutableReturnType1 {
	int execute();
}

class Runner1 {
	public void run(ExecutableReturnType1 e) {
		System.out.println("Runner.run");
		int value = e.execute();
		System.out.println("Value:"+value);
	}
}

public class LambdaExpressionReturnTypeWithMethodCall {
	
	public static void main(String[] args) {
		Runner1 runner = new Runner1();
		runner.run(new ExecutableReturnType1() {
			
			@Override
			public int execute() {
				return 273;
			}
		});
		
		runner.run(() -> returnValue());
	}
	
	private static int returnValue() {
		return 2726;
	}
}
