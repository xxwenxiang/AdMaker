/**
 * Copyright 2013 Florian Schmaus
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ekuater.admaker.encoder;

/**
 * @author Florian Schmaus
 */
public interface StringEncoder {
    /**
     * Encodes an string to another representation
     *
     * @param string string to be encoded
     * @return the encoded String
     */
    String encode(String string);

    /**
     * Decodes an string back to it's initial representation
     *
     * @param string string to bo decoded
     * @return the decoded String
     */
    String decode(String string);
}
