/*
 * Copyright (c) 2014 Villu Ruusmann
 */
package org.dmg.pmml;

import javax.xml.bind.annotation.*;

@XmlRegistry
public class CustomObjectFactory extends ObjectFactory {

	@Override
	public CustomPMML createPMML(){
		return new CustomPMML();
	}
}