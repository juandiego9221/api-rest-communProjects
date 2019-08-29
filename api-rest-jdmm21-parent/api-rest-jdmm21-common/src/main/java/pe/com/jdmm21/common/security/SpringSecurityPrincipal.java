package pe.com.jdmm21.common.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class SpringSecurityPrincipal extends User{

	private final String uuid;
	
	public SpringSecurityPrincipal(String username, String password, boolean enabled, 
			Collection<? extends GrantedAuthority> authorities,final String uuidToSet) {
		super(username, password, enabled, true, true, true, authorities);
		uuid = uuidToSet;
	}
	
	public final String getUuid() {
		return uuid;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
