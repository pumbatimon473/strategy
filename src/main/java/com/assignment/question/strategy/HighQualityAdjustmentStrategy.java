package com.assignment.question.strategy;

import com.assignment.question.QualityAdjustmentStrategy;
import com.assignment.question.Video;
import com.assignment.question.VideoCodec;
import com.assignment.question.VideoQuality;

// Part 2.3: Implement QualityAdjustmentStrategy interface - Concrete Strategy
public class HighQualityAdjustmentStrategy implements QualityAdjustmentStrategy {

    @Override
    public VideoQuality supportsType() {
        return VideoQuality.HIGH;
    }

    @Override
    public Video adjust(Video video) {
        video.setCodec(VideoCodec.VP9);
        video.setBitrate(2000);
        return video;
    }
    
}
