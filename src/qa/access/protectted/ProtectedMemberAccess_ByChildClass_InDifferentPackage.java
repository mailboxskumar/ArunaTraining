package qa.access.protectted;

import qa.protectted.accessmodifier.ProtectedAccessModifier;

public class ProtectedMemberAccess_ByChildClass_InDifferentPackage extends ProtectedAccessModifier {

	public static void main(String args[]) {

		System.out.println(address);
		System.out.println(cell);

	}

}
