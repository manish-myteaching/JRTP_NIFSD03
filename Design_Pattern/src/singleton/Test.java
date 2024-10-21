package singleton;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {

		SingletonDemo singletonDemo = SingletonDemo.getInstance();
		System.out.println(singletonDemo.hashCode());

		SingletonDemo singletonDemo2 = SingletonDemo.getInstance();
		System.out.println(singletonDemo2.hashCode());
		 
		SingletonDemo singletonDemo3 =(SingletonDemo)singletonDemo2.clone();
		System.out.println(singletonDemo3.hashCode());
		

	}

}
