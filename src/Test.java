
public class Test {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(CodeType.tempCode.ordinal());
		
		CodeType[] values = CodeType.values();
		System.out.println(values);
		
		for (CodeType codeType : values) {
			System.out.println(codeType);
			System.out.println(codeType.getDesc());
			System.out.println(codeType.getName());
		}

	}

}
