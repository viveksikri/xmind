/* ******************************************************************************
 * Copyright (c) 2006-2010 XMind Ltd. and others.
 * 
 * This file is a part of XMind 3. XMind releases 3 and
 * above are dual-licensed under the Eclipse Public License (EPL),
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 * and the GNU Lesser General Public License (LGPL), 
 * which is available at http://www.gnu.org/licenses/lgpl.html
 * See http://www.xmind.net/license.html for details.
 * 
 * Contributors:
 *     XMind Ltd. - initial API and implementation
 *******************************************************************************/
package org.xmind.core;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public interface IFileEntry extends IAdaptable {

    String getPath();

    String getMediaType();

    boolean hasBeenReferred();

    int getReferenceCount();

    void increaseReference();

    void decreaseReference();

    InputStream getInputStream();

    OutputStream getOutputStream();

    boolean isDirectory();

    List<IFileEntry> getSubEntries();

    /**
     * Returns the time this entry last modified.
     * 
     * @return The time this entry last modified; or -1 if this entry is not
     *         accessable or some error occurred while getting the time.
     */
    long getTime();

    void setTime(long time);

    long getSize();

    /**
     * @return
     */
    IEncryptionData getEncryptionData();

    /**
     * 
     * @return
     */
    IEncryptionData createEncryptionData();

    /**
     * 
     */
    void deleteEncryptionData();

}