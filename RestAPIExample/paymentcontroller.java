package com.programmer.gate;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/payment")
public class paymentcontroller {

	private final String sharedkey = "shared_key";
	private static final String success_status = "success";
	private static final String error_status = "error";
	private static final int code_success = 100;
	private static final int auth_failure = 102;

	@RequestMapping(value = "/pay", method = RequestMethod.POST)	
	public bareresponse pay(@RequestParam (value = "key") String key, @RequestBody paymentrequest request) {

		bareresponse response = new bareresponse();
		if (sharedkey.equalsIgnoreCase(key)) {
			int userid = request.getUserId();
			String itemid = request.getItemId();
			double discount = request.getDiscount();

			// process the request
			// ...
			// return success response to the client

			response.setStatus(success_status);
			response.setCode(code_success);
		} else {
			response.setStatus(error_status);
			response.setCode(auth_failure);
		}
		return response;
	}
	
}
