package parameters.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import parameters.models.Supplier;
import parameters.services.CountryService;
import parameters.services.StateService;
import parameters.services.SupplierService;

@Controller
public class SupplierController {

	@Autowired	private SupplierService supplierService;
	@Autowired	private CountryService countryService;
	@Autowired	private StateService stateService;

	public Model addModelAttributes(Model model){
		model.addAttribute("suppliers", supplierService.findAll());
		model.addAttribute("countries", countryService.findAll());
		model.addAttribute("states", stateService.findAll());
		return model;
	}

	@GetMapping("/parameters/suppliers")
	public String findAll(Model model){
		addModelAttributes(model);
		return "/parameters/suppliers";
	}

	@GetMapping("/parameters/supplierAdd")
	public String addSupplier(Model model){
		model.addAttribute("countries", countryService.findAll());
		return "parameters/supplierAdd";
	}

	//The op parameter is either Edit or Details
	@GetMapping("/parameters/supplier/{op}/{id}")
	public String editSupplier(@PathVariable Integer id, @PathVariable String op, Model model){
		Supplier supplier = supplierService.findById(id);
		model.addAttribute("supplier", supplier);
		addModelAttributes(model);
		return "/parameters/supplier"+ op; //returns supplierEdit or supplierDetails
	}

	@PostMapping("/parameters/suppliers")
	public String save(Supplier supplier) {
		supplierService.save(supplier);
		return "redirect:/parameters/suppliers";
	}

	@RequestMapping(value="/parameters/suppliers/delete/{id}", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String deleteById(@PathVariable Integer id) {
		supplierService.deleteById(id);
		return "redirect:/parameters/suppliers";
	}

}
