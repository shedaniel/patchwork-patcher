package net.patchworkmc.patcher.mapping;

public class Mapping extends RawMapping {
	private String description;

	public Mapping(String official, String mcp, String description) {
		super(official, mcp);

		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
