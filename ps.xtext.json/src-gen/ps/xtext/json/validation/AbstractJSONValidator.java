/*
 * generated by Xtext 2.12.0
 */
package ps.xtext.json.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractJSONValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(ps.xtext.json.jSON.JSONPackage.eINSTANCE);
		return result;
	}
	
}