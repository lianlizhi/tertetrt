
import java.util.HashMap;
import java.util.Map;


public enum CodeType {
	
	
	tempCode("01","临时code"),
	
	newCode("02","新code"),
	
	oldCode("03","旧coe"),
	otherCode("99","其他code") ;
	
	private CodeType(String name , String desc){
		this.name = name ;
		this.desc = desc ;
	}
	
	private String name;
	
	private String desc ;
	
	static Map<String, CodeType> valueMap ;
	
	static{
		valueMap = new HashMap<>();
		for (CodeType codeType : CodeType.values()) {
			valueMap.put(codeType.name, codeType);
		}
	}
	
	
	public static CodeType getcodeByName(String value){
		  CodeType type = CodeType.otherCode;
		  if(valueMap.containsKey(value)){
			  type= valueMap.get(value);
		  }
		  return type ;
		
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
	
	
}
