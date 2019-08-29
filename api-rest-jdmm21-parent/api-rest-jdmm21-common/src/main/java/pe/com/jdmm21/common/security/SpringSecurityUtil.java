package pe.com.jdmm21.common.security;

import org.springframework.security.access.intercept.RunAsUserToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

import com.google.common.collect.Lists;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

public class SpringSecurityUtil {

	public static final String ANONYMOUS_USER = "anonymoususer";
	public static final String SEC_CLIENT = "sec_client";

	private SpringSecurityUtil() {
		throw new AssertionError();
	}

	public static User authenticate(final String key, final String uuid) {
		final SpringSecurityPrincipal principal = new SpringSecurityPrincipal(randomAlphabetic(6), randomAlphabetic(6),
				true, Lists.<GrantedAuthority>newArrayList(), uuid);
		SecurityContextHolder.getContext().setAuthentication(new RunAsUserToken(key, principal, null, Lists.<GrantedAuthority> newArrayList(), null));;
		return principal;
	}

}
