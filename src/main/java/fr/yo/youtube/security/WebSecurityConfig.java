package fr.yo.youtube.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	@Autowired
	private CustomUserDetailService CustomUserDetailService;
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/admin").hasRole("ADMIN")
				//.antMatchers("/", "/index").hasRole("ADMIN", "USER")
				.antMatchers("/js/**", "/css/**", "/img/**", "/", "/index").permitAll()
				.anyRequest().authenticated()
				.and()
				.userDetailsService(CustomUserDetailService)
				.formLogin()
				//.loginPage("/login")
		        .usernameParameter("email")
		        .defaultSuccessUrl("/")
				.and()
				.logout()
				.logoutSuccessUrl("/").permitAll();

		return http.build();
	}

	/*@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		return (web) -> web.ignoring().antMatchers("/js/**", "/css/**", "/img/**");
	}*/
}