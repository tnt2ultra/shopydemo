package ru.demo.shopy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTemplateSoapClient {

	static final Logger log = LoggerFactory.getLogger(RestTemplateSoapClient.class);

	private static final String URL_SERVICE_SOAP = "http://www.shopy.vn/CheckAllValuePosImpl";

	public static final String xml = "<soapenv:Envelope\r\n"
			+ "xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"\r\n"
			+ "xmlns:ser=\"http://service.client.pos.shopy.viettel.com/\">\r\n"
			+ "   <soapenv:Header/>\r\n"
			+ "   <soapenv:Body>\r\n"
			+ "      <ser:getDateDatabase/>\r\n"
			+ "   </soapenv:Body>\r\n"
			+ "</soapenv:Envelope>";

	public static void main(String args[]) {
		String response = callRestTemplateSoapService(xml);
		log.info(response);
	}

	public static String callRestTemplateSoapService(String xml) {
		log.info("callRestTemplateSoapService started");
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.TEXT_XML);
		HttpEntity<String> entity = new HttpEntity<>(xml, header);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.exchange(URL_SERVICE_SOAP, HttpMethod.POST, entity, String.class);
		String response = responseEntity.getBody();
		log.debug("response = " + response);
		response = response.substring(response.indexOf("<return>") + "<return>".length(), response.indexOf("</return>"));
		return "return: " + response;
	}

}
