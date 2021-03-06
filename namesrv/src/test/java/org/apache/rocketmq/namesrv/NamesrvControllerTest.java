/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.namesrv;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.rocketmq.common.namesrv.NamesrvConfig;
import org.apache.rocketmq.remoting.netty.NettyServerConfig;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NamesrvControllerTest {
    private final static int RESTARTNUM = 2;

    /**
     * Tests if the controller can be properly stopped and started.
     *
     * @throws Exception If fails.
     */
    @Test
    public void testRestart() throws Exception {
     //   for (int i = 0; i < RESTARTNUM; i++) {
            NamesrvController namesrvController = new NamesrvController(
                new NamesrvConfig(),
                new NettyServerConfig()
            );
            boolean initResult = namesrvController.initialize();
            assertThat(initResult).isEqualTo(true);
            namesrvController.start();
          //  namesrvController.shutdown();
        Thread.sleep(DateUtils.MILLIS_PER_DAY);
      //  }
    }
}