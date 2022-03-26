package com.orhanboz.awsimageupload.registration.token;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {
    private final ConfirmationTokenRepository confirmationTokenRepository;

    public void saveConfirmationToken(ConfirmationToken confirmationToken){
    confirmationTokenRepository.save(confirmationToken);
    }
    public Optional<ConfirmationToken> getToken(String token){
        Optional<ConfirmationToken> confirmationToken = confirmationTokenRepository.findByToken(token);
            return confirmationToken;

    }

    public void setConfirmedAt(ConfirmationToken token) {
        token.setConfirmedTime(LocalDateTime.now());
    }
}
