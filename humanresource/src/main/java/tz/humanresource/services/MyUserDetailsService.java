package tz.humanresource.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import tz.humanresource.Dao.LoginDao;
import tz.humanresource.model.Userroles;
//import tz.humanresource.model.Users;

@Component
public class MyUserDetailsService implements UserDetailsService {
	
	//get user from the database, via Hibernate
		@Autowired
		private LoginDao userDao;

		
		
		public UserDetails loadUserByUsername(final String username)throws UsernameNotFoundException 
		{
		
			tz.humanresource.model.User user = userDao.findByUsername(username);
			
			
			
			Set<Userroles> u = user.getUserroles();
			
			List<GrantedAuthority> authorities = buildUserAuthority(u);
			
			

			return buildUserForAuthentication(user,authorities);
			
		}

		// Converts com.mkyong.users.model.User user to
		// org.springframework.security.core.userdetails.User
		private User buildUserForAuthentication(tz.humanresource.model.User user, List<GrantedAuthority> authorities) {
			return new User(user.getUsername(), user.getPassword(), user.isEnabled(),false, false, false, authorities);
		}

		private List<GrantedAuthority> buildUserAuthority(Set<Userroles> u) {

			Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
			
			// Build user's authorities
			for (Userroles userroles : u) {
				setAuths.add(new SimpleGrantedAuthority(userroles.getRole()));
			}

			List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);

			return Result;

}
}
