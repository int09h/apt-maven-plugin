/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.maven.apt;

import java.io.File;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name="process", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class AnnotationProcessorMojo extends AbstractProcessorMojo {

    /**
     * @parameter
     */
    @Parameter(property = "outputDirectory")
    private File outputDirectory;

    @Override
    public File getOutputDirectory() {
        return outputDirectory;
    }

    public void setOutputDirectory(File outputDirectory) {
        this.outputDirectory = outputDirectory;
    }
    
}
