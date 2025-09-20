package com.example.Backend.Models;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;



@Data
@NoArgsConstructor
@SuperBuilder
@Builder
@Entity
@Table(name="user")
public class User implements UserDetails {
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   private Long id;
	   @Column(length = 20)
	   private String firstName;
	   @Column(length = 20)
	   private String lastName;
	   @Column(unique = true)
	   private String email;
	   @Column
	   private String password;
	   @Column

	   private String adress;
	   @Column
	   private String phone;

	    @Builder.Default
	    private boolean enabled = false;
		 @ManyToMany(fetch =FetchType.EAGER)
		   private List<Role> roles;
		  @OneToMany(mappedBy ="user",cascade = CascadeType.ALL)

		     private List<Token> tokens;
	      @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
		    private VerificationToken verificationToken;
		@Override
		   public Collection<? extends GrantedAuthority> getAuthorities() {
		       return this.roles
		               .stream()
		               .map(role -> new SimpleGrantedAuthority(role.getName()))
		               .collect(Collectors.toList());
		   }
	

		  @Override
		   public String getPassword() {
		      return password;
		   }


		   @Override
		   public String getUsername() {
		      return email;
		   }
		   
		   @Override
		   public boolean isAccountNonExpired() { //return oui si le compte exist toujours 
		      return true;
		   }


		   @Override
		   public boolean isAccountNonLocked() {
		      return true;
		   }


		   @Override
		   public boolean isCredentialsNonExpired() { // return oui si le mot de passe toujours valide
		      return true;
		   }


		   @Override
		   public boolean isEnabled() { // return oui si le compte est toujours active 
		      return enabled;
		   }

}
