package test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		things a = new book();		//a 指向 new book 后 a 不能再重新指向别的对象
		a.setName("tom");
		//a.getName();
		
		//pencil b =(pencil) a;  // cant do that
		book b = (book) a;		// can do that
		b.getName();
		
		//buch c = (buch) a;	// cant do that  , 因为a指向 book类， 如果让C指向a类，即让一个buch类 指向book类 这当然是不可以的 即int类指向string类
		//c.getName();
	}

}
