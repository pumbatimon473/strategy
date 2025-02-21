package com.assignment.question;

public class StockTradingManager {

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
}