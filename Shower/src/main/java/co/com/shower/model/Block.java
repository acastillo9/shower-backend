package co.com.shower.model;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Block {

	@Id
	private String id;
	private String name;
	private String description;
	private String type;
	private Map<String, Object> features;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Map<String, Object> getFeatures() {
		return features;
	}

	public void setFeatures(Map<String, Object> features) {
		this.features = features;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
