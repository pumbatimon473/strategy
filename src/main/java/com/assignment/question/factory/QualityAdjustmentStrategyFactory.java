package com.assignment.question.factory;

import com.assignment.question.QualityAdjustmentStrategy;
import com.assignment.question.VideoQuality;
import com.assignment.question.strategy.HighQualityAdjustmentStrategy;
import com.assignment.question.strategy.LowQualityAdjustmentStrategy;
import com.assignment.question.strategy.MediumQualityAdjustmentStrategy;

// Part 4: Define Factory for QualityAdjustmentStrategy
public class QualityAdjustmentStrategyFactory {
    public static QualityAdjustmentStrategy getStrategy(VideoQuality videoQuality) {
        switch (videoQuality) {
            case LOW:
                return new LowQualityAdjustmentStrategy();
            case MEDIUM:
                return new MediumQualityAdjustmentStrategy();
            case HIGH:
                return new HighQualityAdjustmentStrategy();
            default:
                throw new IllegalArgumentException("Unsupported video quality!");
        }
    }
}
