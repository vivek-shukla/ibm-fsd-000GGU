package comm.bean.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import comm.bean.entity.Customer;
import comm.bean.service.CustomerService;

@Controller
//@RequestMapping("/customer")
public class CustomerController {
    @Autowired
	private CustomerService customerService;
	@GetMapping("/customer")
	public String redirectToForm(Model theModel)
	{   
		Customer customerObj = new Customer();
		theModel.addAttribute("customerObj", customerObj);
		return "customerForm";
	}
	
	@PostMapping("/saveCustomer")
	public String redirectToHome(@ModelAttribute("customerObj")Customer customerObj,Model theModel)
	{
		customerService.insertCustomer(customerObj);
		return "success";
	}
	
	@GetMapping("/listCustomer")
	public String redirectToList(Model theModel)
	{
		List<Customer> customerList = customerService.fetchCustomer();
		theModel.addAttribute("customerList", customerList);
		return "listCustomer";
	}
	@GetMapping("/delete")
	public String delete(Model theModel,HttpServletRequest request)
	{
		int id = Integer.parseInt(request.getParameter("id"));
		customerService.deleteCustomer(id);
		return "redirect:/listCustomer";
	}
	@GetMapping("/update")
	public String update(Model theModel,HttpServletRequest request)
	{
		int id = Integer.parseInt(request.getParameter("id"));
		Customer customerObj = customerService.findCustomer(id);
		theModel.addAttribute("customerObj",customerObj );
		return "updateForm";
	}
	@PostMapping("/updateCustomer")
	public String updateCustomer(@ModelAttribute("customerObj")Customer customerObj,Model theModel)
	{
		customerService.updateCustomer(customerObj);
		return "redirect:/listCustomer";
	}
	
	@GetMapping("/searchCustomer")
	public String searchCustomer()
	{
		return "searchForm";
	}
	
	@GetMapping("/searchBy")
	public String searchBy(HttpServletRequest request,Model theModel)
	{
		String criteria = (String) request.getParameter("searchCriteria");
		System.out.println(criteria);
		List<Customer> customerList = customerService.searchBy(criteria);
		theModel.addAttribute("customerList", customerList);
		return "searchedObj";
	}
	
	
	
	
}
