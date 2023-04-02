package pattern1;

public class gto
{	
	public static void main(String[] args) 
	{
		//inheri.19
		Person p = new Person();
        p.talk();
    }
}

class Person {
    public void talk() {
        System.out.print("First Program");
    }
}
class Student extends Person {
    public void talk() {
        System.out.print("Second Program");
    }
}
















