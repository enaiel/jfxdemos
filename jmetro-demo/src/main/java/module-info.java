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
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.swing;
    requires javafx.graphics;

    requires java.logging;

    requires org.controlsfx.controls;

    requires org.jfxtras.styles.jmetro;

    exports jfxtras.styles.samples.jmetro to javafx.graphics;
    exports jfxtras.styles.samples.jmetro.themetester to javafx.graphics;

    exports com.micronarts.jfxdemos;
}