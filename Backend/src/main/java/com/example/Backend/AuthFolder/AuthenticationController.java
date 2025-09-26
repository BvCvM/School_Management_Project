package com.example.Backend.AuthFolder;
import jakarta.validation.Valid;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.Dto.AdministrateurDto;
import com.example.Backend.Dto.EleveDto;
import com.example.Backend.Dto.ProfesseurDto;
import com.example.Backend.Dto.UserBaseDto;
import com.example.Backend.Services.UserService;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
	
	  private final AuthenticationService service;
	  private final UserService userService;
	  @PostMapping("/register")
	  public ResponseEntity<Response> register(
	          @RequestBody @Valid UserBaseDto userRequest,
	          HttpServletRequest request
	  )  {
	    return service.register(userRequest,request);
	  }
	  @PostMapping("/registerelve")
	  public ResponseEntity<Response> registerelve(
	          @RequestBody @Valid EleveDto userRequest,
	          HttpServletRequest request
	  )  {
	    return service.register(userRequest,request);
	  }
	  
	  @PostMapping("/registerprofesseur")
	  public ResponseEntity<Response> registerprofesseur(
	          @RequestBody @Valid ProfesseurDto userRequest,
	          HttpServletRequest request
	  )  {
	    return service.register(userRequest,request);
	  }
	  
	
	  
	  @PostMapping("/registeradmin")
	  public ResponseEntity<Response> registeradmin(
	          @RequestBody @Valid AdministrateurDto userRequest,
	          HttpServletRequest request
	  )  {
	    return service.register(userRequest,request);
	  }
	  
	  @PostMapping("/authenticate")
	  public ResponseEntity<AuthenticationResponse> authenticate(
	      @RequestBody AuthenticationRequest request
	  ) {
	    return ResponseEntity.ok(service.authenticate(request));
	  }
	  @PostMapping("/refresh-token")
	  public void refreshToken(
	      HttpServletRequest request,
	      HttpServletResponse response
	  ) throws IOException {
	    service.refreshToken(request, response);
	  }

	

}
