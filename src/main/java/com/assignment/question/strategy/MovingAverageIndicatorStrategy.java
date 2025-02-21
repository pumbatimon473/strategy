package com.assignment.question.strategy;

import com.assignment.question.Stock;
import com.assignment.question.TradingIndicatorStrategy;
import com.assignment.question.TradingStrategyType;

// Part 2.1: Implement TradingIndicatorStrategy
public class MovingAverageIndicatorStrategy implements TradingIndicatorStrategy {

    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.MOVING_AVERAGES;
    }

    @Override
    public Double calculateIndicator(Stock stock) {
        return (stock.getPrice() + stock.getPreviousPrice()) / 2;
    }
    
}
