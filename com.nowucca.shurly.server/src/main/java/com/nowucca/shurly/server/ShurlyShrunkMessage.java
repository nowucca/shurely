/**
 * Copyright (c) 2012-2014, Steven Atkinson. All rights reserved.
 */
package com.nowucca.shurly.server;

import java.net.URI;

public class ShurlyShrunkMessage extends ShurlyShrinkMessage {

    @Override
    public Kind getKind() {
        return Kind.SHRUNK;
    }

    private URI shortURI;

    public ShurlyShrunkMessage(short version, long msgId, URI longURI, URI shortURI) {
        super(version, msgId, longURI);
        this.shortURI = shortURI;
    }

    public URI getShortURI() {
        return shortURI;
    }
}
