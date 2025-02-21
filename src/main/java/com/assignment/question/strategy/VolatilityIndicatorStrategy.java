package com.assignment.question.strategy;

import com.assignment.question.Stock;
import com.assignment.question.TradingIndicatorStrategy;
import com.assignment.question.TradingStrategyType;

// Part 2.3: Implement TradingIndicatorStrategy
public class VolatilityIndicatorStrategy implements TradingIndicatorStrategy {

    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.VOLATILITY;
    }

    @Override
    public Double calculateIndicator(Stock stock) {
        return Math.abs(stock.getPrice() - stock.getPreviousPrice());
    }
    
}
