package ca.uottawa.aarau028.CSI5137.assignment;

import java.io.IOException;

import org.apache.uima.UIMAException;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.collection.CollectionReaderDescription;
import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.fit.factory.CollectionReaderFactory;
import org.apache.uima.fit.pipeline.SimplePipeline;
import org.uimafit.component.xwriter.CASDumpWriter;

import ca.uottawa.aarau028.CSI5137.assignment.analyzer.AdjectivesAfterCounter;
import ca.uottawa.aarau028.CSI5137.assignment.analyzer.DependencyWithClosestDetector;
import ca.uottawa.aarau028.CSI5137.assignment.analyzer.IngVerbAfterDetector;
import ca.uottawa.aarau028.CSI5137.assignment.analyzer.ItDetector;
import ca.uottawa.aarau028.CSI5137.assignment.analyzer.ItImmediatelyFollowedByAdjNounPhraseDetector;
import ca.uottawa.aarau028.CSI5137.assignment.analyzer.ItImmediatelyFollowingPPDetector;
import ca.uottawa.aarau028.CSI5137.assignment.analyzer.ItPositioner;
import ca.uottawa.aarau028.CSI5137.assignment.analyzer.NeighborPOSTagsExtractor;
import ca.uottawa.aarau028.CSI5137.assignment.analyzer.NounPhraseWithAdjectiveAfterDetector;
import ca.uottawa.aarau028.CSI5137.assignment.analyzer.PrecedingAndSuccedingNounPhrases;
import ca.uottawa.aarau028.CSI5137.assignment.analyzer.PrepositionAfterDetector;
import ca.uottawa.aarau028.CSI5137.assignment.analyzer.PunctuationCounter;
import ca.uottawa.aarau028.CSI5137.assignment.analyzer.SentenceSizer;
import ca.uottawa.aarau028.CSI5137.assignment.analyzer.TokensBeforeNextInfinitiveVerbCounter;
import ca.uottawa.aarau028.CSI5137.assignment.analyzer.TokensBetweenItAndPrepositionCounter;
import ca.uottawa.aarau028.CSI5137.assignment.analyzer.VerbBeforeAndAfterChecker;
import de.tudarmstadt.ukp.dkpro.core.io.text.TextReader;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpChunker;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpPosTagger;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpSegmenter;
import de.tudarmstadt.ukp.dkpro.core.stanfordnlp.StanfordParser;

public class PipelineRunner {

	public static void main(String[] args) throws UIMAException, IOException {
		CollectionReaderDescription entrada = CollectionReaderFactory.createReaderDescription(TextReader.class,
				TextReader.PARAM_SOURCE_LOCATION, "input/document.txt", TextReader.PARAM_LANGUAGE, "en");
		AnalysisEngineDescription segmenter = AnalysisEngineFactory
				.createEngineDescription(OpenNlpSegmenter.class);

		AnalysisEngineDescription itDetector = AnalysisEngineFactory.createEngineDescription(ItDetector.class);

		AnalysisEngineDescription itPositioner = AnalysisEngineFactory.createEngineDescription(ItPositioner.class);

		AnalysisEngineDescription sentenceSizer = AnalysisEngineFactory.createEngineDescription(SentenceSizer.class);

		AnalysisEngineDescription posTagger = AnalysisEngineFactory.createEngineDescription(OpenNlpPosTagger.class);

		AnalysisEngineDescription punctuationCounter = AnalysisEngineFactory
				.createEngineDescription(PunctuationCounter.class);

		AnalysisEngineDescription neighborNPs = AnalysisEngineFactory
				.createEngineDescription(PrecedingAndSuccedingNounPhrases.class);

		AnalysisEngineDescription chunker = AnalysisEngineFactory.createEngineDescription(OpenNlpChunker.class);

		AnalysisEngineDescription writer = AnalysisEngineFactory.createEngineDescription(CASDumpWriter.class
//				,
//				CASDumpWriter.PARAM_TYPE_PATTERNS, new String[] { "+|.*It" }
		);

//		AnalysisEngineDescription writer = AnalysisEngineFactory.createEngineDescription(FeatureMatrixWriter.class, FeatureMatrixWriter.PARAM_PATH, "output/");

		AnalysisEngineDescription immediatelyFollowsPP = AnalysisEngineFactory
				.createEngineDescription(ItImmediatelyFollowingPPDetector.class);
		AnalysisEngineDescription neighborsPOS = AnalysisEngineFactory
				.createEngineDescription(NeighborPOSTagsExtractor.class);
		AnalysisEngineDescription followedByIng = AnalysisEngineFactory
				.createEngineDescription(IngVerbAfterDetector.class);
		AnalysisEngineDescription followedByPrep = AnalysisEngineFactory
				.createEngineDescription(PrepositionAfterDetector.class);
		AnalysisEngineDescription adjectivesAfter = AnalysisEngineFactory
				.createEngineDescription(AdjectivesAfterCounter.class);
		AnalysisEngineDescription verbsBeforeAfter = AnalysisEngineFactory
				.createEngineDescription(VerbBeforeAndAfterChecker.class);
		AnalysisEngineDescription npwaaDetector = AnalysisEngineFactory
				.createEngineDescription(NounPhraseWithAdjectiveAfterDetector.class);

		AnalysisEngineDescription tbnivCounter = AnalysisEngineFactory
				.createEngineDescription(TokensBeforeNextInfinitiveVerbCounter.class);
		AnalysisEngineDescription tbiapCounter = AnalysisEngineFactory
				.createEngineDescription(TokensBetweenItAndPrepositionCounter.class);
		AnalysisEngineDescription immediatelyFollowedByAdjNounPhraseDetector = AnalysisEngineFactory
				.createEngineDescription(ItImmediatelyFollowedByAdjNounPhraseDetector.class);
		AnalysisEngineDescription parser = AnalysisEngineFactory.createEngineDescription(StanfordParser.class);
		AnalysisEngineDescription dependencyWithClosestDetector = AnalysisEngineFactory
				.createEngineDescription(DependencyWithClosestDetector.class);

		SimplePipeline.runPipeline(entrada, segmenter, itDetector, itPositioner, sentenceSizer, posTagger,
				punctuationCounter, chunker, neighborNPs, immediatelyFollowsPP, neighborsPOS, followedByIng,
				followedByPrep, adjectivesAfter, verbsBeforeAfter, npwaaDetector, tbnivCounter, tbiapCounter,
				immediatelyFollowedByAdjNounPhraseDetector, parser, dependencyWithClosestDetector, writer);
	}

}
