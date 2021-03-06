package org.owasp.appsensor.configuration.client;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Represents a connection to a server from a client. 
 * 
 * @author John Melton (jtmelton@gmail.com) http://www.jtmelton.com/
 */
public class ServerConnection {
	
	private String type;
	private String protocol;
	private String host;
	private int port;
	private String path;
	private String clientApplicationIdentificationHeaderName;
	private String clientApplicationIdentificationHeaderValue;
	
	public String getType() {
		return type;
	}
	
	public ServerConnection setType(String type) {
		this.type = type;
		return this;
	}
	
	public String getProtocol() {
		return protocol;
	}
	
	public ServerConnection setProtocol(String protocol) {
		this.protocol = protocol;
		return this;
	}
	
	public String getHost() {
		return host;
	}
	
	public ServerConnection setHost(String host) {
		this.host = host;
		return this;
	}
	
	public int getPort() {
		return port;
	}
	
	public ServerConnection setPort(int port) {
		this.port = port;
		return this;
	}
	
	public String getPath() {
		return path;
	}
	
	public ServerConnection setPath(String path) {
		this.path = path;
		return this;
	}
	
	public String getClientApplicationIdentificationHeaderName() {
		return clientApplicationIdentificationHeaderName;
	}

	public void setClientApplicationIdentificationHeaderName(
			String clientApplicationIdentificationHeaderName) {
		this.clientApplicationIdentificationHeaderName = clientApplicationIdentificationHeaderName;
	}

	public String getClientApplicationIdentificationHeaderValue() {
		return clientApplicationIdentificationHeaderValue;
	}

	public void setClientApplicationIdentificationHeaderValue(
			String clientApplicationIdentificationHeaderValue) {
		this.clientApplicationIdentificationHeaderValue = clientApplicationIdentificationHeaderValue;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17,31).
				append(type).
				append(protocol).
				append(host).
				append(port).
				append(path).
				append(clientApplicationIdentificationHeaderName).
				append(clientApplicationIdentificationHeaderValue).
				toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		ServerConnection other = (ServerConnection) obj;
		
		return new EqualsBuilder().
				append(type, other.getType()).
				append(protocol, other.getProtocol()).
				append(host, other.getHost()).
				append(port, other.getPort()).
				append(path, other.getPath()).
				append(clientApplicationIdentificationHeaderName, other.getClientApplicationIdentificationHeaderName()).
				append(clientApplicationIdentificationHeaderValue, other.getClientApplicationIdentificationHeaderValue()).
				isEquals();
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this).
				append("type", type).
				append("protocol", protocol).
				append("host", host).
				append("port", port).
				append("path", path).
				append("clientApplicationIdentificationHeaderName", clientApplicationIdentificationHeaderName).
				append("clientApplicationIdentificationHeaderValue", clientApplicationIdentificationHeaderValue).
			    toString();
	}
	
}
