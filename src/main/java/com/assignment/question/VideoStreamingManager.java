package com.assignment.question;

import com.assignment.question.factory.QualityAdjustmentStrategyFactory;

// Part 3: Refactor VidoeStreamingManager - Implement Strategy Design Pattern
public class VideoStreamingManager {
    private Video video;
    private QualityAdjustmentStrategy qualityAdjustmentStrategy;

    public VideoStreamingManager(Video video, QualityAdjustmentStrategy qualityAdjustmentStrategy) {
        this.video = video;
        // this.qualityAdjustmentStrategy = QualityAdjustmentStrategyFactory.getStrategy(video.getVideoQuality());
        this.qualityAdjustmentStrategy = qualityAdjustmentStrategy;
    }

    public Video streamVideo() {
        /* Old Code Block
        switch (video.getVideoQuality()) {
            case LOW:
                video.setCodec(VideoCodec.H264);
                video.setBitrate(500);
                return video;
            case MEDIUM:
                video.setCodec(VideoCodec.H265);
                video.setBitrate(1000);
                return video;
            case HIGH:
                video.setCodec(VideoCodec.VP9);
                video.setBitrate(2000);
                return video;
        }

        throw new IllegalArgumentException("Unsupported video quality!");
        */

        return this.qualityAdjustmentStrategy.adjust(this.video);
    }
}