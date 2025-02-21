package com.assignment.question.strategy;

import com.assignment.question.PricingStrategy;
import com.assignment.question.PricingType;
import com.assignment.question.RideDetails;

// Part 2.1: Implement PricingStrategy
public class DistanceBasedPricingStrategy implements PricingStrategy {

    @Override
    public PricingType supportsType() {
        return PricingType.DISTANCE_BASED;
    }

    @Override
    public Double calculatePrice(RideDetails ride) {
        return DistanceBasedPricingStrategy.BASE_FARE + ride.getDistance() * DistanceBasedPricingStrategy.PER_KILOMETER_RATE;
    }
    
}
