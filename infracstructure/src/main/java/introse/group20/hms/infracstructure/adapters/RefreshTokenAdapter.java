package introse.group20.hms.infracstructure.adapters;

import introse.group20.hms.application.adapters.IRefreshTokenAdapter;
import introse.group20.hms.core.entities.RefreshToken;
import introse.group20.hms.infracstructure.models.RefreshTokenModel;
import introse.group20.hms.infracstructure.repositories.IRefreshTokenRepository;
import introse.group20.hms.infracstructure.repositories.IUserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;
@Component
public class RefreshTokenAdapter implements IRefreshTokenAdapter {
    @Autowired
    IRefreshTokenRepository refreshTokenRepository;
    @Autowired
    IUserRepository userRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public Optional<RefreshToken> findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByToken(refreshToken)
                .map(refreshTokenModel -> modelMapper.map(refreshTokenModel, RefreshToken.class));
    }

    @Override
    public void addRefreshToken(UUID userId, RefreshToken refreshToken) {
        RefreshTokenModel refreshTokenModel = modelMapper.map(refreshToken, RefreshTokenModel.class);
        refreshTokenModel.setUserModel(userRepository.findById(userId).get());
        refreshTokenRepository.save(refreshTokenModel);
    }

    @Override
    public void deleteByUserId(UUID userId) {
        refreshTokenRepository.deleteByUserId(userId);
    }

    @Override
    public void deleteRefreshToken(RefreshToken refreshToken) {
        RefreshTokenModel refreshTokenModel = modelMapper.map(refreshToken, RefreshTokenModel.class);
        refreshTokenRepository.delete(refreshTokenModel);
    }
}
