package com.kodilla.kodilla.patterns.strategy.social;

public final class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "This is a Twitter post";
    }
}
