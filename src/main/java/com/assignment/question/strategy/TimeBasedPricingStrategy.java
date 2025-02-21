package com.assignment.question.strategy;

import com.assignment.question.PricingStrategy;
import com.assignment.question.PricingType;
import com.assignment.question.RideDetails;

// Part 2.2: Implement PricingStrategy
public class TimeBasedPricingStrategy implements PricingStrategy {

    @Override
    public PricingType supportsType() {
        return PricingType.TIME_BASED;
    }

    @Override
    public Double calculatePrice(RideDetails ride) {
        return TimeBasedPricingStrategy.BASE_FARE + ride.getDuration() * TimeBasedPricingStrategy.PER_MINUTE_RATE;
    }
    
}
