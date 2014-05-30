/**
 * 
 */
package org.springframework.security.openid.connect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

/**
 * Filter which processes authentication requests accoring to OpenID Connect standard.
 * 
 * The OpenID Connect autgentication involves two stages
 * 
 * <h1>Selecting the OpenID Connect provider</h1>
 * The OpenID Connect specifcation leverages OAuth2 for restricting the access to the user identifier.
 * Therefore an individual OAuth2 configuration must be used for each OpenID Connect provivder in use.
 * The OpenID Connect provider is chosen by passing the symbolic provider name in the <code>openid_connect_provider</code>
 * form field of a POST request. The POST request is initiated by the login form. The submitted form may also contain a
 * <code>login_hint</code> field which is transparently passed on to the OpenID Connect provider
 * 
 * @author Rainer Bieniek (Rainer.Bieniek@vodafone.com)
 *
 */
public class OpenIDConnectAuthenticationFilter extends AbstractAuthenticationProcessingFilter {

	public OpenIDConnectAuthenticationFilter() {
		super("/j_spring_openid_connect_security_check");
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request,
			HttpServletResponse response) throws AuthenticationException,
			IOException, ServletException {
		// TODO Auto-generated method stub
		return null;
	}

}
