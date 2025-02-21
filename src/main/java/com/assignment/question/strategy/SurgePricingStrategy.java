package com.assignment.question.strategy;

import com.assignment.question.PricingStrategy;
import com.assignment.question.PricingType;
import com.assignment.question.RideDetails;

// Part 2.3: Implement PricingStrategy
public class SurgePricingStrategy implements PricingStrategy {

    @Override
    public PricingType supportsType() {
        return PricingType.SURGE;
    }

    @Override
    public Double calculatePrice(RideDetails ride) {
        return SurgePricingStrategy.SURGE_MULTIPLIER * SurgePricingStrategy.BASE_FARE;
    }
    
}
