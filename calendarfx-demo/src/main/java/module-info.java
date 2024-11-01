/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright (c) 2024 enaiel.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

open module com.micronarts.jfxdemos {
    requires transitive javafx.graphics;
    requires fr.brouillard.oss.cssfx;
    requires transitive javafx.controls;
    requires transitive com.calendarfx.view;

    exports com.calendarfx.app;
    exports com.micronarts.jfxdemos;
}