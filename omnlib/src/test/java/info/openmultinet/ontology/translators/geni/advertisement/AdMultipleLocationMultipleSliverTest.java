package info.openmultinet.ontology.translators.geni.advertisement;

import info.openmultinet.ontology.exceptions.DeprecatedRspecVersionException;
import info.openmultinet.ontology.exceptions.InvalidModelException;
import info.openmultinet.ontology.exceptions.MissingRspecElementException;
import info.openmultinet.ontology.translators.AbstractConverter;
import info.openmultinet.ontology.translators.geni.RSpecValidation;

import java.io.IOException;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class AdMultipleLocationMultipleSliverTest {

	@Test
	public void adRoundtrip() throws JAXBException, InvalidModelException,
			IOException, XMLStreamException, MissingRspecElementException,
			DeprecatedRspecVersionException {
//		final String filename = "/geni/advertisement/location_ext.xml";
//		final String inputRspec = AbstractConverter.toString(filename);
//
//		System.out.println("Converting this input from '" + filename + "':");
//		System.out.println("===============================");
//		System.out.println(inputRspec);
//		System.out.println("===============================");
//
//		final String outputRspec = RSpecValidation
//				.completeRoundtripVerbose(inputRspec, true);
//
//		System.out.println("Generated this rspec:");
//		System.out.println("===============================");
//		System.out.println(outputRspec);
//		System.out.println("===============================");
//
//		Assert.assertTrue("type",
//				outputRspec.contains("type=\"advertisement\""));
//
//		System.out.println("===============================");
//		System.out.println("Diffs:");
//		int[] diffsNodes = RSpecValidation.getDiffsNodesVerbose(inputRspec, true);
//		if (diffsNodes[0] == 0) {
//			// TODO: This test does not consistently return 0, only sometimes.
//			// Need
//			// to debug.
//			Assert.assertTrue("No differences between input and output files",
//					diffsNodes[0] == 0);
//		} else {
//			Document xmlDoc = RSpecValidation.loadXMLFromString(outputRspec);
//
//			// check that output has one rspec element
//			NodeList rspec = xmlDoc.getElementsByTagNameNS(
//					"http://www.geni.net/resources/rspec/3", "rspec");
//			Assert.assertTrue(rspec.getLength() == 1);
//
//			NodeList nodes = xmlDoc.getElementsByTagNameNS(
//					"http://www.geni.net/resources/rspec/3", "node");
//			Assert.assertTrue(nodes.getLength() == 1);
//
//			String nodeComponentManagerID = nodes.item(0).getAttributes()
//					.getNamedItem("component_manager_id").getNodeValue();
//			Assert.assertTrue(nodeComponentManagerID
//					.equals("urn:publicid:IDN+testbed.example.org+authority+cm"));
//
//			String componentName = nodes.item(0).getAttributes()
//					.getNamedItem("component_name").getNodeValue();
//			Assert.assertTrue(componentName.equals("Openstack-1"));
//
//			String componentId = nodes.item(0).getAttributes()
//					.getNamedItem("component_id").getNodeValue();
//			Assert.assertTrue(componentId
//					.equals("urn:publicid:IDN+testbed.example.org+node+http%3A%2F%2Ftestbed.example.org%2Fresources%23Openstack-1"));
//
//			NodeList sliverType = xmlDoc.getElementsByTagNameNS(
//					"http://www.geni.net/resources/rspec/3", "sliver_type");
//			Assert.assertTrue(sliverType.getLength() == 3);
//
//		}

	}

}
