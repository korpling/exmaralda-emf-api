/**
 * Copyright 2009 Humboldt-Universität zu Berlin, INRIA.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */
package de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.resources;

import java.io.FileOutputStream;
import java.io.PrintStream;

import org.eclipse.emf.common.util.URI;

import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.UDInformation;

public class EXBWriter {
	/**
	 * Encoding in which file has to be written
	 */
	private String encoding = "UTF-8";

	/**
	 * Stream in which the file content is written.
	 */
	PrintStream fileWriter = null;

	/**
	 * Stores a a treetagger-model into tab-seperated file.
	 */
	public void write(BasicTranscription basicTranscription, URI uri) throws java.io.IOException {
		// TODO: change fileWriter to StringBuffer, at the end of process write data
		// into file
		this.fileWriter = new PrintStream(new FileOutputStream(uri.toFileString()), true, this.encoding);
		try {
			// print head
			fileWriter.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			{// print basic-transcription
				fileWriter.println("<basic-transcription>");
				{// print head
					fileWriter.println("<head>");
					{// print meta-information
						fileWriter.println("<meta-information>");
						{// project-name
							fileWriter.print("<project-name>");
							if ((basicTranscription.getMetaInformation() != null)
									&& (basicTranscription.getMetaInformation().getProjectName() != null))
								fileWriter.print(basicTranscription.getMetaInformation().getProjectName());
							fileWriter.print("</project-name>");
						}
						{// transcription-name
							fileWriter.print("<transcription-name>");
							if ((basicTranscription.getMetaInformation() != null)
									&& (basicTranscription.getMetaInformation().getTranscriptionName() != null))
								fileWriter.print(basicTranscription.getMetaInformation().getTranscriptionName());
							fileWriter.print("</transcription-name>");
						}
						{// referenced-file
							fileWriter.print("<referenced-file");
							fileWriter.print(" url=\"");
							if (((basicTranscription.getMetaInformation() != null))
									&& (basicTranscription.getMetaInformation().getReferencedFile() != null))
								fileWriter.print(basicTranscription.getMetaInformation().getReferencedFile());
							fileWriter.print("\">");
							fileWriter.print("</referenced-file>");
						}
						{// ud-information

							// if ud-information exists
							if ((basicTranscription.getMetaInformation() != null)
									&& (basicTranscription.getMetaInformation().getUdMetaInformations() != null)
									&& (basicTranscription.getMetaInformation().getUdMetaInformations().size() > 0)) {
								fileWriter.print("<ud-meta-information>");
								for (UDInformation udInfo : basicTranscription.getMetaInformation()
										.getUdMetaInformations()) {
									// udinfo cannot has an empty name
									if ((udInfo.getAttributeName() != null)
											&& (!udInfo.getAttributeName().equals(""))) {
										fileWriter.print("<ud-information");
										fileWriter.print(" attribute-name=\"" + udInfo.getAttributeName() + "\">");
										if (udInfo.getValue() != null)
											fileWriter.print(udInfo.getValue());
										fileWriter.print("</ud-information>");
									}
								}
								fileWriter.print("</ud-meta-information>");
							}
							// print empty ud-information
							else {
								fileWriter.print("<ud-meta-information/>");
							}
						}
						{// comment
							fileWriter.print("<comment>");
							if (((basicTranscription.getMetaInformation() != null))
									&& (basicTranscription.getMetaInformation().getComment() != null)) {
								fileWriter.print(basicTranscription.getMetaInformation().getComment());
							}
							fileWriter.print("</comment>");
						}
						{// transcription-convention
							fileWriter.print("<transcription-convention>");
							if ((basicTranscription.getMetaInformation() != null)
									&& (basicTranscription.getMetaInformation().getTranscriptionConvention() != null))
								fileWriter.print(basicTranscription.getMetaInformation().getTranscriptionConvention());
							fileWriter.print("</transcription-convention>");
						}
						this.fileWriter.println("</meta-information>");
					}
					{// speakertable
						if (basicTranscription.getSpeakertable() != null) {
							fileWriter.println("<speakertable>");
							for (Speaker speaker : basicTranscription.getSpeakertable()) {// speaker
								fileWriter.print("<speaker");
								if (speaker.getId() != null)
									fileWriter.print(" id=\"" + speaker.getId() + "\">");
								else
									fileWriter.print(">");
								{// abbreviation
									fileWriter.println();
									fileWriter.print("<abbreviation>");
									if (speaker.getAbbreviation() != null)
										fileWriter.print(speaker.getAbbreviation());
									fileWriter.println("</abbreviation>");
								}
								{// sex
									fileWriter.print("<sex");
									if (speaker.isSetSex())
										fileWriter.print(" value=\"" + speaker.getSex() + "\">");
									else
										fileWriter.print(">");
									fileWriter.println("</sex>");
								}
								{// languages-used
									fileWriter.print("<languages-used>");
									for (String lang : speaker.getLanguageUsed()) {
										fileWriter.print("<language lang=\"");
										fileWriter.print(lang);
										fileWriter.println("\"></language>");
									}
									fileWriter.println("</languages-used>");
								}
								{// l1
									fileWriter.print("<l1>");
									for (String lang : speaker.getL1()) {
										fileWriter.print("<language lang=\"");
										fileWriter.print(lang);
										fileWriter.println("</language>");
									}
									fileWriter.println("</l1>");
								}
								{// l2
									fileWriter.print("<l2>");
									for (String lang : speaker.getL2()) {
										fileWriter.print("<language lang=\"");
										fileWriter.print(lang);
										fileWriter.println("</language>");
									}
									fileWriter.println("</l2>");
								}
								{// ud-information
									fileWriter.print("<ud-speaker-information>");
									for (UDInformation udInfo : speaker.getUdSpeakerInformations()) {
										// udinfo cannot has an empty name
										if ((udInfo.getAttributeName() != null)
												&& (!udInfo.getAttributeName().equals(""))) {
											fileWriter.print("<ud-information");
											fileWriter.print(" attribute-name=\"" + udInfo.getAttributeName() + "\">");
											if (udInfo.getValue() != null)
												fileWriter.print(udInfo.getValue());
											fileWriter.print("</ud-information>");
										}
									}
									fileWriter.println("</ud-speaker-information>");

								}
								{// comment
									fileWriter.print("<comment>");
									if (speaker.getComment() != null)
										fileWriter.print(speaker.getComment());
									fileWriter.println("</comment>");
								}
								fileWriter.println("</speaker>");
							}
							fileWriter.println("</speakertable>");
						}
					}
					fileWriter.println("</head>");
				}
				{// basic-body
					fileWriter.println("<basic-body>");
					if (basicTranscription.getCommonTimeLine() != null) {// common timeline
						fileWriter.println("<common-timeline>");
						for (TLI tli : basicTranscription.getCommonTimeLine().getTLIs()) {// tli
							StringBuilder element = new StringBuilder();
							element.append("<tli");
							if (tli.getId() != null)
								element.append(" id=\"" + tli.getId() + "\"");
							if (tli.getTime() != null)
								element.append(" time=\"" + tli.getTime() + "\"");
							if (tli.isSetType())
								element.append(" type=\"" + tli.getType() + "\"");
							element.append("/>");
							fileWriter.println(element);
							// fileWriter.println("</tli>");
						}
						fileWriter.println("</common-timeline>");
					}
					for (Tier tier : basicTranscription.getTiers()) {// tier

						StringBuilder element = new StringBuilder();
						element.append("<tier");
						if (tier.getId() != null)
							element.append(" id=\"" + tier.getId() + "\"");
						if (tier.getSpeaker() != null)
							element.append(" speaker=\"" + tier.getSpeaker().getId() + "\"");
						if (tier.getCategory() != null)
							element.append(" category=\"" + tier.getCategory() + "\"");
						if (tier.isSetType())
							element.append(" type=\"" + tier.getType() + "\"");
						if (tier.getDisplayName() != null)
							element.append(" display-name=\"" + tier.getDisplayName() + "\"");
						element.append(">");
						fileWriter.print(element);
						{// ud-information
							if ((tier.getUdTierInformations() != null) && (tier.getUdTierInformations().size() > 0)) {
								fileWriter.print("<ud-tier-information>");
								for (UDInformation udInfo : tier.getUdTierInformations()) {
									// udinfo cannot has an empty name
									if ((udInfo.getAttributeName() != null)
											&& (!udInfo.getAttributeName().equals(""))) {
										fileWriter.print("<ud-information");
										fileWriter.print(" attribute-name=\"" + udInfo.getAttributeName() + "\">");
										if (udInfo.getValue() != null)
											fileWriter.print(udInfo.getValue());
										fileWriter.print("</ud-information>");
									}
								}
								fileWriter.print("</ud-tier-information>");
							}
						}
						if (tier.getEvents().size() > 0) {// event
							fileWriter.println();
							for (Event event : tier.getEvents()) {
								element = new StringBuilder();
								element.append("<event");
								if (event.getStart() != null)
									element.append(" start=\"" + event.getStart().getId() + "\"");
								if (event.getEnd() != null)
									element.append(" end=\"" + event.getEnd().getId() + "\"");
								if (event.isSetMedium()) {
									if (event.getMedium() != null)
										element.append(" medium=\"" + event.getMedium() + "\"");
								}
								if (event.getUrl() != null)
									element.append(" url=\"" + event.getUrl() + "\"");
								element.append(">");
								fileWriter.print(element);
								{// ud-information
									for (UDInformation udInfo : event.getUdInformations()) {
										// udinfo cannot has an empty name
										if ((udInfo.getAttributeName() != null)
												&& (!udInfo.getAttributeName().equals(""))) {
											fileWriter.print("<ud-information");
											fileWriter.print(" attribute-name=\"" + udInfo.getAttributeName() + "\">");
											if (udInfo.getValue() != null)
												fileWriter.print(udInfo.getValue());
											fileWriter.print("</ud-information>");
										}
									}
								}
								// print text
								if ((event.getValue() != null) && (!event.getValue().equals("")))
									fileWriter.print(event.getValue());
								fileWriter.println("</event>");
							}
						}
						fileWriter.println("</tier>");
					}
					fileWriter.println("</basic-body>");
				}
				this.fileWriter.print("</basic-transcription>");
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		} finally {
			fileWriter.flush();
			fileWriter.close();
		}
	}
}
