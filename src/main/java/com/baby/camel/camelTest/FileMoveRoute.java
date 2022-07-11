package com.baby.camel.camelTest;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileMoveRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:src/fileEntry")
		.log("${headers}")
		.log("${body}")
		.to("file:src/outputFile");
	}

}
