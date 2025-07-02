package conditional_statements;

public class Switch_CaseDemo {

	public static void main(String[] args) {
		char x='a';
		switch(x)
		{
		case 'l':
			System.out.println("This code contain letters");
			break;
		case 'd':
			System.out.println("This code contains digits");
			break;
		case 's':
			System.out.println("This code contains strings");
		break;
		case 'w':
			System.out.println("This code cobtains whitespaces");
			break;
		default:
			System.out.println("This code doesn't contain any letter, digits, strings, whitespaces");
			break;
		}
	}

}
