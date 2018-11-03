package qa.protectted.accessmodifier;

public class ProtectedAccessModifier_CanAccessInSamePackage{

	public static void main(String args[]) {
		
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
		System.out.println(obj.address);
		System.out.println(obj.cell);

	}

}
