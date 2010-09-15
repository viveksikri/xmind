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

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.xmind.ui.decorations.IDecorationDescriptor;
import org.xmind.ui.viewers.ImageCachedLabelProvider;

public class DecorationLabelProvider extends
        ImageCachedLabelProvider {

    public String getText(Object element) {
        if (element instanceof IDecorationDescriptor) {
            IDecorationDescriptor descriptor = (IDecorationDescriptor) element;
            return descriptor.getName();
        }
        return super.getText(element);
    }

    protected Image createImage(Object element) {
        if (element instanceof IDecorationDescriptor) {
            IDecorationDescriptor descriptor = (IDecorationDescriptor) element;
            ImageDescriptor icon = descriptor.getIcon();
            if (icon != null)
                return icon.createImage(false);
        }
        return null;
    }
}