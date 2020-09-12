package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import android.text.TextUtils;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

// This test is to check the Async task successfully retrieves a non-empty string
@RunWith(AndroidJUnit4.class)
public class EndPointAsyncTaskTest {

    private String result = "";

    @Test
    public void jokeIsNotEmptyTest() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);

        new EndPointsAsyncTask(new EndPointsResultInterface() {
            @Override
            public void endpointsResult(String joke) {
                result = joke;
                countDownLatch.countDown();
            }
        }).execute();

        try {
            countDownLatch.await();
            assertFalse("joke is empty", TextUtils.isEmpty(result));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
