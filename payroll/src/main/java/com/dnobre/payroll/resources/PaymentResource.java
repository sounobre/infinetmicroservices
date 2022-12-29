package com.dnobre.payroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnobre.payroll.entities.Payment;
import com.dnobre.payroll.services.PaymentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/payments")
@Api(tags = { "Payments" })
public class PaymentResource {

	@Autowired
	private PaymentService service;
	
	@ApiOperation(value = "${swagger.api.operation.payroll.buscarpagamento.value}", 
			  notes = "${swagger.api.operation.payroll.buscarpagamento.notes}")
	@GetMapping(value = "/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
		Payment payment = service.getPayment(workerId, days);
		return ResponseEntity.ok(payment);
	}	
	
//	public ResponseEntity<Payment> getPaymentAlternative(Long workerId, Integer days) {
//		Payment payment = new Payment("Brann", 400.0, days);
//		return ResponseEntity.ok(payment);
//	}
}
