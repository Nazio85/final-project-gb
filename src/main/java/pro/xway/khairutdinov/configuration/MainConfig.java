package pro.xway.khairutdinov.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class MainConfig extends WebSecurityConfigurerAdapter {
    public static final String USER = "USER";
    public static final String ADMIN = "ADMIN";


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();

        http.authorizeRequests()
                .antMatchers("/", "/css/**", "/images/**", "/js/**", "**.js",
                        "/bootstrap/**", "/icons/**", "/login", "/login/**").permitAll()
                .antMatchers("/profile/**").authenticated()
                .antMatchers("/pro/**").hasRole(ADMIN)
//                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .successForwardUrl("/profile")
                .failureForwardUrl("/login")
                .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .permitAll();

    }
}
