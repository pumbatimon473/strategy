package com.assignment.question.strategy;

import com.assignment.question.Stock;
import com.assignment.question.TradingIndicatorStrategy;
import com.assignment.question.TradingStrategyType;

// Part 2.2: Implement TradingIndicatorStrategy
public class MomentumIndicatorStrategy implements TradingIndicatorStrategy {

    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.MOMENTUM;
    }

    @Override
    public Double calculateIndicator(Stock stock) {
        return stock.getPrice() - stock.getPreviousPrice();
    }
    
}
