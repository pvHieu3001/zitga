package com.bkap.api;

import com.bkap.dto.APIResponse;
import com.bkap.dto.PasswordDTO;
import com.bkap.dto.UserDTO;
import com.bkap.dto.VerificationTokenDTO;
import com.bkap.repositories.UserRepository;
import com.bkap.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

/**
 * Project-SemIV
 *
 * @author Tung lam
 * @created_at 22/07/2020 - 14:54
 * @created_by Tung lam
 * @since 22/07/2020
 */
@RestController
@RequestMapping("/api/users")
public class UserApi {

    @Autowired
    private UserService userService;


    @PostMapping("/changePassword")
    public void updateNewPassword(@RequestBody PasswordDTO passwordDTO) {
        userService.changePassword(passwordDTO);
    }
}
