/* ================================================================
 * Delft FEWS 
 * ================================================================
 *
 * Project Info:  http://www.wldelft.nl/soft/fews/index.html
 * Project Lead:  Karel Heynert (karel.heynert@wldelft.nl)
 *
 * (C) Copyright 2003, by WL | Delft Hydraulics
 *                        P.O. Box 177
 *                        2600 MH  Delft
 *                        The Netherlands
 *                        http://www.wldelft.nl
 *
 * DELFT-FEWS is a sophisticated collection of modules designed 
 * for building a FEWS customised to the specific requirements 
 * of individual agencies. An open modelling approach allows users
 * to add their own modules in an efficient way.
 *
 * ----------------------------------------------------------------
 * SslRelaxedTrustManager.java
 * ----------------------------------------------------------------
 * (C) Copyright 2003, by WL | Delft Hydraulics
 *
 * Original Author:  ekkelenk
 * Contributor(s):   
 *
 * Changes:
 * --------
 * 25-Nov-15 : Version 1 ();
 * 
 *
 */

package org.geonetwork.http.proxy.util;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class SslRelaxedTrustManager implements X509TrustManager {

    @Override
    public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
    }

    @Override
    public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}