package com.assignment.question;

// Part 3: Refactor StockTradingManager - use strategy design
public class StockTradingManager {
    /* Old Code Block
    private TradingStrategyType strategyType;

    public StockTradingManager(TradingStrategyType strategyType) {
        this.strategyType = strategyType;
    }

    public Double calculateIndicator(Stock stock) {
        switch (strategyType) {
            case MOVING_AVERAGES:
                return (stock.getPrice() + stock.getPreviousPrice()) / 2;
            case MOMENTUM:
                return stock.getPrice() - stock.getPreviousPrice();
            case VOLATILITY:
                return Math.abs(stock.getPrice() - stock.getPreviousPrice());
        }
        throw new RuntimeException("Invalid strategy type");
    }
    */

    private TradingIndicatorStrategy tradingIndicator;

    public StockTradingManager(TradingIndicatorStrategy tradingIndicator) {
        this.tradingIndicator = tradingIndicator;
    }

    public Double calculateIndicator(Stock stock) {
        return this.tradingIndicator.calculateIndicator(stock);
    }
}