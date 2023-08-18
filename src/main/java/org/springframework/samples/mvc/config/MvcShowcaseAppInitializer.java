package org.springframework.samples.mvc.config;

import javax.servlet.Filter;

import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Initialize the Servlet container. This class is detected by the Servlet
 * container on startup.
 */
public class MvcShowcaseAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		int a = 3;
		return new Class[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		int a = 3;
		return new Class[] { WebMvcConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		int a = 3;
		return new String[] { "/" };
	}

	@Override
	protected Filter[] getServletFilters() {
		int a = 3;
		return new Filter[] { new DelegatingFilterProxy("csrfFilter") };
	}

}
