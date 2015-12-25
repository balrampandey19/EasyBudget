/*
 *   Copyright 2015 Benoit LETONDOR
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.benoitletondor.easybudgetapp;

/**
 * Static class that references public versions of the app
 *
 * @author Benoit LETONDOR
 */
public class BuildVersion
{
    /**
     * First public release.
     * 02/12/2015
     */
    public final static int VERSION_1 = 20;
    /**
     * Add proguard minify and update dependencies.
     * 09/12/2015
     */
    public final static int VERSION_1_0_1 = 21;
    /**
     * Add a warning that decimal values are not supported by the app.
     * 14/12/2015
     */
    public final static int VERSION_1_0_2 = 22;
    /**
     * Translations & bug fixes.
     * 14/12/2015
     */
    public final static int VERSION_1_0_3 = 23;
    /**
     * Fix amount rounding & display. Add premium status in settings. Add opt-out from update pushes.
     * 23/12/2015
     */
    public final static int VERSION_1_1_3 = 28;
    /**
     * Add daily reminder pushes opt-out from settings & premium iAP.
     * TODO
     */
    public final static int VERSION_1_2 = 29;
}