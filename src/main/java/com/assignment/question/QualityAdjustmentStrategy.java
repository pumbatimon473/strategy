package com.assignment.question;

// Part 1: Define Strategy interface
public interface QualityAdjustmentStrategy {
    VideoQuality supportsType();

    Video adjust(Video video);
}