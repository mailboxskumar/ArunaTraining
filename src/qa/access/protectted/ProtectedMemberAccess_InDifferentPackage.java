package qa.access.protectted;

import qa.protectted.accessmodifier.ProtectedAccessModifier;

public class ProtectedMemberAccess_InDifferentPackage {

	public static void main(String args[]) {
		
		ProtectedAccessModifier obj = new ProtectedAccessModifier();
		
		//System.out.println(obj.address);
		//System.out.println(obj.cell);
		
		/* Cannot access protected members from different packages */

	}

}
