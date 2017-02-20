/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.bangla;

/**
 * Base Word Class
 */
public class Word {

    /** String resource ID for the english translation of the word */
    private int englishTranslationId;

    /** String resource ID for the bangla translation of the word */
    private int banglaTranslationId;

    /** Audio resource ID for the word */
    private int bAudioResourceId;

    /** Image resource ID for the word */
    private int bImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object only for Phrase Class
     */
    public Word(int defaultTranslationId, int miwokTranslationId, int audioResourceId) {
        englishTranslationId = defaultTranslationId;
        banglaTranslationId = miwokTranslationId;
        bAudioResourceId = audioResourceId;
    }

    /**
     * Create another new Word object. @override constructor for Number, Family & Color Class
     */
    public Word(int defaultTranslationId, int miwokTranslationId, int imageResourceId,
                int audioResourceId) {
        englishTranslationId = defaultTranslationId;
        banglaTranslationId = miwokTranslationId;
        bImageResourceId = imageResourceId;
        bAudioResourceId = audioResourceId;
    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getDefaultTranslationId() {
        return englishTranslationId;
    }

    /**
     * Get the string resource ID for the bangla translation of the word.
     */
    public int getMiwokTranslationId() {
        return banglaTranslationId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return bImageResourceId;
    }

    /**
     * Checking whether a class has Image or not. This check is mainly for Phrases Class
     */
    public boolean hasImage() {
        return bImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return bAudioResourceId;
    }
}