public class User{   //just define a class, no "main" program entrance;
	private String content; //define a property;
	public User(String content)
	{ //like a constructor, 'U'
		this.content = content;
	}
	public void sayContent()
	{ //define a method
		System.out.println(this.content);
	}
}