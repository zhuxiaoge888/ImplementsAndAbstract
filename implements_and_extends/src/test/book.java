package test;

public class book implements things {
	
	String name;
	
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		System.out.println(name);
		return name;
	}

	


	
	
	
}
