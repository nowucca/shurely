/**
 * Copyright (c) 2007-2012, Kaazing Corporation. All rights reserved.
 */
package com.nowucca.shurely.core.base32;

import com.nowucca.shurely.core.AbstractInMemoryURIStore;
import com.nowucca.shurely.core.AbstractIntegerDrivenStringGenerator;

import javax.annotation.Resource;

public class Base32InMemoryURIStore extends AbstractInMemoryURIStore {

    private Base32StringGenerator generator;

    @Resource
    public void setGenerator(Base32StringGenerator generator) {
        this.generator = generator;
    }

    @Override
    protected AbstractIntegerDrivenStringGenerator getStringGenerator() {
        return generator;
    }

    //-----------------------------------
    // test methods
    //-----------------------------------


    Base32StringGenerator getGenerator() {
        return generator;
    }
}