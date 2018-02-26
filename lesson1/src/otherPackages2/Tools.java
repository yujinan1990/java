public class Tools{   //just define a class, no "main" program entrance;
	private String toolName; //define a property;
	public Tools(String content)
	{ //like a constructor, 'U';
		this.toolName = content;
	}
	public void giveTool()
	{ //define a method;
		System.out.println(this.toolName);
	}
}