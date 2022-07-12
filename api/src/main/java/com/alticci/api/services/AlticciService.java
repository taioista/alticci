package com.alticci.api.services;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.cache.CacheResult;

@ApplicationScoped
public class AlticciService {

    @CacheResult(cacheName = "alticci-cache")
    public Long applyAlticci(Long number) {
        if(number <= 0) {
            return 0L;
        }

        if(number > 0 && number < 3) {
            return 1L;
        }
        return applyAlticci(number - 3) + applyAlticci(number - 2);
    }
}
