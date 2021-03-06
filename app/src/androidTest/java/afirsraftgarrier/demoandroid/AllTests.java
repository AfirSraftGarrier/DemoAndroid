/*
 * Copyright (C) 2008 The Android Open Source Project
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

package afirsraftgarrier.demoandroid;

import junit.framework.Test;
import junit.framework.TestSuite;

import android.test.suitebuilder.TestSuiteBuilder;

/**
 * A test suite containing all tests for ApiDemos.
 *
 * To run all suites found in this apk:
 * $ adb shell am instrument -w \
 *   afirsraftgarrier.demoandroid.androidapi.tests/android.test.InstrumentationTestRunner
 *
 * To run just this suite from the command line:
 * $ adb shell am instrument -w \
 *   -e class afirsraftgarrier.demoandroid.androidapi.AllTests \
 *   afirsraftgarrier.demoandroid.androidapi.tests/android.test.InstrumentationTestRunner
 *
 * To run an individual test case, e.g. {@link afirsraftgarrier.demoandroid.androidapi.os.MorseCodeConverterTest}:
 * $ adb shell am instrument -w \
 *   -e class afirsraftgarrier.demoandroid.androidapi.os.MorseCodeConverterTest \
 *   afirsraftgarrier.demoandroid.androidapi.tests/android.test.InstrumentationTestRunner
 *
 * To run an individual test, e.g. {@link afirsraftgarrier.demoandroid.androidapi.os.MorseCodeConverterTest#testCharacterS()}:
 * $ adb shell am instrument -w \
 *   -e class afirsraftgarrier.demoandroid.androidapi.os.MorseCodeConverterTest#testCharacterS \
 *   afirsraftgarrier.demoandroid.androidapi.tests/android.test.InstrumentationTestRunner
 */
public class AllTests extends TestSuite {

    public static Test suite() {
        return new TestSuiteBuilder(AllTests.class)
                .includeAllPackagesUnderHere()
                .build();
    }
}
