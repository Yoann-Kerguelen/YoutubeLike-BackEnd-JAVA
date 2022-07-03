package fr.yo.youtube.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.stereotype.Service;

import fr.yo.youtube.bll.DAOManager;
import fr.yo.youtube.entities.Youtuber;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	DAOManager daoManager;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		final Youtuber youtuber = daoManager.getYoutuberManager().getYoutuberByEmail(email);
		
		if (youtuber == null) {
			throw new UsernameNotFoundException(email);
		}
		 
		if (youtuber.isAdmin()) {
			return User
					.withUsername(youtuber.getEmail())
					.password(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode(youtuber.getPassword()))
					//.password("{noop}" + youtuber.getPassword())
					.roles("ADMIN", "USER")
					.build();
		} else {
			return User
					.withUsername(youtuber.getEmail())
					.password(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode(youtuber.getPassword()))
					//.password("{noop}" + youtuber.getPassword())
					.roles("USER")
					.build();
		}
	}
}