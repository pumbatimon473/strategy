package com.assignment.question.strategy;

import com.assignment.question.QualityAdjustmentStrategy;
import com.assignment.question.Video;
import com.assignment.question.VideoCodec;
import com.assignment.question.VideoQuality;

// Part 2.1: Implement QualityAdjustmentStrategy - Concrete Strategy
public class LowQualityAdjustmentStrategy implements QualityAdjustmentStrategy {

    @Override
    public VideoQuality supportsType() {
        return VideoQuality.LOW;
    }

    @Override
    public Video adjust(Video video) {
        video.setCodec(VideoCodec.H264);
        video.setBitrate(500);
        return video;
    }
    
}
