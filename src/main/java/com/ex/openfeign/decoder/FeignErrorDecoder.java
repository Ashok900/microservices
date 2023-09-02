package com.ex.openfeign.decoder;

import com.ex.openfeign.exception.BadRequestException;

import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignErrorDecoder implements ErrorDecoder{

	@Override
	public Exception decode(String methodKey, Response response) {
		switch(response.status()){
		 case 400:
             return (Exception) new BadRequestException("Bad request error from Book service");
         default:
             return new Exception("Generic error");
		}
	}

}
