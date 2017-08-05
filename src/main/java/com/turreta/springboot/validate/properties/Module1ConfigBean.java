package com.turreta.springboot.validate.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Component
@ConfigurationProperties(prefix="module1")
@Validated
@PropertySource("classpath:something-very-important-config.properties")
public class Module1ConfigBean
{
	@NotNull
	@Min(value = 30)
	@Max(value = 120)
	private Integer timeoutInSeconds;

	@NotNull
	@Size(min=1, max=3)
	private List<String> allowedGroups;

	public Integer getTimeoutInSeconds()
	{
		return timeoutInSeconds;
	}

	public void setTimeoutInSeconds(Integer timeoutInSeconds)
	{
		this.timeoutInSeconds = timeoutInSeconds;
	}

	public List<String> getAllowedGroups()
	{
		return allowedGroups;
	}

	public void setAllowedGroups(List<String> allowedGroups)
	{
		this.allowedGroups = allowedGroups;
	}

	@Override
	public String toString()
	{
		return "Module1ConfigBean{" +
				"timeoutInSeconds=" + timeoutInSeconds +
				", allowedGroups=" + allowedGroups +
				'}';
	}
}
