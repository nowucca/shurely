/**
 * Copyright (c) 2012-2014, Steven Atkinson. All rights reserved.
 */
package com.nowucca.shurely.core.context;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.nullValue;

public class URIManagerContextResolverTest {

    @Test
    public void testSimpleResolve() throws Exception {
        URIManagerContextResolver resolver = new URIManagerContextResolver();
        URIManagerContext context = resolver.resolve("com.nowucca.shurely.core.basic.BasicURIManager");

        Assert.assertThat(context.getURIManager("com.nowucca.shurely.core.basic.BasicURIManager"), not(nullValue()));

    }
}