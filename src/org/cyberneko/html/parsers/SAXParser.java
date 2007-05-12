/* 
 * (C) Copyright 2002, Andy Clark.  All rights reserved.
 *
 * This file is distributed under an Apache style license. Please
 * refer to the LICENSE file for specific details.
 */

package org.cyberneko.html.parsers;

import org.apache.xerces.parsers.AbstractSAXParser;
import org.cyberneko.html.HTMLConfiguration;

/**
 * A SAX parser for HTML documents.
 *
 * @author Andy Clark
 */
public class SAXParser
    extends AbstractSAXParser {

    //
    // Constructors
    //

    /** Default constructor. */
    public SAXParser() {
        super(new HTMLConfiguration());
    } // <init>()

} // class SAXParser
