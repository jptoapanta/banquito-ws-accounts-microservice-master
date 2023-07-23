package ec.edu.espe.banquito.accounts.controller;

import ec.edu.espe.banquito.accounts.controller.res.AccountResDto;
import ec.edu.espe.banquito.accounts.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/accounts")
public class AccountController {
    private final AccountService accountService;

    @GetMapping("/accounts-client/{clientUK}")
    public ResponseEntity<List<AccountResDto>> findAccountsValidByClientUK(
            @PathVariable("clientUK") String clientUK
    ){
        return ResponseEntity.ok(accountService.findAccountsByClientUK(clientUK));
    }

}
