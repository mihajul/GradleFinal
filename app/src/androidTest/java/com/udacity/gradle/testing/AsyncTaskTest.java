package com.udacity.gradle.testing;

import android.app.Activity;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    @Test
    public void verifyAsyncTask() {
            String result = null;
            try {
                result = new EndpointsAsyncTask().execute((Activity) null).get();
            }catch(Exception ex) {
                Assert.fail(ex.getMessage());
            }
            Assert.assertFalse(TextUtils.isEmpty(result));
    }
}
