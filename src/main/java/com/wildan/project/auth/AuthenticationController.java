package com.wildan.project.auth;


import com.wildan.project.constant.AuthUtils;
import com.wildan.project.constant.AuthenticationConstant;
import com.wildan.project.dto.ResponseDto;
import com.wildan.project.dto.UserDto;
import com.wildan.project.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    private final AuthUtils authUtils;

    @PostMapping("/register")
    public ResponseEntity<ResponseDto> register(@RequestBody RegisterRequest request){
        AuthenticationResponse response = authenticationService.register(request);
        return ResponseEntity.ok(ResponseDto.builder()
                        .statusCode(AuthenticationConstant.HTTP_OK_200)
                        .statusMessage(AuthenticationConstant.USER_REGISTERED_SUCCESS)
                        .data(response)
                .build());

    }

    @PostMapping("/login")
    public ResponseEntity<ResponseDto> login(@RequestBody AuthenticationRequest request){
        AuthenticationResponse response = authenticationService.authenticate(request);
        return ResponseEntity.ok(ResponseDto.builder()
                .statusCode(AuthenticationConstant.HTTP_OK_200)
                .statusMessage(AuthenticationConstant.USER_REGISTERED_SUCCESS)
                .data(response)
                .build());

    }


    @GetMapping("/user")
    public ResponseEntity<ResponseDto> getUser(){
        User user = authUtils.loggedInUser();
        UserDto userDto = UserDto.builder()
                .userId(user.getUserId())
                .email(user.getEmail())
                .name(user.getFirstName() + " " + user.getLastName())
                .
                build();
        return ResponseEntity.ok(ResponseDto.builder()
                .statusCode(AuthenticationConstant.HTTP_OK_200)
                .statusMessage(AuthenticationConstant.USER_FOUND)
                .data(userDto)
                .build());
    }
}
