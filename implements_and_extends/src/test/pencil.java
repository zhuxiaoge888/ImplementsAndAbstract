package test;

public abstract class pencil implements things {
	String name;
	
	@Override
	public void setName(String name) {			//抽象类实现接口类， 接口类的方法在抽象类中不是必须实现，可以一个都不实现。但是如果该抽象类被具体类继承，则
		// TODO Auto-generated method stub		//（接上一行）该具体类必须实现父类，即抽象类所有没有实现的所有接口方法。抽象类已经实现的可以不用实现
		
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		System.out.println("jerry" + name);
		return name;
	}
	
	public abstract void say();                // 抽象方法 必须在子类被实现
	
	public  void sayAgain(){				  // 非抽象方法 非必须在子类被实现
		
	}
	
}
