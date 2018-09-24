package com.airwave.udemypry.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component("requestTimeInterceptor")
public class RequestTimeInterceptor extends HandlerInterceptorAdapter {

	private static final Log LOG = LogFactory.getLog(RequestTimeInterceptor.class);
	
	//Se ejecuta antes de entrar en el metodo del controller (PRIMERO)
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setAttribute("startTime", System.currentTimeMillis());
		return true;
	}
	
	
	//Se ejecuta antes de botar la vista en el navegador (SEGUNDO)
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		long starTime = (long)request.getAttribute("startTime");
		//LOG.info("--  REQUEST URL: '"+ request.getRequestURL().toString() + "' -- TOTAL TIME: '" + (System.currentTimeMillis() - starTime) + "'ms");
		LOG.info("Url to: '"+ request.getRequestURL().toString() + "' in '" + (System.currentTimeMillis() - starTime) + "ms'");
	}


	

}
