package com.assignment.question.strategy;

import com.assignment.question.QualityAdjustmentStrategy;
import com.assignment.question.Video;
import com.assignment.question.VideoCodec;
import com.assignment.question.VideoQuality;

// Part 2.2: Implement QualityAdjustmentStrategy - Concrete Strategy
public class MediumQualityAdjustmentStrategy implements QualityAdjustmentStrategy {

    @Override
    public VideoQuality supportsType() {
        return VideoQuality.MEDIUM;
    }

    @Override
    public Video adjust(Video video) {
        video.setCodec(VideoCodec.H265);
        video.setBitrate(1000);
        return video;
    }
    
}
