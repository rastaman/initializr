package io.spring.initializr.metadata;

import java.util.Objects;

public class Plugin {

	private String groupId;
	
	private String artifactId;
	
	private String version;
	
	private String configuration;
	
	private String executions;

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getArtifactId() {
		return artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public String getExecutions() {
		return executions;
	}

	public void setExecutions(String executions) {
		this.executions = executions;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof Plugin)) {
			return false;
		}
		Plugin castOther = (Plugin) other;
		return Objects.equals(groupId, castOther.groupId) && Objects.equals(artifactId, castOther.artifactId)
				&& Objects.equals(version, castOther.version) && Objects.equals(configuration, castOther.configuration)
				&& Objects.equals(executions, castOther.executions);
	}

	@Override
	public int hashCode() {
		return Objects.hash(groupId, artifactId, version, configuration, executions);
	}

	/*
            <plugin>
                <groupId>com.github.eirslett</groupId>
                <artifactId>frontend-maven-plugin</artifactId>
                <version>1.2</version>
                <configuration>
                    <installDirectory>target</installDirectory>
                </configuration>
                <executions>
                    <execution>
                        <id>install node and npm</id>
                        <goals>
                            <goal>install-node-and-npm</goal>
                        </goals>
                        <configuration>
                            <nodeVersion>v6.11.4</nodeVersion>
                        </configuration>
                    </execution>
                    <execution>
                        <id>npm install</id>
                        <goals>
                            <goal>npm</goal>
                        </goals>
                        <configuration>
                            <arguments>install</arguments>
                        </configuration>
                    </execution>
                    <execution>
                        <id>webpack build</id>
                        <goals>
                            <goal>webpack</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>npm-run-build</id>
                        <goals>
                            <goal>npm</goal>
                        </goals>
                        <configuration>
                            <arguments>run build</arguments>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
	 */
	
}
