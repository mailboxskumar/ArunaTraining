package qa.defult.accessmodifier;

class DefaultAccessModifier_CanBeAccessedOnlySamePackage {
	
	public static void main(String args[]) {
		
		DefaultAccessModifier obj = new DefaultAccessModifier();
		
		System.out.println(obj.a);
	}
}
