/*
 * Copyright 2010 the original author or authors.
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

package org.gradle.api.internal.tasks.testing;

public class DefaultTestClassDescriptor extends DefaultTestSuiteDescriptor {

    public DefaultTestClassDescriptor(Object id, String className) {
        this(id, className, className);
    }

    public DefaultTestClassDescriptor(Object id, String className, String classDisplayName) {
        super(id, className, classDisplayName);
    }

    @Override
    public String getClassName() {
        return getName();
    }

    @Override
    public String getClassDisplayName() {
        return getDisplayName();
    }

    @Override
    public String toString() {
        return "Test class " + getClassName();
    }
}
