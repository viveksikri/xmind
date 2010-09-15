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
package org.xmind.ui.internal.properties;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class Utils {

    private Utils() {
    }

    public static void setAllEnabled(Control control, boolean enabled) {
        if (control == null || control.isDisposed())
            return;

        control.setEnabled(enabled);

        if (control instanceof Composite) {
            Control[] children = ((Composite) control).getChildren();
            for (Control c : children) {
                setAllEnabled(c, enabled);
            }
        }
    }

}