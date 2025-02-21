package com.assignment.question;

// Part 1: Define Strategy interface
public interface TradingIndicatorStrategy {
    TradingStrategyType supportsType();

    Double calculateIndicator(Stock stock);
}