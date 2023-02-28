package edu.fra.uas.conversation.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@RestController
//@RequestMapping(value = "/barChart")
@Controller
public class GraphController {
	private static final Logger log = LoggerFactory.getLogger(GraphController.class);

	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		log.debug("/Dashboard --> start ");
		return "dashboard";
	}

	@RequestMapping("/dashboard2")
	public String dashboard2(Model model) {
		log.debug("/test dash --> start ");
		return "dashboard2";
	}

	@RequestMapping("/barChart")
	public String barChart(Model model) {
		log.debug("/bar Chart --> start ");
		return "barChart";
	}

	@RequestMapping("/barChartName")
	public String barChartName(Model model) {
		log.debug("/barChartName--> start ");
		return "barChartName";
	}

	@RequestMapping("/pieChart")
	public String pieChart(Model model) {
		log.debug("/pieChart--> start ");
		return "pieChart";
	}

	@RequestMapping("/basicLine")
	public String basicLine(Model model) {
		log.debug("/basicLine --> start ");
		model.addAttribute("pass", 90);
		model.addAttribute("fail", 10);
		return "basicLine";
	}

	@RequestMapping("/lineChart")
	public String lineChart(Model model) {
		log.debug("/Line Chart --> start ");
		return "lineChart";
	}

	@RequestMapping("/areaChart")
	public String areaChart(Model model) {
		log.debug("/area Chart --> start ");
		return "areaChart";
	}

	@RequestMapping("/scatterChart")
	public String scatterChart(Model model) {
		log.debug("/scatter Chart --> start ");
		return "scatterChart";
	}

	@RequestMapping("/table_form")
	public String table_form(Model model) {
		log.debug("/Table  --> start ");
		return "table_form";
	}

	@RequestMapping("/stockChart")
	public String stockChart(Model model) {
		log.debug("/stockChart  --> start ");
		return "stockChart";
	}

	@RequestMapping("/candlestickChart")
	public String candlestickChart(Model model) {
		log.debug("/candlestickChart  --> start ");
		return "candlestickChart";
	}

}