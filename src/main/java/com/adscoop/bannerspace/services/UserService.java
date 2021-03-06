package com.adscoop.bannerspace.services;

import com.adscoop.bannerspace.entites.UserNode;
import ratpack.exec.Promise;

import java.util.Optional;

/**
 * Created by kleistit on 21/02/2017.
 */
public interface UserService {

    Optional<UserNode> findUserByEmail(String email) throws Exception;

    Optional<UserNode> findUserbyBannerId(Long id) throws Exception;

    Promise<UserNode> findUserByToken(String token) throws Exception;

    void save(UserNode userNode) throws Exception;

}
