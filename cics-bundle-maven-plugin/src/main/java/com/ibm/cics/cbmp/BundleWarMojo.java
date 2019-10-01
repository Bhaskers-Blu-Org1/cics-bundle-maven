package com.ibm.cics.cbmp;

import org.apache.maven.plugin.MojoExecutionException;

/*-
 * #%L
 * CICS Bundle Maven Plugin
 * %%
 * Copyright (C) 2019 IBM Corp.
 * %%
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * #L%
 */

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;

/**
 * Package the produced WAR project as a CICS bundle.
 */
@Mojo(name = "bundle-war", requiresDependencyResolution = ResolutionScope.TEST, defaultPhase = LifecyclePhase.VERIFY)
public class BundleWarMojo extends AbstractBundleJavaMojo {
	
	@Override
	protected AbstractJavaBundlePartBinding getBundlePartBinding(org.apache.maven.artifact.Artifact artifact) throws MojoExecutionException {
		return new Warbundle();
	}

}