package com.nec.doc.controllers;

import com.nec.doc.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "product/index";
	}
	
	@RequestMapping(value = "report1", method = RequestMethod.GET)
	public ModelAndView report1() {
		JasperReportsPdfView view = new JasperReportsPdfView();
	    view.setUrl("classpath:/reports/report1.jrxml");
	    view.setApplicationContext(applicationContext);
	    Map<String, Object> params = new HashMap<String, Object>();
	    params.put("datasource", productService.report());
        return new ModelAndView(view, params);
	}
	
	@RequestMapping(value = "report2", method = RequestMethod.GET)
	public ModelAndView report2() {
		JasperReportsPdfView view = new JasperReportsPdfView();
	    view.setUrl("classpath:/reports/report2.jrxml");
	    view.setApplicationContext(applicationContext);
	    Map<String, Object> params = new HashMap<String, Object>();
	    params.put("datasource", productService.report());
        return new ModelAndView(view, params);
	}
	
	
}
