package org.monarchinitiative.owlsim.compute.matcher.mp;

import java.io.FileNotFoundException;

import org.monarchinitiative.owlsim.compute.matcher.ProfileMatcher;
import org.monarchinitiative.owlsim.compute.matcher.impl.GridProfileMatcher;
import org.monarchinitiative.owlsim.kb.BMKnowledgeBase;
import org.monarchinitiative.owlsim.kb.NonUniqueLabelException;
import org.monarchinitiative.owlsim.kb.filter.UnknownFilterException;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;

public class GridProfileMatcherMPTest extends AbstractProfileMatcherMPTest {

	protected ProfileMatcher createProfileMatcher(BMKnowledgeBase kb) {
		return GridProfileMatcher.create(kb);
	}

	@Override
	public void testSgDiseaseExact() throws Exception {
		testSgDiseaseExact(DISEASE.sg, null);

	}

	@Override
	public void testSgDiseaseLeaveOneOut() throws Exception {
		testSgDiseaseLeaveOneOut(DISEASE.sg, null);
	}


	@Override
	public void testMultiPhenotypeDisease() throws Exception {
		testMultiPhenotypeDisease(DISEASE.foo, null); //
	}


	@Override
	public void testEpDiseaseFuzzy() throws Exception {
		testEpDiseaseFuzzy(DISEASE.ep, null);
	}


	@Override
	public void testNervousSystemDisease() throws Exception {
		testNervousSystemDisease(DISEASE.foo, null);
	}

	@Override
	public void testPdDisease() throws Exception {

	}

}
