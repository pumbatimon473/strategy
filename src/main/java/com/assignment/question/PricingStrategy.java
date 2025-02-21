package com.assignment.question;

// Part 1: Define Strategy interface
public interface PricingStrategy {
    // declaring constants as interface variables (implicitly public static final)
    double BASE_FARE = 5.0; // Base fare amount
    double PER_KILOMETER_RATE = 2.0; // Rate per kilometer
    double PER_MINUTE_RATE = 0.5; // Rate per minute
    double SURGE_MULTIPLIER = 2.0; // Surge pricing multiplier

    PricingType supportsType();

    Double calculatePrice(RideDetails ride);
}