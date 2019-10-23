/*
 * Copyright (c) 2016—2019 Andrei Tomashpolskiy and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package bt.net.buffer;

import java.nio.ByteBuffer;

public class BufferedData {

    private final ByteBuffer buffer;
    private final int length;
    private volatile boolean disposed;

    public BufferedData(ByteBuffer buffer) {
        this.buffer = buffer;
        this.length = buffer.remaining();
    }

    public ByteBuffer buffer() {
        return buffer;
    }

    public int length() {
        return length;
    }

    public void dispose() {
        disposed = true;
    }

    public boolean isDisposed() {
        return disposed;
    }
}
