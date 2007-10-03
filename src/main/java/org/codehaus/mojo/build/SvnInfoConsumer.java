/**
 * The MIT License
 *
 * Copyright (c) 2005 Learning Commons, University of Calgary
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package org.codehaus.mojo.build;

import org.apache.maven.scm.log.ScmLogger;
import org.codehaus.plexus.util.cli.StreamConsumer;

import java.util.HashMap;
import java.util.Map;

/**
 * Parse the info command from svn.
 *
 * @author <a href="mailto:woodj@ucalgary.ca">Julian Wood</a>
 * @version $Id$
 */
public class SvnInfoConsumer
    implements StreamConsumer
{

    private ScmLogger logger;

//    private Map properties = new HashMap();

    private StringBuffer commandOutput = new StringBuffer();

    // ----------------------------------------------------------------------
    //
    // ----------------------------------------------------------------------

    public SvnInfoConsumer( ScmLogger logger )
    {
        this.logger = logger;
    }

    // ----------------------------------------------------------------------
    // StreamConsumer Implementation
    // ----------------------------------------------------------------------

    public void consumeLine( String line )
    {
        commandOutput.append( line );
    }


    /**
     * The raw output from the command.
     * @return the raw output from the command
     */
    public String getCommandOutput()
    {
        return commandOutput.toString();
    }

}