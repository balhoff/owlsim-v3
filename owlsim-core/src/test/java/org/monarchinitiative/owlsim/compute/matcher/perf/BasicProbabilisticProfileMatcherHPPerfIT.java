package org.monarchinitiative.owlsim.compute.matcher.perf;

import org.apache.log4j.Logger;
import org.monarchinitiative.owlsim.compute.matcher.AbstractProfileMatcherTest;
import org.monarchinitiative.owlsim.compute.matcher.ProfileMatcher;
import org.monarchinitiative.owlsim.compute.matcher.impl.NaiveBayesFixedWeightTwoStateProfileMatcher;
import org.monarchinitiative.owlsim.eval.TestQuery;
import org.monarchinitiative.owlsim.kb.BMKnowledgeBase;
import org.monarchinitiative.owlsim.kb.LabelMapper;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;

// TODO: Fix test
public class BasicProbabilisticProfileMatcherHPPerfIT extends AbstractProfileMatcherTest {

	private Logger LOG = Logger.getLogger(BasicProbabilisticProfileMatcherHPPerfIT.class);

	protected ProfileMatcher createProfileMatcher(BMKnowledgeBase kb) {
		return NaiveBayesFixedWeightTwoStateProfileMatcher.create(kb);
	}

	//@Test
	public void testBasic() throws Exception {
		loadHP();
		//LOG.info("INDS="+kb.getIndividualIdsInSignature());
		ProfileMatcher profileMatcher = createProfileMatcher(kb);
		LabelMapper labelMapper = kb.getLabelMapper();
		TestQuery tq = eval.constructTestQuery(labelMapper,
				"http://purl.obolibrary.org/obo/OMIM_270400",
				10,
				//"Aplasia/hypoplasia of the extremities",
				"Scrotal hypoplasia",
				"Renal cyst",
				"Micrognathia");
		//assertTrue(eval.evaluateTestQuery(profileMatcher, tq));
		
	}

	private void loadHP() throws OWLOntologyCreationException {
		load("/ontologies/hp.obo", "/data/omim-disease-phenotype.owl", "/data/disorders.ttl");
		
	}

}
