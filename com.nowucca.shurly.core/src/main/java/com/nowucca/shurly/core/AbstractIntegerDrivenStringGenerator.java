/**
 * Copyright (c) 2012-2014, Steven Atkinson. All rights reserved.
 */
package com.nowucca.shurly.core;

/**
 * An integer driven string generator with an abstract notion of a fixed alphabet with which to generate short URIs.
 */
public abstract class AbstractIntegerDrivenStringGenerator
        extends AbstractLoadableEntity implements IntegerDrivenStringGenerator {

    public String getName() {
        return this.getClass().getCanonicalName();
    }

    /**
     * What alphabet are you using to map integers onto?
     *
     * @return a string where the set of chars is equivalent to the alphabet to be used for encoding/decoding.
     */
    protected abstract String getAlphabet();

    public String encode(int num) {
        final StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.append(getAlphabet().charAt(num % getAlphabet().length()));
            num /= getAlphabet().length();
        }

        return sb.reverse().toString();
    }

    public int decode(String str) {
        int num = 0;

        final int len = str.length();
        for (int i = 0; i < len; i++) {
            num = num * getAlphabet().length() + getAlphabet().indexOf(str.charAt(i));
        }

        return num;
    }
}
