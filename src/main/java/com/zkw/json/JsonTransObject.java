package com.zkw.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTransObject {
	private final ObjectMapper jsonObjectMapper = new ObjectMapper();
	private void trans() throws JsonParseException, JsonMappingException, IOException{
		String taskJson =  "{\"taskId\": 83}";
		
	}
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		JsonTransObject jsonTransObject = new JsonTransObject();
		jsonTransObject.trans();
	}
}
