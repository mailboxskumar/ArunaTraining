package qa.privat.accessmodifier;

public class PrivateAccessModifier_CanBeUsedInSameClassOnly {

	public static void main(String[] args) {
		
		PrivateAccessModifier obj = new PrivateAccessModifier();

		//System.out.println(obj.salaryOfAruna);  
		/*not possible here because private members can only accessed in same class*/

	}

}
