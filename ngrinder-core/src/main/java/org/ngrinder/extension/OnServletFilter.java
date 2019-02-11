package org.ngrinder.extension;

import javax.servlet.Filter;

import ro.fortsoft.pf4j.ExtensionPoint;

/**
 * Plugin extension point Proxy filter which run combined servlet plugins.
 *
 * @author JunHo Yoon
 * @since 3.0
 */
public interface OnServletFilter extends ExtensionPoint, Filter {

}
